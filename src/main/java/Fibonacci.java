import static java.lang.System.out;

public final class Fibonacci {

    private Fibonacci() {
        throw new AssertionError("Instantiating utility class.");

    }


    /**
     * Method to return correct ordinal number suffix
     *
     * @param n = String value entered by user
     * @return returns correct ordinal suffix for n value entered by user
     */
    static String getOrdinal(String n) {

        // Condition to check if n is in range 10 - 19
        if (n.length() > 1 && n.charAt(n.length() - 2) == '1') {
            return "th";
        }

        // Switch case to return appropriate suffix depending on final number in n
        return switch (n.charAt(n.length() - 1)) {
            case '1' -> "st";
            case '2' -> "nd";
            case '3' -> "rd";
            default -> "th";
        };
    }


    /**
     * Recursive fibonacci method that returns value at nth term in the sequence
     *
     * @param n = Value entered by user
     * @return the nth value in fibonacci sequence entered by user
     */
    static int fibonacci(int n) {
        // Base case to return if value is less than 1
        if (n <= 1) return n;

        // Return the recursive call for the previous two values in the sequence
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Prints fibonacci sequence up until value entered by user
     *
     * @param n = Value entered by user
     */
    static void printFibonacci(int n) {
        out.print("Fibonacci Sequence: ");
        for (int i = 0; i <= n; i++) {
            out.print(fibonacci(i) + " ");
        }
    }

}


