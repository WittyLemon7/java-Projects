package dev.TinkerLabSandbox.ShapeAreaVolumeCalculation.Rectangle;

/* this class will calculate the area and volume of cuboids
 * Cuboids are 3D rectangles with length, width, and height
 * Area = 2 * (length * width + length * height + width * height)
 * Volume = length * width * height
 */
public class Cuboids extends Rectangles {

    private double height;

    public Cuboids(double length, double width, double height) {
        super(length, width);
        if (height <= 0) {//height cannot be zero or negative
            throw new IllegalArgumentException("Height must be greater than zero.");
        }
        this.height = height;
    }
    //getter & setter for height
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height <= 0) {//height cannot be zero or negative
            throw new IllegalArgumentException("Height must be greater than zero.");
        }
        this.height = height;
    }
    //overriding the area method to calculate the surface area of cuboids
    public double surfaceArea() {
        return 2 * (getLength() * getWidth() + getLength() * height + getWidth() * height);
    }
    //method to calculate the volume of cuboids
    public double calculateVolume() {
        return getLength() * getWidth() * getHeight();
    }
    // overriding the toString method to display the cuboids details
    @Override
    public String toString() {
        return "Cuboids{" +
                "length=" + getLength() +
                ", width=" + getWidth() +
                ", height=" + height +
                ", surfaceArea=" + surfaceArea() +
                ", volume=" + calculateVolume() +
                '}';
    }
}
