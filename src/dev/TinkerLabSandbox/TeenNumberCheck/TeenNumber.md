# Teen Number
## Problem Statement
Create a method that checks if a given number is a "teen" number. A teen number is defined as any integer between 13 and 19, inclusive.
## Discussion
This problem tests the basic understanding of conditional statements and range checking in Java. It helps reinforce the concept of using logical operators to determine if a number falls within a specific range.
## Walkthrough
```java
public class TeenNumberChecker {
    // Method to check if a number is a teen number
    public static boolean hasTeen(int num1, int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    // Helper method to check if a single number is a teen number
    private static boolean isTeen(int number) {
        return number >= 13 && number <= 19;
    }
}
```
## Logic & Explanation
- **Parameters**: The method `hasTeen` takes three integer parameters: `num1`, `num2`, and `num3`.
- **Teen Check**: The method uses a helper method `isTeen` to check if each number is a teen number. The `isTeen` method returns true if the number is between 13 and 19, inclusive.
- **Logical OR**: The `hasTeen` method uses the logical OR operator (`||`) to check if any of the three numbers is a teen number. If at least one of them is a teen number, it returns true; otherwise, it returns false.
- **Return Value**: The method returns a boolean value indicating whether any of the three numbers is a teen number.
## Edge Cases
- **Negative Numbers**: The method correctly handles negative numbers, as they cannot be teen numbers.
- **Zero**: The method correctly identifies zero as not being a teen number.
- **Boundary Values**: The method correctly identifies the boundary values 13 and 19 as teen numbers, while 12 and 20 are not considered teen numbers.
## Related Concepts
- [[Conditional Statements]]: This problem is a fundamental exercise in using conditional statements to check if a number falls within a specific range.
- [[Logical Operators]]: The use of logical operators (`||`) is essential for combining multiple conditions in the `hasTeen` method.