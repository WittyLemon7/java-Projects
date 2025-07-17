package dev.TinkerLabSandbox.AreaCalculation.MethodOverloading;

public class AreaCircleRAndRectangle {
    public static void main(String[] args) {

        // Example usage of calculateArea method
        try {//try-catch block to handle exceptions
            double radius = 5.0; // Example radius
            double area = calculateArea(radius);
            System.out.println("The area of the circle with radius " + radius + " is: " + area);
        } catch (IllegalArgumentException e) {//iillegalArgumentException is thrown if radius is negative
            System.err.println(e.getMessage());// Print the error message
        }

        try {//try-catch block to handle exceptions
            double length = 4.0; // Example length
            double width = 3.0; // Example width
            double areaRectangle = calculateArea(length, width);
            System.out.println("The area of the rectangle with length " + length + " and width " + width + " is: " + areaRectangle);
        } catch (IllegalArgumentException e) {//illegalArgumentException is thrown if length or width is negative
            System.err.println(e.getMessage());// Print the error message
        }

    }
    //Method Overloading Example

    //method to calculate area of a circle
    public static double calculateArea(double radius) {
        if (radius < 0) {// check if the radius is negative
            // if negative, throw an exception
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return Math.PI * radius * radius;
    }
    //method to calculate area of a rectangle
    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {// check if the length or width is negative
            // if negative, throw an exception
            throw new IllegalArgumentException("Length and width cannot be negative");
        }
        return length * width; // Calculate area of rectangle
    }
}
