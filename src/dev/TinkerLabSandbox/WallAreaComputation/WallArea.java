package dev.TinkerLabSandbox.WallAreaComputation;

public class WallArea {

    private double width;// Variable to hold the width of the wall
    private double height;// Variable to hold the height of the wall

    // constructor to initialize the wall area with width and height
    public WallArea(double width, double height) {
        this.width = width;
        this.height = height;
    }
    // Default constructor
    public WallArea() {
        this.width = 0.0; // Default value for width
        this.height = 0.0; // Default value for height
    }

    // Getters and Setters for width and height with validation
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {//width cannot be negative
            throw new IllegalArgumentException("Width cannot be negative");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {//height cannot be negative
            throw new IllegalArgumentException("Height cannot be negative");
        }
        this.height = height;
    }
    // Method to calculate the area of the wall
    public double getArea() {
        return width * height; // Calculate the area of the wall
    }

}

