import java.util.Scanner;
/**
* The program is about Einstein equation.
*
* @author Titwech Wal
* @version 1.0
* @since   2023-02-27
*/

public final class Einstein {

    /**
    * This is a private constructor used to satisfy
    * the style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private Einstein() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * This is the main method.
    *
    * @param args Unused.
    */
    public static void main(String[] args) {
        // Ask the user for mass
        System.out.println("Enter the mass of the object in Kg:");

        // Constants
        final double speedOfLight = 2.998 * (Math.pow(10, 8));

        // Using Scanner for getting input from user
        final Scanner scanner = new Scanner(System.in);
        final String massString = scanner.nextLine();

        try {
            // Convert the string to a double
            final double massDoub = Double.parseDouble(massString);

            // if radius is negative tell user
            if (massDoub > 0) {
                // Calculates and displays
                final double energy = massDoub * (Math.pow(speedOfLight, 2));

                System.out.print("The mass of " + massDoub + "kg");
                System.out.format(" would produce ");
                System.out.format("%.3e", energy);
                System.out.println("J of energy");

            } else {
                // if user enters non number
                System.out.println("Please enter a positive number");
            }

        } catch (NumberFormatException error) {
            System.out.println("Please enter valid input"
                + error.getMessage());
        }

        // Close scanner
        scanner.close();

    }
}
