package dev.projects.exercises;

public class Point {
    private int x;
    private int y;

    //constructor with no arguments
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    //constructor that initializes the fields
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    //getter for x
    public int getX() {
        return x;
    }
    //getter for y
    public int getY() {
        return y;
    }
    //setter for x
    public void setX(int x) {
        this.x = x;
    }
    //setter for y
    public void setY(int y) {
        this.y = y;
    }
    //method to calculate distance between two points
    public double distance(){
        return Math.sqrt((0 - this.x) * (0 - this.x) + (0 - this.y) * (0 - this.y));
    }
    //method to calculate distance between two points
    public double distance(int x, int y){
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }
    //method to calculate distance between two points
    public double distance(Point another){
        return Math.sqrt((another.x - this.x) * (another.x - this.x) + (another.y - this.y) * (another.y - this.y));
    }

}
