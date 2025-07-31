package dev.TinkerLabSandbox.ShapeAreaVolumeCalculation.Triangle;

public class Main {
    public static void main(String[] args) {

        //test case for Triangle class
        System.out.println("Testing Triangle class...");
        Triangle triangle = new Triangle(5, 5,5);
        System.out.println("Area of the triangle is: " + triangle.calculateArea());
        System.out.println("Perimeter of the triangle is: " + triangle.calculatePerimeter());
        System.out.println("Is the triangle equilateral? " + triangle.isEquilateral());

        //test for Pyramid equilateral (tetrahedron) class
        Pyramid pyramid = new Pyramid(5);
        System.out.println("\nTesting Pyramid class...");
        System.out.println("Area of the pyramid is: " + pyramid.calculateArea());
        System.out.println("Volume of the pyramid is: " + pyramid.calculateVolume());

        //test case for regular pyramid
        GeneralPyramid regularPyramid = new GeneralPyramid(5, 10, 6, 8);
        System.out.println("\nTesting RegularPyramid class...");
        System.out.println("Area of the regular pyramid is: " + regularPyramid.calculateArea());
        System.out.println("Volume of the regular pyramid is: " + regularPyramid.calculateVolume());

    }
}
