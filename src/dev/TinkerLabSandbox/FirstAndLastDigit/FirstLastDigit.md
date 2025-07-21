# First and Last Digit
## Problem Statement
Create a method that takes an integer and returns the sum of its first and last digits. The method should handle negative integers by treating them as positive.
## Discussion
The First and Last Digit problem is a common exercise in programming that helps reinforce the understanding of number manipulation, particularly extracting digits from integers. This problem is useful for practicing loops, conditionals, and basic arithmetic operations.
## Walkthrough
```java
public class FirstAndLastDigit {
    // Method to calculate the sum of the first and last digits of a number
    public static int sumFirstAndLastDigit(int number) {
        // Convert negative number to positive
        if (number < 0) {
            number = -number;
        }
        
        // Get the last digit
        int lastDigit = number % 10;
        
        // Get the first digit
        while (number >= 10) {
            number /= 10;
        }
        
        // The first digit is now in 'number'
        int firstDigit = number;
        
        // Return the sum of the first and last digits
        return firstDigit + lastDigit;
    }
}
```
## Logic & Explanation
- **Negative Handling**: The method first checks if the input number is negative. If it is, the number is converted to its positive equivalent by multiplying by -1.
- **Last Digit Extraction**: The last digit is obtained using the modulus operator (`% 10`), which gives the remainder when the number is divided by 10.
- **First Digit Extraction**: A `while` loop is used to repeatedly divide the number by 10 until it is less than 10. At this point, the number contains only the first digit.
- **Sum Calculation**: Finally, the method returns the sum of the first and last digits.
- **Return Value**: The method returns the sum of the first and last digits as an integer.
## Edge Cases
- **Negative Numbers**: The method correctly handles negative integers by treating them as positive.
- **Single-Digit Numbers**: If the input is a single-digit number, the first and last digits are the same, and the method will return double that digit.
- **Zero Input**: If the input is zero, the method will return 0, as both the first and last digits are 0.
## Related Concepts
- [[Loops]]: This problem is a fundamental exercise in using loops to extract digits from a number.
- [[Conditionals]]: The use of conditionals is essential for handling negative numbers and ensuring the correct logic flow.
- [[Arithmetic Operations]]: Understanding basic arithmetic operations is crucial for manipulating numbers and extracting digits.