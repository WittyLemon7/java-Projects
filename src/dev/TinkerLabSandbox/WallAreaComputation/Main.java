package dev.TinkerLabSandbox.WallAreaComputation;

public class Main {
    public static void main(String[] args) {

        // Example usage of the WallArea class
        WallArea wall1 = new WallArea(5.0, 4.0); // width = 5.0, height = 4.0
        WallArea wall2 = new WallArea(3.0, 2.5); // width = 3.0, height = 2.5

        // Calculate and print the area of each wall
        System.out.println("Area of wall1: " + wall1.getArea()); // Expected output: 20.0
        System.out.println("Area of wall2: " + wall2.getArea()); // Expected output: 7.5

        // Calculate and print the total area of both walls
        double totalArea = wall1.getArea() + wall2.getArea();
        System.out.println("Total area of both walls: " + totalArea); // Expected output: 27.5
    }
}
