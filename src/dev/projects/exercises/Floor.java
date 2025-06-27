package dev.projects.exercises;

public class Floor {
    private double width;
    private double length;
    //constructor
    public Floor(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }
    //getters
    public double getArea() {
        return width * length;
    }
}
