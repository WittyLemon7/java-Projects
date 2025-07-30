package dev.TinkerLabSandbox.PointDistance;

public class Main {
    public static void main(String[] args) {

        // Creating points
        Point origin = new Point();           // (0,0)
        Point pointA = new Point(3, 4);      // (3,4)
        Point pointB = new Point(6, 8);      // (6,8)

// Using the three distance methods
        double distFromOrigin = pointA.distance();        // Distance from (3,4) to (0,0)
        //distance from origin to pointA
        double distanceToPointA = origin.distance(pointA); // Distance from (0,0) to (3,4)
        //distance from origin to pointB
        double distanceToPointB = origin.distance(pointB); // Distance from (0,0) to (6,8)
        //distance from pointA to pointB
        double distanceBetweenPoints = pointA.distance(pointB); // Distance from (3,4) to (6,8)



        // Printing results
        System.out.println("Distance from origin to point A: " + distanceToPointA); // Expected output 5.0

        System.out.println("Distance from origin to point B: " + distanceToPointB); // Expected output 10.0
        System.out.println("Distance between point A and point B: " + distanceBetweenPoints); // Expected output 5.0

    }
}
