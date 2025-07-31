package dev.TinkerLabSandbox.ShapeAreaVolumeCalculation.Circle;

public class Sphere1 extends Circle1 {

    public Sphere1(double radius) {
        super(radius);//inherits from circles
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);// Calculate the volume of the sphere
    }
    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);// Calculate the surface area of the sphere
    }
}
