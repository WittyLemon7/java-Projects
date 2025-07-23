# Greatest Common Divisor
Greatest Common Divisor GCD is the `Greatest Number that Divides` both input numbers.
## Problem Statement
Create a method that calculates the Greatest Common Divisor (GCD) of two integers. The method should return the GCD as an integer.
## Discussion
The GCD is a fundamental concept in number theory, representing the largest integer that divides two numbers without leaving a remainder. This problem is useful for practicing algorithms related to divisibility, loops, and conditionals. It also has applications in simplifying fractions and finding common factors in various mathematical contexts.
## Walkthrough
```java
public class GCD {
    // Method to calculate the GCD of two integers
    public static int getGreatestCommonDivisor(int first, int second) {
        // Check for negative inputs
        if (first < 0 || second < 0) {
            return -1; // Return -1 for negative inputs
        }
        
        // Ensure first is greater than second
        if (first < second) {
            int temp = first;
            first = second;
            second = temp;
        }
        
        // Loop to find the GCD
        for (int i = second; i >= 1; i--) {
            if (first % i == 0 && second % i == 0) {
                return i; // Return the GCD when found
            }
        }
        
        return 1; // If no common divisor found, return 1
    }
}
```
## Logic & Explanation
- **Input Handling**: The method `getGreatestCommonDivisor` takes two integer parameters: `first` and `second`. It first checks if either number is negative. If so, it returns -1, indicating that negative inputs are not valid for this calculation.
- **Swapping Values**: If the first number is less than the second, it swaps their values to ensure that `first` is always greater than or equal to `second`. This simplifies the logic for finding the GCD.
- **Looping through Possible Divisors**: The method uses a `for` loop to iterate from `second` down to 1. For each iteration, it checks if both `first` and `second` are divisible by the current value of `i`.
- **Finding the GCD**: If both numbers are divisible by `i`, it returns `i` as the GCD. The loop starts from the largest possible divisor (which is `second`) and works downwards, ensuring that the first divisor found is the greatest.
- **Return Value**: If no common divisor is found (which is unlikely for positive integers), the method returns 1, as 1 is a common divisor for all integers.
- **Return Type**: The method returns an integer representing the GCD of the two input numbers.
## Edge Cases
- **Negative Inputs**: The method correctly handles negative inputs by returning -1, indicating that GCD cannot be calculated for negative numbers.
- **Zero Inputs**: The method does not explicitly handle zero inputs. If either input is zero, the GCD is undefined in this context, and the method will return 1, which may not be the desired behavior. Consider adding specific handling for zero if needed.
- **Same Numbers**: If both numbers are the same, the GCD will be the number itself, which is correctly handled by the loop.
- **Prime Numbers**: If both numbers are prime and different, the GCD will be 1, which is also correctly handled by the loop.
## Related Concepts
- [[Number Theory]]: The GCD is a fundamental concept in number theory, often used in various mathematical applications.
- [[Divisibility]]: Understanding how numbers divide into each other is crucial for calculating the GCD.
- [[Loops]]: The use of loops to iterate through potential divisors is a common programming technique.
- [[Conditionals]]: Conditional statements are used to check for negative inputs and to determine if a number is a divisor of both inputs.
