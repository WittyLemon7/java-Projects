package com.java.exercises;

public class Circle {

    private double radius;

    //constructor with arg
    public Circle() {
        this.radius = 0;
    }
    //constructor with args
    public Circle(double radius) {
        this.radius = radius < 0 ? 0 : radius;
    }
    //getters and setters

    public double getRadius() {
        return radius;
    }
//setter with validation
    public void setRadius(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }
    //method to get area
    public double getArea() {
        return Math.PI * radius * radius;
    }
    //method to get circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    //scale method
    public String scale(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Factor must be greater than 0");
        }
        radius *= factor;
        return "Circle scaled by factor " + factor;
    }
    //compare method
    public boolean hasSameArea(Circle circle) {
        //ensure floating point precision in double comparison
        return Math.abs(radius - circle.radius) < 0.00001;
    }
}
