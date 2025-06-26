package dev.projects.com.java.exercises;

public class Cylinder extends Circle {

    private double height;

    //constructor with only height
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height < 0 ? 0 : height;
    }
    //getter for height
    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return getArea() * height;//volume = base area * height
    }

}
