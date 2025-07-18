# Sum of Odd Numbers
## Problem Statement
Create a method that calculates the sum of all odd numbers from 1 to a given integer `n`. The method should return the sum of these odd numbers.
## Discussion
The Sum of Odd Numbers problem is a straightforward exercise in understanding loops and conditional statements. It helps reinforce the concept of iterating through a range of numbers and selectively summing those that meet a specific condition (in this case, being odd).
## Walkthrough
```java
  //method to check odd
    public static boolean isOdd(int num) {
        return num > 0 && num % 2 != 0; // check if number is positive and not divisible by 2
    }
    //method to calculate sum of odd
    public static int sumOdd(int start, int  end) {
        if (start < 0 || end < 0) {// parameters should be positive
            return -1;
        }
        int sum = 0;// initialise sum

        for (int i = start; i <= end; i++) {//iterate through range
            if (isOdd(i)) {//if odd
                sum += i;// add that to sum
            }
        }
        return sum;
    }
```
## Logic & Explanation
- **Parameters**: The method `sumOdd` takes two integer parameters: `start` and `end`, which define the range of numbers to consider.
- **Validation**: The method checks if either `start` or `end` is negative. If so, it returns -1 to indicate an invalid input.
- **Initialization**: A variable `sum` is initialized to 0 to hold the cumulative sum of odd numbers.
- **Looping through the Range**: A `for` loop iterates from `start` to `end`, inclusive.
- **Odd Check**: Inside the loop, the `isOdd` method is called to check if the current number `i` is odd. If it is, `i` is added to `sum`.
- **Return Value**: After the loop completes, the method returns the total sum of odd numbers within the specified range.
## Edge Cases
- **Negative Inputs**: If either `start` or `end` is negative, the method returns -1, indicating an invalid input.
- **Zero and One**: If `start` is 0 or 1, the method should correctly handle these cases, returning 0 or 1 respectively, as they are not odd numbers.
- **Single Odd Number**: If the range includes only one odd number, the method should return that number.
## Related Concepts
- [[Loops]]: This problem is a fundamental exercise in using loops to iterate through a range of numbers.
- [[Conditional Statements]]: The use of conditional statements is essential for checking if a number is odd.
- [[Arithmetic Operations]]: Understanding basic arithmetic operations is crucial for summing numbers.