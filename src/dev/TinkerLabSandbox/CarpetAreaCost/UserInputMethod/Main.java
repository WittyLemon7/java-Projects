package dev.TinkerLabSandbox.CarpetAreaCost.UserInputMethod;


/* This main class is used to test the carpet cost per area calculation
 * using the scanner class to get user input for the area and cost per square meter.
 * The program calculates the total cost based on the user input.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Carpet Area & Cost Calculation Program ---");
        Scanner scanner = new Scanner(System.in);

        // --- Step 1: Get Floor Dimensions and Create Floor2 Object ---
        Floor2 floor = null;// Initialize floor to null to enter the loop
        while (floor == null) {// Loop until a valid Floor2 object is created
            // Prompt user for floor dimensions
            try {// Using try-catch to handle potential input errors
                System.out.print("Enter the length of the floor in meters: ");
                double userLength = scanner.nextDouble();

                System.out.print("Enter the width of the floor in meters: ");
                double userWidth = scanner.nextDouble();

                // Attempt to create Floor2 object (constructor validates positivity)
                floor = new Floor2(userLength, userWidth);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a numeric value for length and width.");
                scanner.next(); // Consume the invalid input to prevent an infinite loop
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + " Please try again.");
            }
        }

        // --- Step 2: Get Carpet Cost per Square Meter and Create Carpet2 Object ---
        Carpet2 carpet = null;// Initialize carpet to null to enter the loop
        while (carpet == null) {
            try {
                System.out.print("Enter the cost per square meter of carpet ($): ");
                double userCostPerSquareMeter = scanner.nextDouble();

                // Attempt to create Carpet2 object (constructor validates positivity)
                carpet = new Carpet2(userCostPerSquareMeter);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a numeric value for cost.");
                scanner.next(); // Consume the invalid input
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + " Please try again.");
            }
        }

        // --- Step 3: Create Calculation Object and Get Total Cost ---
        // This constructor also has validation for non-null and positive values
        Calculation calculation = null;
        try {
            calculation = new Calculation(floor, carpet);
            double totalCost = calculation.getTotalCost();

            // --- Step 4: Display Results ---
            System.out.printf("%nFloor details: %s%n", floor.toString()); // Using toString from Floor2
            System.out.printf("Area of carpet required: %.2f square meters%n", floor.getArea());
            System.out.printf("Cost per square meter: $%.2f%n", carpet.getCostPerSquareMeter());
            System.out.printf("Total cost of the carpet is: $%.2f%n", totalCost);
        } catch (IllegalArgumentException e) {
            System.out.println("A final error occurred during calculation setup: " + e.getMessage());
        }


        // Close the scanner to prevent resource leaks
        scanner.close();
        System.out.println("\n--- Program finished ---");
    }
}
