package dev.TinkerLabSandbox.LeapYearCalculator;

public class LeapYearCalculation {
    public static void main(String[] args) {

        // Test the isLeapYear method with various years
        int[] testYears = {2000, 2004, 1900, 2021, 2024, 9999, 10000, -1};
        for (int year : testYears) {
            System.out.println("Year " + year + " is a leap year: " + isLeapYear(year));
        }

    }
    //method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {//check if year is within valid range
            return false; // Invalid year
        }
        if (year % 4 == 0) {//check if divisible by 4
            if (year % 100 == 0) {
                return year % 400 == 0; // Divisible by 400 is a leap year
            }
            return true; // Divisible by 4 but not by 100 is a leap year
        }
        return false; // Not divisible by 4 is not a leap year
    }
}
