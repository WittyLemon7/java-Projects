package dev.TinkerLabSandbox.MinutesToYearsAndDays;

public class MinutesToYearsAndDays {
    public static void main(String[] args) {

        // Example usage of the printYearsAndDays method
        printYearsAndDays(525600); // 1 year
        printYearsAndDays(1051200); // 2 years
        printYearsAndDays(561600); // 1 year and 5 days
        printYearsAndDays(-1); // Invalid Value

    }
    //method to convert minutes to years and days
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {// Check if the input is negative
            System.out.println("Invalid Value");
        } else {
            long years = minutes / (60 * 24 * 365);// Calculate the number of years
            long days = (minutes % (60 * 24 * 365)) / (60 * 24);// Calculate the remaining days after converting to years
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
