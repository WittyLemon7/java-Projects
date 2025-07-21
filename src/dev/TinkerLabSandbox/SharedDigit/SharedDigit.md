# Shared Digit
## Problem Statement
Create a method that checks if two integers share at least one digit in the same position. The method should return true if they share a digit, and false otherwise.
## Discussion
The Shared Digit method is designed to determine if two integers share at least one digit in the same position. This can be useful in various scenarios, such as validating input or ensuring consistency in data processing. The method checks each digit of the two integers and returns a boolean result indicating whether they share a digit.
## Walkthrough
```java
public static boolean hasSharedDigit(int num1, int num2) {
    // Check if both numbers are in the range of 10 to 99
    if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
        return false;
    }
    
    // Extract digits from the first number
    int firstDigitNum1 = num1 / 10; // Tens place
    int secondDigitNum1 = num1 % 10; // Units place
    
    // Extract digits from the second number
    int firstDigitNum2 = num2 / 10; // Tens place
    int secondDigitNum2 = num2 % 10; // Units place
    
    // Check for shared digits
    return (firstDigitNum1 == firstDigitNum2 || firstDigitNum1 == secondDigitNum2 ||
            secondDigitNum1 == firstDigitNum2 || secondDigitNum1 == secondDigitNum2);
}
```
## Logic & Explanation
- **Input Validation**: The method first checks if both integers are within the range of 10 to 99. If either number is outside this range, it returns `false`.
- **Digit Extraction**: The method extracts the tens and units digits from both integers using division and modulus operations.
- **Shared Digit Check**: It then checks if any of the digits from the first number match any of the digits from the second number. If a match is found, it returns `true`; otherwise, it returns `false`.
- **Return Value**: The method returns a boolean value indicating whether the two integers share at least one digit in the same position.
## Edge Cases
- **Invalid Input**: If either number is less than 10 or greater than 99, the method will return `false`, ensuring that only valid two-digit numbers are processed.
- **Same Digits**: If both numbers are the same (e.g., 12 and 12), the method will return `true`, as they share both digits.
- **Different Digits**: If the two numbers have no shared digits (e.g., 12 and 34), the method will return `false`.
- **Zero Digits**: The method does not handle cases where either number contains a zero, as both numbers must be two-digit integers.
- **Negative Numbers**: The method does not handle negative integers, as it is designed to work with two-digit positive integers only.
- **Leading Zeros**: The method assumes that the input integers are two-digit numbers without leading zeros (e.g., 01 is not considered valid).
## Related Concepts
- [[Input Validation]]: This problem emphasizes the importance of validating input to ensure that only valid data is processed.
- [[Digit Extraction]]: The method demonstrates how to extract individual digits from integers using arithmetic operations.
- [[Boolean Logic]]: The use of boolean logic to determine if two integers share a digit is a fundamental concept in programming.
- [[Conditional Statements]]: The method uses conditional statements to check the validity of the input and to determine if the digits are shared.