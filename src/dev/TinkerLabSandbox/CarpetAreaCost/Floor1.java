package dev.TinkerLabSandbox.CarpetAreaCost;

import java.util.Scanner;

public class Floor1 {
    //instance variables to store the width and length of the carpet
    private double width;
    private double length;

    // Constructor to initialize the carpet with width and length
    // This constructor allows you to create a FloorCarpet object with specific dimensions
    public Floor1(double width, double length) {
        if (width <= 0 || length <= 0) {// Check for valid dimensions
            throw new IllegalArgumentException("Width and length must be positive values.");
        }
        // If the dimensions are valid, assign them to the instance variables
        this.width = width;
        this.length = length;
    }
    // Default constructor not needed as carpet dimensions cannot be zero or negative
    // If you want to allow creating a FloorCarpet object with default dimensions, uncomment the following code:

//    // This constructor allows you to create a FloorCarpet object with default dimensions (0.0, 0.0)
//    public FloorCarpet() {
//        this.width = 0.0; // Default value for width
//        this.length = 0.0; // Default value for length

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {//carpet width cannot be negative
            throw new IllegalArgumentException("Width cannot be negative.");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {//carpet length cannot be negative
            throw new IllegalArgumentException("Length cannot be negative.");
        }
        this.length = length;
    }
    // Method to calculate the area of the carpet
    public double getArea() {
        return width * length;
    }
}
