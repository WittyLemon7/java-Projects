# Equal Sum
## Problem Statement
Create a method that checks if two integers have the same sum of elements. The method should return true if the sums are equal, and false otherwise.
## Discussion
The Equal Sum method is designed to compare the sums of two integers. It checks if the sum of the digits in both integers is equal, returning a boolean result. This can be useful in various scenarios, such as validating input or ensuring consistency in data processing.
## Walkthrough
```java
public static boolean hasEqualSum(int num1, int num2, int num3_) {
    // Calculate the sum of the first two integers
    int sum1 = num1 + num2;
    
    // Compare the sum with the third integer
    return sum1 == num3_;
}
```
## Logic & Explanation
- **Sum Calculation**: The method calculates the sum of the first two integers (`num1` and `num2`) and stores it in `sum1`.
- **Comparison**: It then compares `sum1` with the third integer (`num3_`). If they are equal, the method returns `true`; otherwise, it returns `false`.
- **Return Value**: The method returns a boolean value indicating whether the sums are equal.
## Edge Cases
- **Negative Numbers**: The method should handle negative integers correctly, ensuring that the sum is calculated accurately.
- **Zero Values**: The method should correctly handle cases where one or more integers are zero, ensuring that the comparison is valid.
## Related Concepts
- [[Arithmetic Operations]]: Understanding basic arithmetic operations is essential for manipulating numbers in this problem.
- 