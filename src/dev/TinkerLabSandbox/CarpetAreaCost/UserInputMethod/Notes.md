
# 📚 Carpet Area & Cost Calculation Project Documentation
This document explains the design and implementation of the Carpet Area & Cost Calculation project, demonstrating basic Object-Oriented Programming (OOP) principles and user input handling in Java.

## 🎯 Project Goal
To calculate the total cost of carpeting a floor, given its dimensions and the cost per square meter of the carpet. The project is structured into distinct classes for better organization, reusability, and adherence to OOP principles.

### 📁 Project Structure
DevTinkerLab
└── src
└── dev
└── TinkerLabSandbox
└── CarpetAreaCost
└── UserInputMethod
├── Floor2.java
├── Carpet2.java
├── Calculation.java
└── Main.java
### 👩‍💻 Class Breakdown
#### 1. Floor2.java
   Purpose: This class represents a floor and is responsible for managing its dimensions (length and width) and calculating its area. It encapsulates the properties of a floor.

##### Key Concepts Demonstrated:

*Encapsulation*: Private instance variables (length, width) with public getter and setter methods.

*Constructor*: Initializes an object with specific state.

*Input Validation (Basic)*: Checks for valid dimensions upon construction and modification.

*Behavior*: Calculates the area of the floor.

#### Code & Logic Explanation:

```Java

package dev.TinkerLabSandbox.CarpetAreaCost.UserInputMethod;

public class Floor2 {
private double length; // Instance variable to store the length of the floor
private double width;  // Instance variable to store the width of the floor

    /**
     * Constructor for the Floor2 class.
     * Initializes a new Floor2 object with the given length and width.
     * Performs basic validation to ensure dimensions are positive.
     * @param length The length of the floor.
     * @param width The width of the floor.
     * @throws IllegalArgumentException if length or width are less than or equal to zero.
     */
    public Floor2(double length, double width) {
        // Validation moved from here into setters or could be directly here.
        // For robust validation, it's often good to call setters, which contain the validation logic.
        // However, direct validation in constructor is also common for initial state.
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than zero.");
        }
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be greater than zero.");
        }
        this.length = length;
        this.width = width;
    }

    /**
     * Getter method for the length of the floor.
     * @return The length of the floor.
     */
    public double getLength() {
        return length;
    }

    /**
     * Setter method for the length of the floor.
     * Updates the length of the floor, with validation.
     * @param length The new length for the floor.
     * @throws IllegalArgumentException if length is less than or equal to zero.
     */
    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than zero.");
        }
        this.length = length;
    }

    /**
     * Getter method for the width of the floor.
     * @return The width of the floor.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Setter method for the width of the floor.
     * Updates the width of the floor, with validation.
     * @param width The new width for the floor.
     * @throws IllegalArgumentException if width is less than or equal to zero.
     */
    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be greater than zero.");
        }
        this.width = width;
    }

    /**
     * Calculates and returns the area of the floor.
     * @return The calculated area (length * width).
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Overrides the default toString method to provide a meaningful string representation of the Floor2 object.
     * Useful for debugging and logging.
     * @return A string containing the length, width, and calculated area of the floor.
     */
    @Override
    public String toString() {
        return "Floor2{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + getArea() + // Includes the calculated area directly
                '}';
    }
}
```
##### Logic Flow:

`Instantiation`: A Floor2 object is created by passing length and width to its constructor.

`Validation`: The constructor (and setters) immediately check if the provided dimensions are positive. If not, an IllegalArgumentException is thrown, preventing the creation of an invalid Floor2 object.

`Data Storage`: Valid dimensions are stored in private instance variables.

`Area Calculation`: The getArea() method provides the core functionality, multiplying length by width.

`Access`: getLength(), getWidth(), setLength(), setWidth() provide controlled access to the object's state.

`toString()`: A helpful method for quickly getting a readable summary of a Floor2 object's current state.

