# Electric Car Class
## Problem Statement
Create a class `ElectricCar` that extends a base class `Car`. The `ElectricCar` should have additional properties and methods specific to electric vehicles, such as battery capacity and charging methods.
## Discussion
The `ElectricCar` class is a specialized version of the `Car` class, designed to represent electric vehicles. It inherits common properties and behaviors from the `Car` class while adding unique features relevant to electric cars, such as battery capacity and charging methods.
## Walkthrough
```java
package dev.projects.CarPolymorphism;

public class ElectricCar extends Car {

    private int batterySize;
    private double avgKWPerCharge;

    public ElectricCar(String description, int batterySize, double avgKWPerCharge) {
        super(description);
        this.batterySize = batterySize;
        this.avgKWPerCharge = avgKWPerCharge;
    }
    public int getBatterySize() {
        return batterySize;
    }
    public double getAvgKWPerCharge() {
        return avgKWPerCharge;
    }
}
```
## Logic & Explanation
- **Inheritance**: The `ElectricCar` class extends the `Car` class, inheriting
- its properties and methods. This allows the electric car to have all the features of a regular car while adding new ones specific to electric vehicles.
- **Constructor**: The constructor initializes the electric car with a description, battery size, and average kilowatt per charge. It calls the superclass constructor `super(description)` to set the common car properties, ensuring that the base class is properly initialized.
- **Getters**: The `getBatterySize` and `getAvgKWPerCharge` methods provide access to the battery size and average kilowatt per charge properties, allowing other parts of the application to retrieve this information.
- **Encapsulation**: The properties of the electric car are private, ensuring that they can only be accessed or modified through the provided methods. This encapsulation is a key principle of object-oriented programming, promoting data integrity and security.
- **Polymorphism**: The `ElectricCar` class can be treated as a `Car` object, allowing for polymorphic behavior. This means that methods that accept a `Car` type can also accept an `ElectricCar`, enabling flexibility in how cars are handled in the application.

## Edge Cases
- **Invalid Battery Size**: Ensure that the battery size is a positive integer when creating an electric car.
- **Negative Average Kilowatt**: Handle cases where the average kilowatt per charge is negative or unrealistic.
- **Null Description**: Ensure that the description of the electric car is not null or empty.

- **Duplicate Descriptions**: Consider how to handle electric cars with the same description but different battery sizes or average kilowatts.
- 