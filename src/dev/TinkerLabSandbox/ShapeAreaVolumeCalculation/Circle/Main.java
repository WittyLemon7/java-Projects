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

