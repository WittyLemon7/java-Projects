package dev.projects.com.java.exercises;

public class Calculator {
    private Floor floor; // Reference to the Floor object
    private Carpet carpet; // Reference to the Carpet object

    // Constructor to initialize floor and carpet
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    // Method to calculate total cost
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost(); // Multiply area of floor by cost per unit
    }
}
