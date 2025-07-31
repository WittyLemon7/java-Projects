package dev.TinkerLabSandbox.ShapeAreaVolumeCalculation.Triangle;

/*
 * This class represents a triangle.
 * this will be used to calculate the area and perimeter of a triangle.
 */
public class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("Sides must be positive numbers.");
        }
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalArgumentException("The given sides do not form a valid triangle.");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    //getters & setters for the sides of the triangle
    public double getSideA() {
        return sideA;
    }
    public void setSideA(double sideA) {
        if (sideA <= 0) {
            throw new IllegalArgumentException("Side A must be a positive number.");
        }
        this.sideA = sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public void setSideB(double sideB) {
        if (sideB <= 0) {
            throw new IllegalArgumentException("Side B must be a positive number.");
        }
        this.sideB = sideB;
    }
    public double getSideC() {
        return sideC;
    }
    public void setSideC(double sideC) {
        if (sideC <= 0) {
            throw new IllegalArgumentException("Side C must be a positive number.");
        }
        this.sideC = sideC;
    }
    //method to calculate the perimeter of the triangle
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
    //method to calculate the area of the triangle using Heron's formula
    //Herons formula states that the area of a triangle can be calculated using the semi-perimeter and the lengths of its sides
    //Area = sqrt(s * (s - a) * (s - b) * (s - c)), where s is the semi-perimeter and a, b, c are the
    public double calculateArea() {
        double semiPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }
    //method to check if the triangle is equilateral
    //equilateral triangle has all sides equal
    //this method returns true if the triangle is equilateral, false otherwise
    public boolean isEquilateral() {
        return sideA == sideB && sideB == sideC;
    }
}