### 2. Carpet2.java
   `Purpose`: This class represents the carpet material itself, specifically holding its cost per square meter. It encapsulates the pricing information for the carpet.

*Key Concepts Demonstrated*:

*Encapsulation*: Private instance variable (costPerSquareMeter) with a public getter method.

*Constructor*: Initializes the carpet's cost.

*Input Validation*: Ensures the cost per square meter is non-negative.

##### Code & Logic Explanation:

```Java

package dev.TinkerLabSandbox.CarpetAreaCost.UserInputMethod;

public class Carpet2 {
private double costPerSquareMeter; // Instance variable to store the cost per unit area of the carpet

    /**
     * Constructor for the Carpet2 class.
     * Initializes a new Carpet2 object with the given cost per square meter.
     * Validates that the cost is not negative.
     * @param costPerSquareMeter The cost of the carpet per square meter.
     * @throws IllegalArgumentException if costPerSquareMeter is negative.
     */
    public Carpet2(double costPerSquareMeter) {
        if (costPerSquareMeter < 0) { // Cost should not be negative
            throw new IllegalArgumentException("Cost per square meter cannot be negative.");
        }
        this.costPerSquareMeter = costPerSquareMeter;
    }

    /**
     * Getter method for the cost per square meter.
     * @return The cost per square meter of the carpet.
     */
    public double getCostPerSquareMeter() {
        return costPerSquareMeter;
    }
    // No setter provided as cost is assumed to be fixed after creation for this context.
    // If cost could change, a setter with similar validation would be added.
}
```
##### Logic Flow:

`Instantiation`: A Carpet2 object is created by providing the costPerSquareMeter.

`Validation`: The constructor checks if the cost is non-negative. A negative cost would be illogical and would throw an IllegalArgumentException.

`Data Storage`: The valid cost is stored in a private instance variable.

`Access`: getCostPerSquareMeter() provides read-only access to the carpet's pricing.

### 3. Calculation.java
   **Purpose**: This class acts as a central orchestrator or "service" that takes a Floor2 object and a Carpet2 object and calculates the total cost. It separates the calculation logic from the individual data models (Floor2, Carpet2).

*Key Concepts Demonstrated*:

*Composition (Has-A Relationship)*: A Calculation object "has a" Floor2 object and "has a" Carpet2 object. It doesn't inherit from them but uses their instances.

*Dependency Injection (Implicit)*: The Calculation object receives its dependencies (Floor2 and Carpet2 instances) through its constructor.

**Business Logic**: Contains the core calculation of totalCost.

*Robustness*: Additional validation in the constructor to ensure meaningful calculations can occur.

#### Code & Logic Explanation:

```Java

package dev.TinkerLabSandbox.CarpetAreaCost.UserInputMethod;

public class Calculation {
private Floor2 floor;   // Instance variable to hold the Floor2 object
private Carpet2 carpet; // Instance variable to hold the Carpet2 object

    /**
     * Constructor for the Calculation class.
     * Initializes a new Calculation object with a Floor2 and a Carpet2 object.
     * Performs comprehensive validation to ensure both objects are non-null and have valid underlying data
     * necessary for a meaningful cost calculation.
     * @param floor The Floor2 object representing the floor dimensions.
     * @param carpet The Carpet2 object representing the carpet's cost per square meter.
     * @throws IllegalArgumentException if either floor or carpet are null, or if their
     * dimensions/cost are invalid for calculation (e.g., zero or negative).
     */
    public Calculation(Floor2 floor, Carpet2 carpet) {
        // Validate that input objects are not null
        if (floor == null) {
            throw new IllegalArgumentException("Floor cannot be null.");
        }
        if (carpet == null) {
            throw new IllegalArgumentException("Carpet cannot be null.");
        }

        // Additional validation on the state of the passed objects (though their constructors also validate)
        // This acts as a safety net if objects were somehow created with invalid state before reaching here.
        if (floor.getWidth() <= 0 || floor.getLength() <= 0) {
            throw new IllegalArgumentException("Floor dimensions must be greater than zero for calculation.");
        }
        if (carpet.getCostPerSquareMeter() <= 0) { // Cost must be positive for a real calculation
            throw new IllegalArgumentException("Carpet cost per square meter must be greater than zero for calculation.");
        }

        this.floor = floor;
        this.carpet = carpet;
    }

    /**
     * Calculates the total cost to carpet the floor based on its area and the carpet's cost.
     * @return The total cost as a double.
     */
    public double getTotalCost() {
        // Re-calculating area here, or could directly use floor.getArea().
        // Using floor.getArea() is often preferred to leverage the object's own methods.
        double area = floor.getArea(); // Calculate the area using the Floor2 object's method
        return area * carpet.getCostPerSquareMeter(); // Calculate total cost
    }
}
```
#### Logic Flow:

