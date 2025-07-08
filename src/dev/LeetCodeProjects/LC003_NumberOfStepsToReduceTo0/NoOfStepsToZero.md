# Number Of steps to Zero

## Problem Statement
Given a non-negative integer `num`, return the number of steps to reduce it to zero. If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

## Discussion
This problem is a straightforward exercise in understanding how to manipulate numbers through basic arithmetic operations. It helps in reinforcing the concepts of loops, conditionals, and basic arithmetic operations.

## Walkthrough
```java
public class LC003_NumberOfStepsToReduceToZero {
    public static void main(String[] args) {
        int num = 14; // Example input
        int steps = numberOfSteps(num);
        System.out.println("Number of steps to reduce " + num + " to zero: " + steps);
    }

    public static int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) { // Check if the number is even
                num /= 2; // Divide by 2 if even
            } else {
                num -= 1; // Subtract 1 if odd
            }
            steps++; // Increment the step count
        }
        return steps; // Return the total number of steps
    }
}
```
## Logic & Explanation
- **Initialization**: The method starts by initializing a variable `steps` to 0, which will hold the count of steps taken to reduce the number to zero.
- **Looping**: A `while` loop is used to continue the process until `num` becomes zero.
- **Conditionals**: Inside the loop, an `if` statement checks if `num` is even or odd:
  - If `num` is even (i.e., `num % 2 == 0`), it divides `num` by 2.
  - If `num` is odd, it subtracts 1 from `num`.
  - After each operation, the `steps` variable is incremented to count the number of operations performed.
  - The loop continues until `num` is reduced to zero.
  - Finally, the method returns the total number of steps taken.
  
## Edge Cases
- No Negative numbesr as specified in problem statement.
- **Zero Input**: If `num` is already zero, the method should return 0 immediately without entering the loop.

## Related Concepts
[[Loops]]

[[Conditionals]]: This problem is a fundamental exercise in control flow, demonstrating how to use loops and conditionals effectively.

[[Arithmetic Operations]]: Understanding basic arithmetic operations is essential for manipulating numbers in this problem.

[[Modulus Operator]]: The modulus operator is crucial for determining whether a number is even or odd, which is a key aspect of this problem.