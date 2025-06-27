package dev.projects.exercises;

public class SpeedConverter {

    public static  long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        } return Math.round(kilometersPerHour / 1.609);
    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Conversion failed");
            return;
        } long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(milesPerHour + " miles per hour" + " = kilometers per hour " + kilometersPerHour);
    }
    public static void main(String[] args) {
        printConversion(1.609);
        printConversion(27);
        printConversion(54.67);


    }
}
