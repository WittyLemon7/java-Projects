# Decimal Comparator
## Problem Statement
Create a `DecimalComparator` class that compares two decimal numbers and checks if they are equal up to a specified number of decimal places. The class should provide a method to perform the comparison and return a boolean result.
## Discussion
The `DecimalComparator` class is designed to compare two decimal numbers for equality up to a specified number of decimal places. This is useful in scenarios where precision is important, such as financial calculations or scientific measurements. The class encapsulates the logic for comparing decimals, providing a clear interface for users to perform the comparison.
## Walkthrough
```java
public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
    // Round both numbers to three decimal places
    firstNumber = Math.round(firstNumber * 1000.0) / 1000.0;
    secondNumber = Math.round(secondNumber * 1000.0) / 1000.0;
    
    // Compare the rounded numbers
    return firstNumber == secondNumber;
}
```
## Logic & Explanation
- **Rounding**: The method rounds both `firstNumber` and `secondNumber` to three decimal places using the formula `Math.round(number * 1000.0) / 1000.0`. This ensures that the comparison is done at the desired precision.
- **Comparison**: After rounding, the method checks if the two numbers are equal using the `==` operator. If they are equal, it returns `true`; otherwise, it returns `false`.
- **Return Value**: The method returns a boolean value indicating whether the two numbers are equal up to three decimal places.
## Edge Cases
- **Negative Numbers**: The method should handle negative decimal numbers correctly, ensuring that the comparison is accurate regardless of the sign.
- **Zero Values**: The method should correctly compare zero values, ensuring that `0.000` is considered equal to `0.000`.
- **Precision Issues**: The method should be robust against floating-point precision issues, ensuring that small discrepancies do not affect the comparison.
