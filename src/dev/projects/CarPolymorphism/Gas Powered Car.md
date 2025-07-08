# Gas Powered Car
## Problem Statement
This project is designed to create a Gas Powered Car class that simulates the behavior of a gas-powered car. The goal is to implement methods for starting the car, stopping it, and checking its status.
## Discussion
The Gas Powered Car class is a simple representation of a car that runs on gasoline. It includes methods to start and stop the car, as well as to check if the car is running. This project helps in understanding basic object-oriented programming concepts such as encapsulation and method implementation.
## Walkthrough
```java
package dev.projects.CarPolymorphism;

public class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int  cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("All 8 cylinders fired up for " + getDescription());
    }

    @Override
    protected void runEngine() {
        System.out.println("Gas usage exceeds the average:  %.2f %n "+  avgKmPerLitre);
    }
}
````
## Logic & Explanation
- **Constructor**: The constructor initializes the Gas Powered Car with a description, average kilometers per litre, and the number of cylinders. It calls the superclass constructor
- **Getters**: The `getAvgKmPerLitre` and `getCylinders` methods provide access to the average kilometers per litre and the number of cylinders, respectively.
- **startEngine Method**: The `startEngine` method overrides the superclass method to provide a specific implementation for starting the gas-powered car's engine, indicating that all cylinders have fired up.
- **runEngine Method**: The `runEngine` method overrides the superclass method to provide a specific implementation for running the gas-powered car's engine, indicating that gas usage exceeds the average kilometers per litre.
- **Encapsulation**: The properties of the Gas Powered Car are private, ensuring that they can only be accessed or modified through the provided methods. This encapsulation is a key principle of object-oriented programming, promoting data integrity and security.
- **Polymorphism**: The Gas Powered Car class extends the Car class, demonstrating polymorphism by overriding methods to provide specific behavior for gas-powered cars. This allows for flexibility in how different types of cars can be handled in a unified way.
- **Inheritance**: The Gas Powered Car class inherits from the Car class, allowing it to reuse and extend the functionality of the base class while adding its own specific features.
- **Method Overriding**: The Gas Powered Car class overrides the `startEngine` and `runEngine` methods from the Car class to provide specific implementations for gas-powered cars, demonstrating the concept of method overriding in object-oriented programming.
