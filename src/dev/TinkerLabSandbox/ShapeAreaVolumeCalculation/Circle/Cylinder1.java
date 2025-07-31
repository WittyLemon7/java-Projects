package dev.TinkerLabSandbox.ShapeAreaVolumeCalculation.Circle;

public class Cylinder1 extends Circle1 {

    private double height;

    //constructor that initializes the radius and height of the cylinder
    public Cylinder1(double radius, double height) {
        super(radius);// Call the constructor of Circles, inheritance
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative");
        }
        this.height = height;
    }
    // Getters and Setters for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative");
        }
        this.height = height;
    }


    public double calculateSurfaceArea() {
        return 2 * Math.PI * getRadius() * (getRadius() + height);// Area of the cylinder
    }


    public double calculateVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * height;// Volume of the cylinder, Math.pow is used to raise the radius to the power of 2
    }
}
