package dev.projects.exercises;

public class AreaCalculator1 {

    public static void main(String[] args) {
        System.out.println(area(5,10));
        System.out.println(area(5));

    }
    // write code here
    // area of circle
    //validation of input
    public static double area(double radius) {
        if (radius < 0) {
            return-1.0;
        }

        double areaCircle = (3.14 * (radius * radius));


        return areaCircle;
    }
    //area of rectangle
    //x and y ar sides of rectangle
    public static double area(double x, double y ) {
        //validation of input
        if ((x < 0) || (y < 0)) {
            return -1.0;
        }

        //calculate area of rectangle
        double areaRectangle = ((x) * (y));


        return areaRectangle;


    }
}
