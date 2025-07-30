
## Main Class: Step-by-Step Explanation

```java
package dev.TinkerLabSandbox.ShapeAreaVolumeCalculation;

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
        System.out.printf("Surface Area of Cylinder: %.2f\n", cylinder.calculateSurfaceArea());
        System.out.printf("Volume of Cylinder: %.2f\n", cylinder.calculateVolume());

        // Calculate volume of a sphere
        double sphereRadius = promptPositiveDouble(scanner, "\nEnter radius for sphere: ");
        Sphere1 sphere = new Sphere1(sphereRadius);
        System.out.printf("Surface Area of Sphere: %.2f\n", sphere.calculateSurfaceArea());
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


### 1. **Imports and Class Declaration**

- `import java.util.Scanner;`
    - Brings in the Scanner class so your program can read input from the user.
- `public class Main { ... }`
    - Declares your main entry-point class.


### 2. **The main Method**

This is the heart of your program—all code execution starts here!

```java
public static void main(String[] args) {
```


#### **Creating the Scanner**

```java
Scanner scanner = new Scanner(System.in);
```

- Instantiates a `Scanner` object, which will read user input from the keyboard.


### 3. **Step-by-Step Shape Calculations**

#### A) **Circle Calculations**

```java
double circleRadius = promptPositiveDouble(scanner, "Enter radius for circle: ");
Circle1 circle = new Circle1(circleRadius);
System.out.printf("Area of Circle: %.2f\n", circle.calculateArea());
System.out.printf("Circumference of Circle: %.2f\n", circle.calculateCircumference());
```

- Prompts the user for a **positive** radius.
- Instantiates a `Circle1` object with that radius.
- Calculates and prints:
    - **Area**: πr²
    - **Circumference**: 2πr


#### B) **Cylinder Calculations**

```java
double cylinderRadius = promptPositiveDouble(scanner, "\nEnter radius for cylinder: ");
double cylinderHeight = promptPositiveDouble(scanner, "Enter height for cylinder: ");
Cylinder1 cylinder = new Cylinder1(cylinderRadius, cylinderHeight);
System.out.printf("Surface Area of Cylinder: %.2f\n", cylinder.calculateSurfaceArea());
System.out.printf("Volume of Cylinder: %.2f\n", cylinder.calculateVolume());
```

- Asks the user for **radius** and **height** with validation.
- Instantiates a `Cylinder1` object.
- Calculates and prints:
    - **Surface Area**: 2πr(h+r)
    - **Volume**: πr²h


#### C) **Sphere Calculations**

```java
double sphereRadius = promptPositiveDouble(scanner, "\nEnter radius for sphere: ");
Sphere1 sphere = new Sphere1(sphereRadius);
System.out.printf("Surface Area of Sphere: %.2f\n", sphere.calculateSurfaceArea());
System.out.printf("Volume of Sphere: %.2f\n", sphere.calculateVolume());
```

- Prompts for a positive **radius**.
- Creates a `Sphere1` object.
- Calculates and prints:
    - **Surface Area**: 4πr²
    - **Volume**: (4/3)πr³


#### D) **Close the Scanner**

```java
scanner.close();
```

- Always close resources like Scanner at the end to avoid resource leaks.


### 4. **Utility Method for Input Validation**

```java
private static double promptPositiveDouble(Scanner scanner, String prompt) { ... }
```

- Keeps asking the user for input until:
    - The input is a **number**
    - The input is **positive**
- Returns the valid input value.


## **Professional \& Learning Highlights**

- **Defensive programming**: The utility method ensures your calculations always get valid data—crucial for real-world applications.
- **Separation of Concerns**: Each block (circle, cylinder, sphere) is handled separately for clarity and maintainability.
- **OOP Best Practices**: Shows real-world use of encapsulation, constructors, and method calls.
- **Output Formatting**: Uses `printf` for clean, readable output, suitable for users.


## **Skill Takeaway for You**

- **User input handling** and **validation** are critical for user-facing or enterprise-level software.
- **Breaking code into logical steps** is key for interview explanations and code maintainability.
- **Practicing with objects** (instantiating, calling methods) solidifies your command over OOP.

**If you want, I can provide a similar walk-through for an advanced version that leverages inheritance, interfaces, or using an ArrayList to neatly manage a collection of user-created shapes. Let me know your next learning goal!**

