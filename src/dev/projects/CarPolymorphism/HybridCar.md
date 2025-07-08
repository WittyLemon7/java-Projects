# Hybrid Car

## Prblem Statement
Create a Hybrid car class that extends a Car class. The HybridCar class should have an additional attribute for the electric range and methods to calculate the total range based on both fuel and electric power.
### Discussion
The HybridCar class is a specialized version of the Car class that incorporates both fuel and electric power. This allows for greater flexibility and efficiency in how the car operates, making it suitable for various driving conditions.
### Walkthrough
```java
package dev.projects.CarPolymorphism;

public class HybridCar extends Car{

    private int batterySize;
    private double avgKWPerCharge;
    private double avgKmPerLitre;
    private int cylinders;

    public HybridCar(String description, int batterySize, double avgKWPerCharge, double avgKmPerLitre, int cylinders) {
        super(description);
        this.batterySize = batterySize;
        this.avgKWPerCharge = avgKWPerCharge;
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public double getAvgKWPerCharge() {
        return avgKWPerCharge;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }
}
`
```
## Logic & Explanation
- **Constructor**: The constructor initializes the HybridCar with its specific attributes, including battery size, average kilowatt per charge, average kilometers per liter, and the number of cylinders. It also calls the constructor of the superclass Car to set the description.
- **Getters**: The getters provide access to the specific attributes of the HybridCar, allowing other parts of the program to retrieve information about the car's battery size, average kilowatt per charge, average kilometers per liter, and the number of cylinders.
- **Inheritance**: The HybridCar class extends the Car class, inheriting its properties and methods. This allows the HybridCar to be treated as a Car while also adding its own specific functionality related to hybrid technology.
- **Polymorphism**: The HybridCar class can be used in contexts where a Car is expected, allowing for polymorphic behavior. This means that methods that operate on Car objects can also work with HybridCar objects, enabling flexibility in how cars are handled in the application.
- **Efficiency**: By combining both fuel and electric power, the HybridCar class can potentially offer better fuel efficiency and reduced emissions compared to traditional cars, making it a more environmentally friendly option.