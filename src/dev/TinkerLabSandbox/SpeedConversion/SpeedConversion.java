package dev.TinkerLabSandbox.SpeedConversion;

public class SpeedConversion {
    public static void main(String[] args) {

        // Test the conversion methods
        double kiloMetersPerHour = 100.0;
        long milesPerHour = milesPerHour(kiloMetersPerHour);
        System.out.println(kiloMetersPerHour + " km/h = " + milesPerHour + " mi/h");

        // Print the conversion result
        printConversion(kiloMetersPerHour);

        // Test with an invalid value
        printConversion(-5.0);

    }
    //method to convert kilometers per hour to miles per hour
    public static long milesPerHour(double kiloMetersPerHour) {
        if (kiloMetersPerHour < 0) {// check if the input is negative
            return -1;
        }
        // Convert kilometers per hour to miles per hour
        //math.round() is used to round the result to the nearest whole number
        long milesPerHour = Math.round(kiloMetersPerHour / 1.609);
        return milesPerHour;
    }
    // method to print the conversion result
    public static void printConversion(double kiloMetersPerHour) {
        if (kiloMetersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = milesPerHour(kiloMetersPerHour);
            System.out.println(kiloMetersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
