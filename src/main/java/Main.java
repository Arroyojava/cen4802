import Fibonacci.Fibonacci;
import Fibonacci.FibonacciException;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    /**
     * Main method that takes a user entered value as an index in the fibonacci sequence and returns the value
     *
     * @param args an array of command-line arguments for the application
     */
    public static void main(String[] args) {

        // Scanner Object
        Scanner scanner = new Scanner(System.in);


        // Initial while loop initiator
        boolean run = true;

        while (run) {

            // User Input
            out.println("Nth term in Fibonacci.Fibonacci Sequence");
            out.println("Please enter an integer: ");
            String input = scanner.next();

            try {

                // Parse input string into integer and verify input is an integer
                int n = Integer.parseInt(input);

                // Call fibonacci method to return value at given term in sequence
                int nthNumber = Fibonacci.fibonacci(n);

                // Print Fibonacci.Fibonacci sequence until nth term
                Fibonacci.printFibonacci(n);

                // String containing ordinal number and value at fib sequence
                String output = "\nThe %s%s term of the Fibonacci.Fibonacci sequence is %s."
                        .formatted(n, Fibonacci.getOrdinal(input), nthNumber);
                out.println(output);

            } catch (FibonacciException | NumberFormatException ex) {
                if (ex.getMessage().contains("For")) {
                    out.println("Error: Input cannot be a letter or special character.");
                } else {
                    out.println("Error: " + ex.getMessage());
                }

            } finally {

                // Conditional to check if user wants to run program again / continue while loop
                out.println("Check another term? (y/n)");
                String check = scanner.next();
                if (check.toLowerCase().charAt(0) == 'n') {
                    run = false;
                }

                // Terminal buffer
                out.println();

            }


        }


    }

}