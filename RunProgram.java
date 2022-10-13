/*
*  This program splits user input and finds
*  the longest run of one character.
*
* @author  Sydney Kuhn
* @version 1.0
* @since   2022-10-12
*/

import java.util.Scanner;

/**
 * This is a the maxRun program.
 */
final class RunProgram {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private RunProgram() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting maxRun() function.
    *
    * @param userInput is the string the user inputted.
    * @return runLength is the length of the longest run.
    */

    public static int maxRun(String userInput) {
        // Variables.
        int value = 1;
        int runLength = 1;
        final int length = userInput.length() - 1;

        for (int counter = 0; counter < length;) {
            if (userInput.charAt(counter) == userInput.charAt(counter + 1)) {
                value += 1;
            } else {
                if (value > runLength) {
                    runLength = value;
                    value = 1;
                }
            }
            counter += 1;
        }
        if (value > runLength) {
            runLength = value;
            value = 1;
        }

        return runLength;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {

        // Input
        System.out.println("Assignment 2");
        System.out.println("This program calculates the length "
                        + "of the largest run in a string.");
        // Scanner
        final Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a string : ");
        final String userInput = myObj.nextLine();

        // Process
        final int runLength = maxRun(userInput);

        // Output
        System.out.println("The longest run in the string " + userInput
                        + " consists of " + runLength + " characters.");
        System.out.println("\nDone.");

    }
}
