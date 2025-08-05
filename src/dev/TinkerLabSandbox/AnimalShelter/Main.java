package dev.TinkerLabSandbox.AnimalShelter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Testing
        //create a scanner
        Scanner scanner = new Scanner(System.in);

        //prompt the user
        System.out.println("Welcome to the Animal Shelter");
        System.out.println("Which animal would you like to keep in the shelter (Dog, Cat, Rabbit): ");

        // read animal type from user
        String animalType = scanner.nextLine();

        System.out.println("Enter the name of teh animal: ");
        String name = scanner.nextLine();

//        System.out.println("Enter the age of the animal: ");
//        int age = scanner.nextInt();

        System.out.println("Enter the breed of the animal: ");
        String breed = scanner.nextLine();

        System.out.println("Enter the colour of the animal: ");
        String colour = scanner.nextLine();

        System.out.println("Enter the age of the animal: ");
        int age = scanner.nextInt();
        scanner.nextLine();


        //Create the animal object
        Animal animal;

        // switch to determine the type of animal
        switch (animalType.toLowerCase()) {
            case "dog":
                animal = new Dog(name, age, breed, colour);
                break;
            case "cat":
                animal = new Cat(name, age, breed, colour);
                break;
            case "rabbit":
                animal = new Rabbit(name, age, breed, colour);
                break;
            default:
                System.out.println("Unknown animal type: ");
                animal = new Animal(name, age, breed, colour);
        }

        //display the animal details
        System.out.println("\n=== Animal Details ===");
        System.out.println(animal);

        System.out.println("Animal Behaviour");
        System.out.println(animal.makeSound());
        System.out.println(animal.eat());
        System.out.println(animal.sleep());

        //close the scanner
        scanner.close();



    }
}
