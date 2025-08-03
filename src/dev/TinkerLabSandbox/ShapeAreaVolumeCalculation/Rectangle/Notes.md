# Rectangle & Cuboid
Explains `INHERITANCE` using the `Rectangle` and `Cuboid` classes, which extend a base class called `Rectangle`. The `Rectangle` class provides common properties and methods for all shapes, while the specific classes implement their own calculations for area and volume.
## Problem Statement
- **Rectangle**: Represents a rectangle with methods to calculate area and perimeter.
- **Cuboid**: Extends `Rectangle` to add height and methods for surface area and volume.
## Discussion
- **Inheritance**: The `Cuboid` class inherits properties and methods from the `Rectangle` class, allowing it to reuse the area calculation method.
- **Encapsulation**: The `Rectangle` class encapsulates its properties, providing getter and setter methods to access and modify them safely.
- **Polymorphism**: The `Cuboid` class overrides the `calculateArea` method to provide a specific implementation for calculating the surface area of a cuboid.
## Walkthrough
```java
package dev.TinkerLabSandbox.ShapeAreaVolumeCalculation.Rectangle;

/* this class is placeholder for rectangle-related methods and properties.
this will calculate area, perimeter, and other rectangle-related calculations
  . */
public class Rectangles {

    private double length;
    private double width;

    public Rectangles(double length, double width) {
        if (length <= 0 || width <= 0) {// Validate that length and width are positive
            throw new IllegalArgumentException("Length and width must be positive values.");
        }
        this.length = length;
        this.width = width;
    }
    //getter & setter
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if (length <= 0) {// Validate that length is positive
            throw new IllegalArgumentException("Length must be a positive value.");
        }
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if (width <= 0) {// Validate that width is positive
            throw new IllegalArgumentException("Width must be a positive value.");
        }
        this.width = width;
    }
    // Method to calculate area
    public double calculateArea() {
        return length * width; // Area = length * width
    }
    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width); // Perimeter = 2 * (length + width)
    }
}

```
## Logic & Explanation
- **Package Declaration**: The class is part of the `dev.TinkerLabSandbox.ShapeAreaVolumeCalculation.Rectangle` package, which organizes related classes.
- **Private Fields**: `length` and `width` are private doubles that store the dimensions of the rectangle.
- **Constructor**: Initializes the `length` and `width` when a new `Rectangles` object is created, with validation to ensure they are positive.
- **Getter and Setter Methods**: Provide access to the `length` and `width`, allowing them to be modified with validation.
- **Methods**:
  - `calculateArea()`: Computes the area using the formula \( \text{Area} = \text{length} \times \text{width} \).
  - `calculatePerimeter()`: Computes the perimeter using the formula \( \text{Perimeter} = 2 \times (\text{length} + \text{width}) \).
## Cuboid.java
```java
package dev.TinkerLabSandbox.ShapeAreaVolumeCalculation.Rectangle;

/* this class will calculate the area and volume of cuboids
 * Cuboids are 3D rectangles with length, width, and height
 * Area = 2 * (length * width + length * height + width * height)
 * Volume = length * width * height
 */
public class Cuboids extends Rectangles {

    private double height;

    public Cuboids(double length, double width, double height) {
        super(length, width);
        if (height <= 0) {//height cannot be zero or negative
            throw new IllegalArgumentException("Height must be greater than zero.");
        }
        this.height = height;
    }
    //getter & setter for height
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height <= 0) {//height cannot be zero or negative
            throw new IllegalArgumentException("Height must be greater than zero.");
        }
        this.height = height;
    }
    //overriding the area method to calculate the surface area of cuboids
    public double surfaceArea() {
        return 2 * (getLength() * getWidth() + getLength() * height + getWidth() * height);
    }
    //method to calculate the volume of cuboids
    public double calculateVolume() {
        return getLength() * getWidth() * getHeight();
    }
    // overriding the toString method to display the cuboids details
    @Override
    public String toString() {
        return "Cuboids{" +
                "length=" + getLength() +
                ", width=" + getWidth() +
                ", height=" + height +
                ", surfaceArea=" + surfaceArea() +
                ", volume=" + calculateVolume() +
                '}';
    }
}
```
### Logic & Explanation
- **Package Declaration**: The class is part of the `dev.TinkerLabSandbox.ShapeAreaVolumeCalculation.Rectangle` package, which organizes related classes.
- **Inheritance**: The `Cuboids` class extends the `Rectangles` class, inheriting its properties and methods.
  - **Private Field**: `height` is a private double that stores the height of the cuboid
  - **Constructor**: Initializes both `length` and `width` (using the superclass constructor) and `height`, with validation to ensure height is positive.
