package dev.TinkerLabSandbox.ShapeAreaVolumeCalculation;

public class Circle1 {

    private  double radius;

    //constructor
    public Circle1(double radius) {
        this.radius = radius;
    }
    //getter & setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius; // Area = πr², Math.PI is a constant in Java representing the value of π
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius; // Circumference = 2πr
    }
}
