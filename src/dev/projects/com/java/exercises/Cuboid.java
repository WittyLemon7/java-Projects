package dev.projects.com.java.exercises;

public class Cuboid extends Rectangle {

//    public static void main(String[] args) {
//        Cuboid cuboid = new Cuboid(5, 10, 15);
//        System.out.println("Width: " + cuboid.getWidth());
//        System.out.println("Length: " + cuboid.getLength());
//        System.out.println("Height: " + cuboid.getHeight());
//        System.out.println("Volume: " + cuboid.getVolume());
//    }

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height < 0 ? 0 : height;

    }
    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return getArea() * height;//volume cuboid = area * height
    }
}
