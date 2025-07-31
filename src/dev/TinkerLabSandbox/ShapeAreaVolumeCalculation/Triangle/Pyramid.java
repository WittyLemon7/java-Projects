package dev.TinkerLabSandbox.ShapeAreaVolumeCalculation.Triangle;

//this class extends the Triangle class
// and represents a Pyramid shape, which is a 3D shape with a triangular base
// and three triangular sides.
//assuming the base is an equilateral triangle for simplicity (Tetrahedron)
public class Pyramid extends Triangle {
    public Pyramid(double sideLength) {
        super(sideLength, sideLength, sideLength);
    }

    public double calculateVolume() {
        double a = getSideA();
        return Math.pow(a, 3) / (6 * Math.sqrt(2));
    }

    public double calculateSurfaceArea() {
        double area = super.calculateArea();
        return 4 * area;
    }

    @Override
    public String toString() {
        return "RegularTetrahedron{" +
                "side=" + getSideA() +
                ", volume=" + calculateVolume() +
                ", surfaceArea=" + calculateSurfaceArea() +
                '}';
    }
}


