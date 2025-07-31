package dev.TinkerLabSandbox.ShapeAreaVolumeCalculation.Rectangle;

/* this class is placeholder for rectangle-related methods and properties.
this will calculate area, perimeter, and other rectangle-related calculations
  . */
public class Rectangles {

    private double length;
    private double width;

    public Rectangles(double length, double width) {
        if (length <= 0 || width <= 0) {// Validate that length and width are positive
            throw new IllegalArgumentException("Length and width must be positive values.");
        }
        this.length = length;
        this.width = width;
    }
    //getter & setter
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if (length <= 0) {// Validate that length is positive
            throw new IllegalArgumentException("Length must be a positive value.");
        }
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if (width <= 0) {// Validate that width is positive
            throw new IllegalArgumentException("Width must be a positive value.");
        }
        this.width = width;
    }
    // Method to calculate area
    public double calculateArea() {
        return length * width; // Area = length * width
    }
    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width); // Perimeter = 2 * (length + width)
    }
}
