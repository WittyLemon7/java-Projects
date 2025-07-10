# Leap Year Calculator
## Problem Statement
Create a Leap Year Calculator that determines whether a given year is a leap year or not. A leap year is defined as a year that is divisible by 4, except for end-of-century years, which must be divisible by 400 to be considered leap years.
## Discussion
The Leap Year Calculator is a simple program that checks if a given year is a leap year based on the rules defined in the problem statement. It helps in understanding conditional statements and modular arithmetic, which are fundamental concepts in programming.
## Walkthrough
```java
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
```
## Logic & Explanation
- **Input Validation**: The method first checks if the year is within the valid range (1 to 9999). If not, it returns false.
- **Divisibility Check**: 
  - If the year is divisible by 4, it checks if it is also divisible by 100.
    - If it is divisible by 100, it further checks if it is divisible by 400. If so, it returns true (indicating a leap year).
    - If it is not divisible by 100, it returns true (indicating a leap year).
  - If the year is not divisible by 4, it returns false (indicating not a leap year).
    - This logic ensures that the leap year rules are correctly applied.
    - The method returns a boolean value indicating whether the year is a leap year or not.
## Edge Cases
- **Invalid Year**: If the input year is less than 1 or greater than 9999, the method returns false.
- **Century Years**: The method correctly handles century years (e.g., 1900, 2000) by checking the divisibility by 400.
- **Leap Year at the Start of the Range**: The year 1 is not a leap year, and the method correctly identifies it as such.
- **Leap Year at the End of the Range**: The year 9999 is not a leap year, and the method correctly identifies it as such.
- **Leap Year Calculation**: The method correctly identifies leap years like 2020, 2024, and century years like 2000 as leap years, while identifying non-leap years like 1900 and 2021 correctly.
- **Negative Years**: The method does not handle negative years, as the problem statement specifies a range of 1 to 9999. If negative years are considered, additional logic would be needed to handle them appropriately.
- **Zero Year**: The method does not handle the year 0, as it is outside the specified range. If zero is considered, additional logic would be needed to handle it appropriately.
## Related Concepts
[[Conditionals]]: This problem is a fundamental exercise in control flow, demonstrating how to use conditional statements effectively.
[[Modular Arithmetic]]: Understanding how to use the modulus operator is crucial for determining divisibility, which is a key aspect of this problem.
[[Input Validation]]: The method includes input validation to ensure that the year is within a valid range, which is an important aspect of robust programming.
[[Boolean Logic]]: The method returns a boolean value indicating whether the year is a leap year or not, demonstrating the use of boolean logic in programming.