`Instantiation`: A Calculation object is created by passing existing Floor2 and Carpet2 objects to its constructor.

`Comprehensive Validation`: The constructor performs thorough checks:

Ensures neither floor nor carpet objects are null.

Crucially, it re-validates that the dimensions of the floor and the costPerSquareMeter of the carpet are positive. While their respective constructors already do this, this "guard clause" in Calculation's constructor ensures that a meaningful calculation can proceed. This is good defensive programming, as you can't guarantee how objects passed to you were initialized in all scenarios.

`Dependency Storage`: Valid Floor2 and Carpet2 objects are stored as private instance variables.

`Total Cost Calculation`: The getTotalCost() method orchestrates the calculation by:

`Calling floor.getArea()` to get the floor's area.

Multiplying the area by carpet.getCostPerSquareMeter() to get the final cost.

### 4. Main.java
   ***Purpose***: This is the entry point of the entire application (public static void main). It's responsible for interacting with the user (via Scanner), handling input errors, orchestrating the creation of Floor2, Carpet2, and Calculation objects, and finally displaying the results.

Key Concepts Demonstrated:

Application Entry Point: main method.

User Interface (Console): Scanner for input, System.out.print/println/printf for output.

Error Handling: try-catch blocks to gracefully manage InputMismatchException (for non-numeric input) and IllegalArgumentException (for invalid business logic input like non-positive dimensions/cost).

Input Looping: while loops to repeatedly prompt the user until valid input is provided for each required piece of data.

Orchestration: Connects the different object models (Floor2, Carpet2, Calculation) to achieve the overall goal.

Resource Management: Closing the Scanner.

#### Code & Logic Explanation:

