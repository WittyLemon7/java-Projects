package dev.TinkerLabSandbox.DaysInMonth;

public class NoOfDaysInMonth {
    public static void main(String[] args) {

        // Test cases for isLeapYear method
        System.out.println("Is 2020 a leap year? " + isLeapYear(2020)); // true
        System.out.println("Is 1900 a leap year? " + isLeapYear(1900)); // false
        System.out.println("Is 2000 a leap year? " + isLeapYear(2000)); // true
        System.out.println("Is 2021 a leap year? " + isLeapYear(2021)); // false

        // Test cases for getDaysInMonth method
        System.out.println("Days in February 2020: " + getDaysInMonth(2, 2020)); // 29
        System.out.println("Days in February 2021: " + getDaysInMonth(2, 2021)); // 28
        System.out.println("Days in April 2021: " + getDaysInMonth(4, 2021)); // 30
        System.out.println("Days in November 2021: " + getDaysInMonth(11, 2021)); // 30

    }
    //method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year < 1 && year > 9999) {// Invalid year range
            return false; // Invalid year
        }
        // A year is a leap year if it is divisible by 4, except for end-of-century years.
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {//months are always 12 in a calendar year
            return -1; // Invalid month
        }
        if (year < 1 && year > 9999) {// Invalid year range
            return -1; // Invalid year
        }

        switch (month) {// Switch statement to determine the number of days in the month
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31; // Months with 31 days
            case 4: case 6: case 9: case 11:
                return 30; // Months with 30 days
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29; // Leap year
                } else {
                    return 28; // Non-leap year
                }
            default:
                return -1; // Should not reach here
        }
    }
}
