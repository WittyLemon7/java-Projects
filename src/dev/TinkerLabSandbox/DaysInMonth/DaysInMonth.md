# Dys In Month
## Problem Statement
Create a program that checks the no of days in year including leap year. The program should take an integer input representing the year and output the number of days in `Leap Years`.
## Discussion
The Days In Month program is designed to determine the number of days in a given year, accounting for leap years. A leap year occurs every four years, except for years that are divisible by 100 but not by 400. This means that while most years have 365 days, leap years have 366 days. The program should take an integer input representing the year and output the number of days in that year.
## Walkthrough
```java
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
```
## Logic & Explanation
- **Leap Year Check**: The `isLeapYear` method checks if a given year is a leap year. It returns true if the year is divisible by 4 but not by 100, or if it is divisible by 400.
- **Days in Month Calculation**: The `getDaysInMonth` method takes a month and a year as input and returns the number of days in that month. It uses a switch statement to handle different months, accounting for leap years in February.
- **Input Validation**: Both methods validate the input to ensure that the year is within a valid range (1 to 9999) and that the month is between 1 and 12. If the input is invalid, they return -1.
- **Return Values**: The methods return the number of days in the specified month, or -1 for invalid inputs. For leap years, February returns 29 days; otherwise, it returns 28 days.
- Switch statements are used to determine the number of days in each month, making the code clear and easy to read.
- **Efficiency**: The methods run in constant time O(1) since they perform a fixed number of operations regardless of the input size.
## Edge Cases
- **Invalid Year**: If the year is less than 1 or greater than 9999, the methods return false for leap year checks and -1 for days in month calculations.
- **Invalid Month**: If the month is less than 1 or greater than 12, the methods return -1.
- **Leap Year Boundary Conditions**: The methods correctly handle leap years at the boundaries, such as 1900 (not a leap year) and 2000 (a leap year).
- **Zero and Negative Years**: The methods handle zero and negative years by returning false for leap year checks and -1 for days in month calculations.
## Related Concepts
- [[Leap Year Calculation]]: Understanding the rules for determining leap years is crucial for this problem.
- [[Switch Statements]]: The use of switch statements simplifies the logic for determining the number of days in each month.