- **Getter and Setter Methods**: Provide access to `height` with validation.
- **Overridden Methods**:
  - `surfaceArea()`: Computes the surface area of the cuboid using the formula \( \text{Surface Area} = 2 \times (\text{length} \times \text{width} + \text{length} \times \text{height} + \text{width} \times \text{height}) \).
  - `calculateVolume()`: Computes the volume of the cuboid using the formula \( \text{Volume} = \text{length} \times \text{width} \times \text{height} \).
- **toString Method**: Overrides the `toString` method to provide a string representation of the cuboid, including its dimensions, surface area, and volume.
## Main.java
```java
package dev.TinkerLabSandbox.ShapeAreaVolumeCalculation.Rectangle;


import java.util.Scanner;

//this will calculate various properties of a rectangle & cuboid with user input  using scanner
public class Main {
    public static void main(String[] args) {

        //create a scannner
        Scanner scanner = new Scanner(System.in);

        //calculate area & perimeter of rectangle
        double userLength = promptPositiveDouble(scanner, "Enter the length of the rectangle: ");
        double userWidth = promptPositiveDouble(scanner, "Enter the width of the rectangle: ");
        Rectangles rectangle = new Rectangles(userLength, userWidth);
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.calculatePerimeter());

        //calculate  surface area & volume of cuboid
        double userHeight = promptPositiveDouble(scanner, "Enter the height of the cuboid: ");
        Cuboids cuboid = new Cuboids(userLength, userWidth, userHeight);
        System.out.println("Surface area of the cuboid: " + cuboid.surfaceArea());
        System.out.println("Volume of the cuboid: " + cuboid.calculateVolume());

        //close the scanner
        scanner.close();
    }

    //utility for prompting for positive double input
    private static double promptPositiveDouble(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (!scanner.hasNextDouble()) {//note !scanner.hasNextDouble() checks if the next input is a valid double
                System.out.print("Please enter a valid number: ");
                scanner.next();
                continue; // Continue to prompt for input
            }
            value = scanner.nextDouble();
            if (value < 0) {
                System.out.println("Enter a valid positive number.");
            } else {
                break; // Valid input, exit the loop
            }
        }
        return value;
    }
}
```
### Logic & Explanation
- **Package Declaration**: The class is part of the `dev.TinkerLabSandbox.ShapeAreaVolumeCalculation.Rectangle` package, which organizes related classes.
- **Main Method**: The entry point of the program where user input is handled.
- **Scanner**: A `Scanner` object is created to read user input from the console.
- **Rectangle Calculation**:
  - Prompts the user for the length and width of a rectangle.
  - Creates a `Rectangles` object and calculates its area and perimeter.
- **Cuboid Calculation**:
  - Prompts the user for the height of a cuboid.
  - Creates a `Cuboids` object using the previously entered length and width, and calculates its surface area and volume.
- **Utility Method**: `promptPositiveDouble` is a utility method that prompts the user for a positive double value, ensuring valid input. It continues to prompt until a valid positive number is entered.
- **Closing the Scanner**: The scanner is closed at the end of the program to free up resources.
- **Output**: The program prints the area and perimeter of the rectangle, as well as the surface area and volume of the cuboid based on user input.
- **Error Handling**: The program includes basic error handling to ensure that the user inputs valid positive numbers for length, width, and height. If invalid input is detected, it prompts the user again until a valid input is provided.
- **User Interaction**: The program interacts with the user through the console, making it easy to test and use for calculating rectangle and cuboid properties.






