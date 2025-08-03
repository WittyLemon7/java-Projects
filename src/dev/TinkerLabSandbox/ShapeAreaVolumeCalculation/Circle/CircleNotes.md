# Circle, Cylinder & Sphere
This explains `INHERITANCE` through the `Circle`, `Cylinder`, and `Sphere` classes, which all extend a base class called `Circle`. The `Circle` class provides common properties and methods for all shapes, while the specific classes implement their own calculations for area and volume.
## Project Structure
- **Circle.java**: Contains the `Circle` class with methods for calculating area and circumference.
- **Cylinder.java**: Extends `Circle` to add height and methods for surface area and volume.
- **Sphere.java**: Extends `Circle` to implement methods for surface area and volume.
- **Main.java**: Contains the main method to run the program and interact with the user.
- **README.md**: Provides an overview of the project and instructions for running it.
### Circle.java
```java
package dev.TinkerLabSandbox.ShapeAreaVolumeCalculation.Circle;

public class Circle1 {

    private  double radius;

    //constructor
    public Circle1(double radius) {
        this.radius = radius;
    }
    //getter & setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius; // Area = πr², Math.PI is a constant in Java representing the value of π
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius; // Circumference = 2πr
    }
}
```
#### Explanation
- **Package Declaration**: The class is part of the `dev.TinkerLabSandbox.ShapeAreaVolumeCalculation.Circle` package, which organizes related classes.
- **Private Field**: `radius` is a private double that stores the radius of the circle.
- **Constructor**: Initializes the `radius` when a new `Circle1` object is created.
- **Getter and Setter**: Provides access to the `radius` and allows it to be set, with validation to ensure it is positive.
- **Methods**:
  - `calculateArea()`: Computes the area using the formula \( \pi r^2 \).
  - `calculateCircumference()`: Computes the circumference using the formula \( 2\pi r \).
### Cylinder.java
```java
package dev.TinkerLabSandbox.ShapeAreaVolumeCalculation.Circle;

public class Cylinder1 extends Circle1 {

    private double height;

    //constructor that initializes the radius and height of the cylinder
    public Cylinder1(double radius, double height) {
        super(radius);// Call the constructor of Circles, inheritance
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative");
        }
        this.height = height;
    }
    // Getters and Setters for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative");
        }
        this.height = height;
    }


    public double calculateSurfaceArea() {
        return 2 * Math.PI * getRadius() * (getRadius() + height);// Area of the cylinder
    }


    public double calculateVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * height;// Volume of the cylinder, Math.pow is used to raise the radius to the power of 2
    }
}
```
#### Explanation
- **Package Declaration**: The class is part of the same package as `Circle1`.
- **Inheritance**: `Cylinder1` extends `Circle1`, inheriting its properties and methods.
- **Private Field**: `height` is a private double that stores the height of the cylinder.
- **Constructor**: Initializes both `radius` (using the superclass constructor) and `height`, with validation to ensure height is non-negative.
- **Getters and Setters**: Provides access to `height` with validation.
- **Methods**:
  - `calculateSurfaceArea()`: Computes the surface area of the cylinder using the formula \( 2\pi r (r + h) \).
  - `calculateVolume()`: Computes the volume of the cylinder using the formula \( \pi r^2 h \), where `getRadius()` is called to access the inherited radius property.
### Sphere.java
```java
package dev.TinkerLabSandbox.ShapeAreaVolumeCalculation.Circle;

public class Sphere1 extends Circle1 {

    public Sphere1(double radius) {
        super(radius);//inherits from circles
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);// Calculate the volume of the sphere
    }
    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);// Calculate the surface area of the sphere
    }
}
```
#### Explanation
- **Package Declaration**: The class is part of the same package as `Circle1`.
- **Inheritance**: `Sphere1` extends `Circle1`, inheriting its properties and methods.
- **Constructor**: Initializes the sphere's radius using the superclass constructor.
- **Methods**:
  - `calculateVolume()`: Computes the volume of the sphere using the formula \( \frac{4}{3} \pi r^3 \).
  - `calculateArea()`: Overrides the `calculateArea()` method from `Circle1` to compute the surface area of the sphere using the formula \( 4\pi r^2 \).