```Java

package dev.TinkerLabSandbox.CarpetAreaCost.UserInputMethod;

import java.util.InputMismatchException; // Needed for catching non-numeric input
import java.util.Scanner;              // Needed for reading user input

public class Main {
public static void main(String[] args) {

        System.out.println("--- Carpet Area & Cost Calculation Program ---");
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read from console

        // Variables to hold user input before creating objects
        double userLength = 0;
        double userWidth = 0;
        double userCostPerSquareMeter = 0;

        // --- Step 1: Get Floor Dimensions and Create Floor2 Object ---
        Floor2 floor = null; // Initialize floor object to null, will be set when valid input is received
        while (floor == null) { // Loop until a valid Floor2 object is created
            try {
                System.out.print("Enter the length of the floor in meters: ");
                userLength = scanner.nextDouble(); // Read length from user

                System.out.print("Enter the width of the floor in meters: ");
                userWidth = scanner.nextDouble(); // Read width from user

                // Attempt to create Floor2 object. Its constructor will throw IllegalArgumentException
                // if dimensions are not positive.
                floor = new Floor2(userLength, userWidth);
            } catch (InputMismatchException e) {
                // Catches error if user types non-numeric input (e.g., "abc")
                System.out.println("Invalid input! Please enter a numeric value for length and width.");
                scanner.next(); // IMPORTANT: Consume the invalid input to clear the scanner's buffer
                                // and prevent an infinite loop where it keeps trying to read the same bad input.
            } catch (IllegalArgumentException e) {
                // Catches error if Floor2 constructor throws it (e.g., length <= 0)
                System.out.println("Error: " + e.getMessage() + " Please try again.");
                // No need to consume here as nextDouble() did not fail due to type.
            }
        }

        // --- Step 2: Get Carpet Cost per Square Meter and Create Carpet2 Object ---
        Carpet2 carpet = null; // Initialize carpet object to null
        while (carpet == null) { // Loop until a valid Carpet2 object is created
            try {
                System.out.print("Enter the cost per square meter of carpet ($): ");
                userCostPerSquareMeter = scanner.nextDouble(); // Read cost from user

                // Attempt to create Carpet2 object. Its constructor will throw IllegalArgumentException
                // if cost is negative.
                carpet = new Carpet2(userCostPerSquareMeter);
            } catch (InputMismatchException e) {
                // Catches error if user types non-numeric input
                System.out.println("Invalid input! Please enter a numeric value for cost.");
                scanner.next(); // Consume invalid input
            } catch (IllegalArgumentException e) {
                // Catches error if Carpet2 constructor throws it (e.g., cost < 0)
                System.out.println("Error: " + e.getMessage() + " Please try again.");
            }
        }

        // --- Step 3: Create Calculation Object and Get Total Cost ---
        Calculation calculation = null; // Initialize calculation object to null
        try {
            // Create Calculation object, passing the valid floor and carpet objects.
            // Its constructor might also throw IllegalArgumentException if floor/carpet were null
            // or had invalid internal states (defensive programming).
            calculation = new Calculation(floor, carpet);
            double totalCost = calculation.getTotalCost(); // Get the final calculated total cost

            // --- Step 4: Display Results ---
            System.out.printf("%n--- Calculation Summary ---%n");
            System.out.printf("Floor Dimensions: %.2f meters (L) x %.2f meters (W)%n", floor.getLength(), floor.getWidth());
            System.out.printf("Area of carpet required: %.2f square meters%n", floor.getArea());
            System.out.printf("Cost per square meter of carpet: $%.2f%n", carpet.getCostPerSquareMeter());
            System.out.printf("TOTAL CARPET COST: $%.2f%n", totalCost);
        } catch (IllegalArgumentException e) {
            // Catches any remaining errors from Calculation constructor, though
            // the previous input loops should prevent most of these.
            System.out.println("A final error occurred during calculation setup: " + e.getMessage());
        } finally {
            // The finally block ensures scanner.close() is always called, regardless of exceptions.
            scanner.close(); // Close the scanner to release system resources
            System.out.println("\n--- Program finished ---");
        }
    }
}
```
#### Logic Flow:

Initialization: A Scanner object is created to read input from the console. Variables for user input and object references are initialized.

Input Loop for Floor:

A while loop continuously prompts the user for length and width.

**A try-catch block handles**:

InputMismatchException: If the user enters non-numeric data. It prints an error and scanner.next() clears the bad input.

IllegalArgumentException: If Floor2's constructor throws an error (e.g., non-positive dimensions). It prints the error message from the exception.

The loop continues until valid numeric and positive inputs are provided, allowing a Floor2 object to be successfully created.

Input Loop for Carpet: Similar to the floor input, a while loop and try-catch ensure valid costPerSquareMeter is obtained and a Carpet2 object is successfully created.

`Calculation and Output`:

Once valid Floor2 and Carpet2 objects are available, a Calculation object is instantiated, passing these two objects.

A try-catch block wraps this final step, in case the Calculation constructor still finds an issue (e.g., if somehow a null object got through or validation was somehow bypassed earlier).

calculation.getTotalCost() is called to get the final result.

System.out.printf is used to display a neatly formatted summary of the input details and the final calculated cost.

Resource Cleanup: The scanner.close() is placed in a finally block to guarantee that the Scanner resource is released, even if an unexpected error occurs.

