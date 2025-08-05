package dev.TinkerLabSandbox.Cars;

/*
 * Main class for the Cars application.
 * This class serves as the entry point for the application.
 * this class will use user input via Scanner class to get the user input
 * for the car details and then create a Car object with those details.
 * The program will then display the car details.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for car details
        System.out.println("Welcome to the Car Showroom!");
        System.out.print("Which car would you like to create? (Ford/Ferrari/Rimac): ");

        // Read the car type from user input
        String carType = scanner.nextLine();

        System.out.print("Enter the name of the car: ");
        String name = scanner.nextLine();

        System.out.print("Enter the color of the car: ");
        String color = scanner.nextLine();

        System.out.print("Enter the number of cylinders/motors: ");
        int cylinders = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline

        // Create the appropriate car object based on user input
        Cars car;

        // Use a switch statement to determine the type of car to create
        // and instantiate the corresponding class
        // Default case handles unknown car types
        switch (carType.toLowerCase()) {
            case "ford":
                car = new Ford(cylinders, name, color);
                break;
            case "ferrari":
                car = new Ferrari(cylinders, name, color);
                break;
            case "rimac":
                car = new Rimac(cylinders, name, color);
                break;
            default:
                System.out.println("Unknown car type. Defaulting to a generic Car.");
                car = new Cars(cylinders, name, color);
        }

        // Display the created car details
        System.out.println("\n=== Car Created ===");
        System.out.println(car);

        System.out.println("\nSimulating actions:");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println(car.stopEngine());

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}


//public class Main {
//    public static void main(String[] args) {

        //testing
//        System.out.println("--- Cars Application ---");
//                Cars[] cars = {
//                        new Ford(8, "Ford GT", "Red"),
//                        new Rimac(4, "Rimac C2", "Blue"),
//                        new Ferrari(8, "LaFerrari", "Yellow")
//                };
//                for (Cars car : cars) {
//                    System.out.println(car.startEngine());
//                    System.out.println(car.accelerate());
//                    System.out.println(car.brake());
//                    System.out.println(car.stopEngine());
//                    System.out.println(car); // show toString
//                    System.out.println("-----");
//                }
//            }







