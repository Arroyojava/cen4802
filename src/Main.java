import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        // Scanner Object
        Scanner input = new Scanner(System.in);

        // Initial while loop initiator
        boolean run = true;

        while (run) {
            // User Input
            out.println("Nth term in Fibonacci Sequence");
            out.println("Please enter an integer: ");
            String n = input.next();

            // Call fibonacci method to return value at given term in sequence
            int nthNumber = fibonacci(Integer.parseInt(n));

            // Print Fibonacci sequence until nth term
            printFibonacci(Integer.parseInt(n));

            // String containing ordinal number and value at fib sequence
            String output = "\nThe %s%s term of the Fibonacci sequence is %s.".formatted(n, getOrdinal(n), nthNumber);
            out.println(output);

            // Conditional to check if user wants to run program again / continue while loop
            out.println("Check another term? (y/n)");
            String check = input.next();
            if (check.toLowerCase().charAt(0) == 'n') {
                run = false;
            }

            // Terminal buffer
            out.println();

        }


    }

    // Method to return correct ordinal number suffix
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

    // Recursive fibonacci method that returns value at nth term in the sequence
    static int fibonacci(int n) {
        // Base case to return if value is less than 1
        if (n <= 1) return n;

        // Return the recursive call for the previous two values in the sequence
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Print method
    static void printFibonacci(int n) {
        out.print("Fibonacci Sequence: ");
        for (int i = 0; i <= n; i++) {
            out.print(fibonacci(i) + " ");
        }
    }

}