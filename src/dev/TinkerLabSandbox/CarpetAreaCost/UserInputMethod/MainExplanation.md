
# 🚀 `Main.java` - Application Entry Point & User Interface

The `Main.java` class serves as the **entry point** and the **user interface (UI) layer** for the Carpet Area & Cost Calculation application. Its primary responsibilities include:

* **Orchestration:** Driving the overall flow of the program by coordinating interactions between the `Floor2`, `Carpet2`, and `Calculation` objects.
* **User Interaction:** Prompting the user for necessary input (floor dimensions, carpet cost) and displaying the final results.
* **Robust Input Handling:** Implementing mechanisms to validate user input and gracefully handle potential errors, preventing the program from crashing due to incorrect data.
* **Resource Management:** Ensuring that system resources (like the `Scanner` object) are properly closed after use.

## 👩‍💻 Code & Logic Explanation

```java
package dev.TinkerLabSandbox.CarpetAreaCost.UserInputMethod;

import java.util.InputMismatchException; // Needed for catching non-numeric input errors
import java.util.Scanner;              // Needed for reading user input from the console

public class Main {
    /**
     * The main method is the entry point of the Java application.
     * It orchestrates the user interaction, object creation, calculation, and result display.
     * @param args Command line arguments (not used in this application).
     */
    public static void main(String[] args) {

        System.out.println("--- Carpet Area & Cost Calculation Program ---"); // Welcoming message
        Scanner scanner = new Scanner(System.in); // Initialize a Scanner object to read input from the standard input stream (console)

        // Variables to temporarily hold user input before creating the domain objects (Floor2, Carpet2)
        double userLength = 0;
        double userWidth = 0;
        double userCostPerSquareMeter = 0;

        // --- Step 1: Get Floor Dimensions and Create Floor2 Object ---
        Floor2 floor = null; // Declare and initialize the Floor2 object reference to null.
                             // This will hold our valid Floor2 object once user input is successful.

        // Loop until a valid Floor2 object is successfully created
        while (floor == null) {
            try {
                // Prompt user for length and read their input
                System.out.print("Enter the length of the floor in meters: ");
                userLength = scanner.nextDouble();

                // Prompt user for width and read their input
                System.out.print("Enter the width of the floor in meters: ");
                userWidth = scanner.nextDouble();

                // Attempt to create a Floor2 object with the user-provided dimensions.
                // The Floor2 constructor contains validation logic (e.g., length/width > 0)
                // and will throw an IllegalArgumentException if the input is invalid.
                floor = new Floor2(userLength, userWidth);

            } catch (InputMismatchException e) {
                // This catch block handles cases where the user types non-numeric input (e.g., "abc")
                System.out.println("Invalid input! Please enter a numeric value for length and width.");
                scanner.next(); // IMPORTANT: This line consumes the invalid input token from the scanner's buffer.
                                // Without it, the loop would run infinitely, continuously trying to read the same invalid input.
            } catch (IllegalArgumentException e) {
                // This catch block handles exceptions thrown by the Floor2 constructor
                // when dimensions are not positive (as per Floor2's validation rules).
                System.out.println("Error: " + e.getMessage() + " Please try again.");
                // No need for scanner.next() here, as nextDouble() successfully read a number,
                // but the number itself was logically invalid for the object's creation.
            }
        }

        // --- Step 2: Get Carpet Cost per Square Meter and Create Carpet2 Object ---
        Carpet2 carpet = null; // Declare and initialize the Carpet2 object reference to null.

        // Loop until a valid Carpet2 object is successfully created
        while (carpet == null) {
            try {
                // Prompt user for carpet cost per square meter and read their input
                System.out.print("Enter the cost per square meter of carpet ($): ");
                userCostPerSquareMeter = scanner.nextDouble();

                // Attempt to create a Carpet2 object. Its constructor validates that the cost is non-negative.
                carpet = new Carpet2(userCostPerSquareMeter);

            } catch (InputMismatchException e) {
                // Handles non-numeric input for cost
                System.out.println("Invalid input! Please enter a numeric value for cost.");
                scanner.next(); // Consume invalid input
            } catch (IllegalArgumentException e) {
                // Handles negative cost thrown by Carpet2 constructor
                System.out.println("Error: " + e.getMessage() + " Please try again.");
            }
        }

        // --- Step 3: Create Calculation Object and Get Total Cost ---
        Calculation calculation = null; // Declare and initialize Calculation object reference to null.

        // This try-catch block handles potential issues during the final calculation setup
        // (though robust input loops above should prevent most common issues).
        try {
            // Create a Calculation object by passing the already validated Floor2 and Carpet2 objects.
            // The Calculation constructor also has defensive checks for null objects or invalid dimensions/cost.
            calculation = new Calculation(floor, carpet);

            // Get the final total cost by invoking the getTotalCost method on the calculation object.
            double totalCost = calculation.getTotalCost();

            // --- Step 4: Display Results ---
            System.out.printf("%n--- Calculation Summary ---%n"); // Newline and header for summary
            // Display floor dimensions using printf for formatted output (2 decimal places)
            System.out.printf("Floor Dimensions: %.2f meters (L) x %.2f meters (W)%n", floor.getLength(), floor.getWidth());
            // Display calculated area
            System.out.printf("Area of carpet required: %.2f square meters%n", floor.getArea());
            // Display carpet cost per square meter
            System.out.printf("Cost per square meter of carpet: $%.2f%n", carpet.getCostPerSquareMeter());
            // Display the final total cost, formatted as currency
            System.out.printf("TOTAL CARPET COST: $%.2f%n", totalCost);

        } catch (IllegalArgumentException e) {
            // Catches any remaining IllegalArgumentException, which could theoretically happen
            // if an object's state changed unexpectedly or if initial validation was insufficient.
            System.out.println("A final error occurred during calculation setup: " + e.getMessage());
        } finally {
            // The 'finally' block ensures that this code always executes, regardless of whether
            // an exception occurred in the try block or not.
            scanner.close(); // Crucially, close the Scanner to release system resources.
                             // Not closing can lead to resource leaks in long-running applications.
            System.out.println("\n--- Program finished ---"); // Concluding message
        }
    }
}
```

