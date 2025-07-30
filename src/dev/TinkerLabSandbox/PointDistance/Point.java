package dev.TinkerLabSandbox.PointDistance;

public class Point {

    private int x; // instance variable for x-coordinate
    private int y; // instance variable for y-coordinate

    // constructor that initialises the point with given x and y coordinates
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // default constructor that initialises to 0,0
    // this is useful for creating a point without specifying coordinates
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    // getter for x-coordinate
    public int getX() {
        return x;
    }
    //getter for y-coordinate
    public int getY() {
        return y;
    }
    //setter for x-coordinate
    public void setX(int x) {
        this.x = x;
    }
    //setter for y-coordinate
    public void setY(int y) {
        this.y = y;
    }
    // method to calculate the distance from the origin (0,0) to the point (x,y)
    public double distance() {
        // calculates the distance from the origin (0,0) to the point (x,y)
        return Math.sqrt(0 - this.x) * (0 - this.x) + (0 - this.y) * (0 - this.y);
    }
    // method to calculate the distance from a given point (x,y) to the point (this.x,this.y)
    public double distance(int x, int y) {
        // calculates the distance from the point (x,y) to the point (this.x,this.y)
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }
    // method to  calculate between 2 points
    public double distance(Point point) {
        // calculates the distance from the given point to this point
        return Math.sqrt((point.x - this.x) * (point.x - this.x) + (point.y - this.y) * (point.y - this.y));
    }
}
