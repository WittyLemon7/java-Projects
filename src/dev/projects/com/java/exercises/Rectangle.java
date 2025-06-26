package dev.projects.com.java.exercises;

public class Rectangle {

    private double width;
    private double length;

    //constructor with validation
    public Rectangle(double width, double length){
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }
    //getters
    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }
    //setters

    public void setWidth(double width) {
        if (width < 0){
            this.width = 0;
        }else {
            this.width = width;
        }
    }

    public void setLength(double length) {
        if (length < 0){
            this.length = 0;
        }else {
            this.length = length;
        }
    }
//method to get area
    public double getArea() {
        return width * length;
    }
    //method to get perimeter
    public double getPerimeter() {
        return 2 * (width + length);
    }
    //method to compare rectangles
    public boolean isSameArea(Rectangle rectangle){
        return this.getArea() == rectangle.getArea();
    }
    //method to scale & resize rectangle
    public String scale(double factor) {
        if (factor <= 0) {
            //throw to generate an exception
            //IllegalArgumentException is a subclass of RuntimeException
            //in this context it is to signal the scale factor must be a positive number
            throw new IllegalArgumentException("Scaling factor must be positive.");
        }
        this.width *= factor;
        this.length *= factor;
        return "Scaled to width: " + this.width + ", length: " + this.length;
    }
    //rotate rectangle (optional)
    public String rotate() {
        double temp = this.width;
        this.width = this.length;
        this.length = temp;
        return "Rotated to width: " + this.width + ", length: " + this.length;
    }

}
