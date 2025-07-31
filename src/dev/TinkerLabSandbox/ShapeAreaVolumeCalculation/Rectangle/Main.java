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






