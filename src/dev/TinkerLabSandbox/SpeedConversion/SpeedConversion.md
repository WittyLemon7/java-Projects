# Speed Conversion
## Problem Statement
Create a program that converts speed from kilometers per hour (km/h) to miles per hour (mph) and vice versa. The program should allow the user to input a speed value and specify the conversion direction (km/h to mph or mph to km/h).
## Discussion
This problem involves converting speed units between kilometers per hour (km/h) and miles per hour (mph). The conversion factors are:
- 1 km/h = 0.621371 mph
- 1 mph = 1.60934 km/h
- The program should handle user input for the speed value and the conversion direction, perform the conversion, and display the result.
- The program should also handle invalid inputs gracefully, ensuring that the user is prompted to enter a valid speed value and conversion direction.
# Overview
1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. This method needs to return the rounded value of the calculation of type long.

If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.

Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion and rounding, check the notes in the text below.



Examples of input/output:

toMilesPerHour(1.5); → should return value 1

toMilesPerHour(10.25); → should return value 6

toMilesPerHour(-5.6); → should return value -1

toMilesPerHour(25.42); → should return value 16

toMilesPerHour(75.114); → should return value 47



2. Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.

This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.

Then it needs to print a message in the format "XX km/h = YY mi/h".

XX represents the original value kilometersPerHour.
YY represents the rounded milesPerHour from the kilometersPerHour parameter.

If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".

## Walkthrough
```java
 public static long milesPerHour(double kiloMetersPerHour) {
        if (kiloMetersPerHour < 0) {// check if the input is negative
            return -1;
        }
        // Convert kilometers per hour to miles per hour
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
```
## Logic & Explanation
- **Method `milesPerHour`**: This method takes a double parameter `kiloMetersPerHour`. It checks if the input is negative. If it is, it returns -1 to indicate an invalid value. If the input is valid, it converts kilometers per hour to miles per hour using the conversion factor (1 km/h = 0.621371 mph) and rounds the result before returning it as a long value.
- **Method `printConversion`**: This method takes a double parameter `kiloMetersPerHour`. It checks if the input is negative. If it is, it prints "Invalid Value". If the input is valid, it calls the `milesPerHour` method to get the converted value and prints the result in the format "XX km/h = YY mi/h", where XX is the original kilometers per hour value and YY is the converted miles per hour value.
- **Rounding**: The conversion from kilometers per hour to miles per hour is done using the `Math.round` method to ensure that the result is rounded to the nearest whole number.
- **Input Validation**: The program checks for negative input values and handles them appropriately by returning -1 or printing "Invalid Value".
- **Output Formatting**: The output is formatted to clearly show the conversion result, making it user-friendly and easy to understand.

## Edge Cases
- **Negative Input**: If the input value for kilometers per hour is negative, the program should return -1 or print "Invalid Value" to indicate that the input is invalid.
- **Zero Input**: If the input value is zero, the program should correctly convert it to zero miles per hour and print "0 km/h = 0 mi/h".

## Related Concepts
- [[Conversion Factors]]: Understanding how to convert between different units of measurement is essential in this problem.
- [[Rounding]]: `Math.round();`The use of rounding methods to ensure that the output is presented as a whole number.
