package dev.TinkerLabSandbox.CarpetAreaCost.UserInputMethod;
/*
 * Floor2.java
 * this class contends with the area of carpet to be laid on the floor
 * This class represents a floor with a length and width, allowing for area calculation.
 * It includes validation for positive dimensions and provides a string representation of the floor.
 */

public class Floor2 {

    private double length;
    private double width;

    public Floor2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than zero.");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be greater than zero.");
        }
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Floor2{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + getArea() +
                '}';
    }
}