## 🧠 Key Logic and Patterns

1.  **`main` Method:** The heart of a console application. All execution begins here.
2.  **`Scanner` for Input:** The standard Java utility for reading user input from the console. It's initialized once and closed at the end of the `main` method.
3.  **Object Instantiation from User Input:**
    * The `Main` class doesn't calculate anything directly (except the final multiplication in `getTotalCost` via the `Calculation` object).
    * Instead, it gathers user data (`width`, `length`, `costPerSquareMeter`) and then uses this data to **create instances** of `Floor2`, `Carpet2`, and `Calculation` objects. This adheres to the **single responsibility principle** (each class has a clear, focused job).
4.  **Robust Input Loops (`while (object == null) { try { ... } catch { ... } }`):**
    * This is a highly effective pattern for user input in console applications.
    * The `while` loop ensures that the program keeps asking for input until *valid* data is provided and an object (e.g., `floor` or `carpet`) can be successfully created without exceptions.
    * **`try-catch (InputMismatchException)`:** Catches errors when the user enters text instead of numbers. The crucial `scanner.next()` consumes the invalid input, preventing an infinite loop.
    * **`try-catch (IllegalArgumentException)`:** Catches the exceptions specifically thrown by the constructors or methods of `Floor2`, `Carpet2`, and `Calculation` if the *numeric values* provided are logically invalid (e.g., negative length).
5.  **`System.out.print()` vs. `System.out.println()` vs. `System.out.printf()`:**
    * `print()`: Prints text without moving to the next line (used for prompts).
    * `println()`: Prints text and then moves to the next line.
    * `printf()`: Provides formatted output, similar to C's `printf`. It's excellent for aligning text, controlling decimal places (`%.2f` for two decimal places for `double` values), and including multiple variables in a single string.
6.  **Resource Management (`scanner.close()` in `finally` block):**
    * It's vital to close resources like `Scanner` to prevent **resource leaks**.
    * Placing `scanner.close()` within a `finally` block ensures that it *always* gets executed, whether the `try` block completes successfully or an exception is thrown. This guarantees proper cleanup.

The `Main` class effectively bridges the gap between the end-user and the underlying object-oriented model, making the application both functional and resilient to common user errors.