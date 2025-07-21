# Same Last Digit
## Problem Statement
Create a method that checks if two integers have the same last digit. The method should return true if the last digits are equal, and false otherwise.
## Discussion
The Same Last Digit method is designed to compare the last digits of two integers. This can be useful in various scenarios, such as validating input or ensuring consistency in data processing. It helps reinforce the concept of modular arithmetic and understanding how to extract specific digits from numbers.
## Walkthrough
```java
public class SameLastDigit {
    // Method to check if two integers have the same last digit
    public static boolean hasSameLastDigit(int num1, int num2) {
        // Check if either number is negative
        if (num1 < 0 || num2 < 0) {
            return false; // Return false for negative numbers
        }
        
        // Extract the last digits using modulo operation
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        
        // Compare the last digits
        return lastDigit1 == lastDigit2;
    }
}
```
## Logic & Explanation
- **Parameters**: The method `hasSameLastDigit` takes two integer parameters: `num1` and `num2`.
- **Negative Check**: The method first checks if either number is negative. If so, it returns false, as the problem statement specifies that negative numbers are not considered.
- **Last Digit Extraction**: The last digit of each number is extracted using the modulo operation (`% 10`). This operation gives the remainder when the number is divided by 10, effectively isolating the last digit.
- **Comparison**: The method then compares the last digits of both numbers. If they are equal, it returns true; otherwise, it returns false.
- **Return Value**: The method returns a boolean value indicating whether the last digits of the two integers are the same.
## Edge Cases
- **Negative Numbers**: The method correctly handles negative numbers by returning false immediately if either number is negative.
- **Zero Values**: The method correctly identifies zero as having a last digit of 0, which can be compared with other numbers.
- **Single-Digit Numbers**: The method handles single-digit numbers correctly, as their last digit is the number itself.
## Related Concepts
- [[Modular Arithmetic]]: This problem is a fundamental exercise in using the modulo operator to extract specific digits from numbers.
- [[Conditional Statements]]: The method uses conditional statements to handle negative numbers and determine the return value based on the comparison of last digits.
- [[Comparison Operators]]: The use of comparison operators (`==`) is essential for checking the equality of the last digits.
- [[Arithmetic Operations]]: Understanding basic arithmetic operations is crucial for manipulating numbers in this problem.
- [[Input Validation]]: The method includes input validation to ensure that negative numbers are handled appropriately, reinforcing the importance of validating inputs in programming.
- [[Boolean Logic]]: The method returns a boolean value, demonstrating the use of boolean logic in programming to represent true/false conditions.