### Main.java
```java
package dev.TinkerLabSandbox.ShapeAreaVolumeCalculation.Circle;

/* calculate using user input
area of a circle
area of cylinder
volume of a cylinder
volume of a sphere
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculate area and circumference of a circle
        double circleRadius = promptPositiveDouble(scanner, "Enter radius for circle: ");
        Circle1 circle = new Circle1(circleRadius);
        System.out.printf("Area of Circle: %.2f\n", circle.calculateArea());
        System.out.printf("Circumference of Circle: %.2f\n", circle.calculateCircumference());

        // Calculate area and volume of a cylinder
        double cylinderRadius = promptPositiveDouble(scanner, "\nEnter radius for cylinder: ");
        double cylinderHeight = promptPositiveDouble(scanner, "Enter height for cylinder: ");
        Cylinder1 cylinder = new Cylinder1(cylinderRadius, cylinderHeight);
        System.out.printf("Surface Area of Cylinder: %.2f\n", cylinder.calculateArea());
        System.out.printf("Volume of Cylinder: %.2f\n", cylinder.calculateVolume());

        // Calculate volume of a sphere
        double sphereRadius = promptPositiveDouble(scanner, "\nEnter radius for sphere: ");
        Sphere1 sphere = new Sphere1(sphereRadius);
        System.out.printf("Surface Area of Sphere: %.2f\n", sphere.calculateArea());
        System.out.printf("Volume of Sphere: %.2f\n", sphere.calculateVolume());

        scanner.close();
    }

    // Utility for safe positive double input
    private static double promptPositiveDouble(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (!scanner.hasNextDouble()) {
                System.out.println("❌ Please enter a numeric value.");
                scanner.next();
                continue;
            }
            value = scanner.nextDouble();
            if (value <= 0) {
                System.out.println("❌ Value must be positive.");
            } else {
                break;
            }
        }
        return value;
    }
}
```
#### Explanation
- **Package Declaration**: The class is part of the same package as `Circle1`, `Cylinder1`, and `Sphere1`.
- **Main Method**: The entry point of the program.
- **Scanner**: Used to read user input from the console.
- **Circle Calculation**:
  - Prompts the user for the radius of a circle.
  - Creates a `Circle1` object and calculates its area and circumference.
- **Cylinder Calculation**:
  - Prompts the user for the radius and height of a cylinder.
  - Creates a `Cylinder1` object and calculates its surface area and volume.
- **Sphere Calculation**:
  - Prompts the user for the radius of a sphere.
  - Creates a `Sphere1` object and calculates its surface area and volume.
- **Utility Method**: `promptPositiveDouble` ensures that user input is a positive double, prompting until valid input is received. This method handles input validation and error messages for non-numeric or negative values.
## Related Concepts
- **Inheritance**: The `Cylinder1` and `Sphere1` classes inherit from the `Circle1` class, demonstrating how subclasses can extend the functionality of a base class.
- **Polymorphism**: The `calculateArea()` method is overridden in the `Sphere1` class to provide a specific implementation for spheres, while the `Cylinder1` class uses the inherited method from `Circle1` for its surface area calculation.
- **Encapsulation**: The properties of the `Circle1`, `Cylinder1`, and `Sphere1` classes are encapsulated, with private fields and public methods to access and modify them. This ensures that the internal state of the objects is protected and can only be changed through defined methods.
- **Abstraction**: The classes provide a clear interface for calculating areas and volumes without exposing the underlying implementation details. Users can interact with the classes through their public methods without needing to understand the internal workings.
  - **Error Handling**: The program includes input validation to ensure that the radius and height values are positive, demonstrating good practices in error handling and user input validation.