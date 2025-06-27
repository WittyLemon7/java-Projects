package dev.projects.CarRentalManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create a new car
        Car car = new Car("Toyota Camry", "ABC123", false);

        // Display car details
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Registration Number: " + car.getRegistrationNumber());
        System.out.println("Is Rented: " + car.isRented());

        // Rent the car
        car.rented();

        // Try to rent the car again
        car.rented();

        // Return the car
        car.returned();

        // Try to return the car again
        car.returned();
    }


}
