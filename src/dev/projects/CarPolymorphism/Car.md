# Car Class

## 📌Problem Statement

Create a `Car` class that represents a car with properties like make, model, year, and methods to start and stop the car. The class should also include a method to display the car's details.

## 💭Discussion
The `Car` class is a fundamental part of the Car Polymorphism application, encapsulating the properties and behaviors of a car. It allows for the creation of cars with specific attributes and provides methods to interact with these cars, such as starting, stopping, and displaying their details.

## 🧪Walkthrough

```java
package dev.projects.CarPolymorphism;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void startEngine() {
        System.out.println("Engine started for " + description);
    }
    protected void runEngine() {
        System.out.println("Engine running for " + description);
    }
    public void drive() {
        System.out.println("Driving for " + getClass().getSimpleName());
        runEngine();
    }
}
```
### 🧪Logic & Explanation
- **Constructor**: The constructor initializes the car with a description, which can include details like make and model.
- **Getters**: The `getDescription` method returns the description of the car.
- **Start Engine**: The `startEngine` method simulates starting the car's engine, printing a message that includes the car's description.
- **Run Engine**: The `runEngine` method is protected, allowing subclasses to call it while preventing direct access from outside the class hierarchy. It simulates the engine running.
- **Drive Method**: The `drive` method prints a message indicating that the car is being driven and calls the `runEngine` method to simulate the engine running. It uses `getClass().getSimpleName()` to print the specific type of car being driven, demonstrating polymorphism.
- **Polymorphism**: The `drive` method can be overridden in subclasses to provide specific driving behavior for different types of cars, allowing for polymorphic behavior when calling this method on different car objects.
- **Encapsulation**: The properties of the car are private, ensuring that they can only be accessed or modified through the provided methods. This encapsulation is a key principle of object-oriented programming, promoting data integrity and security.
- **Inheritance**: The `Car` class can be extended by other classes to create specific types of cars, such as `ElectricCar`, `GasCar`, or `HybridCar`, allowing for code reuse and specialization of behavior.

## ??Edge Cases
- **Invalid Description**: Ensure that the description is not null or empty when creating a car.
- **Null Values**: Handle cases where the description might be null or invalid.
- **Drive Method Behavior**: Ensure that the `drive` method behaves correctly when called on different types of cars, especially if they have overridden the `runEngine` method.

