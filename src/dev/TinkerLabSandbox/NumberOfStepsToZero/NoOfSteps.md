#  Number of Steps to Zero
This note details the functionality and approach of the NoOfStepsToZero Java class, which contains two methods designed to calculate the minimum number of steps required to reduce a non-negative integer to zero. The rules for reduction are: if the number is even, divide it by 2; if it's odd, subtract 1. Both methods leverage bitwise operations for efficient processing.

## 1. noOfSteps(int num) Method
   Purpose: This method calculates the steps to reduce num to zero using a direct bitwise check for even/odd.

## Approach:
The method uses a while loop that continues as long as num is greater than 0. Inside the loop, it performs the following:

### Even Check: if ((num & 1) == 0)

This condition uses a bitwise AND operation (&) between the current num and 1.

If the least significant bit (LSB) of num is 0 (meaning num is even), the result of num & 1 will be 0.

If num is even, it's divided by 2 using the right bit-shift operator (>>= 1). This is equivalent to num = num / 2; but is often more performant for integer division by powers of 2.

### Odd Check: else block

If the LSB of num is 1 (meaning num is odd), the else block is executed.

num is reduced by 1 (num -= 1;).

### Step Count: In each iteration, steps is incremented to count the operation performed.

### Example:
For num = 30:

30 (even) → 15 (1 step)

15 (odd) → 14 (2 steps)

14 (even) → 7 (3 steps)

7 (odd) → 6 (4 steps)

6 (even) → 3 (5 steps)

3 (odd) → 2 (6 steps)

2 (even) → 1 (7 steps)

1 (odd) → 0 (8 steps)
Total steps: 8

## 2. noOfStepsToZero(int num) Method
   #### Purpose: This method also calculates the steps to reduce num to zero, but it uses a named constant (bitmask) for clarity in the even/odd check.

## Approach:
This method is functionally identical to noOfSteps(int num). The primary difference lies in the explicit definition of final int ODD_MASK = 1;.

### Even Check: if ((num & ODD_MASK) == 0)

Instead of directly using the literal 1, it uses the ODD_MASK constant.

The logic remains the same: if the bitwise AND with 1 (represented by ODD_MASK) results in 0, the number is even and is right-shifted (>>= 1).

### Odd Check: else block

If odd, num is decremented by 1 (num -= 1;).

Step Count: steps is incremented in each iteration.

#### Key Differences in Approach and Rationale:
The core logic and efficiency of both methods are identical. Both utilize the bitwise AND operator (&) with 1 to determine if a number is even or odd, which is a highly efficient way to perform this check at a low level.

The difference is purely stylistic and related to code readability and maintainability:

noOfSteps (Direct Literal): Uses the integer literal 1 directly in the bitwise operation (num & 1). This is concise and common for experienced developers familiar with bitwise tricks.

noOfStepsToZero (Named Constant/Bitmask): Defines final int ODD_MASK = 1; and then uses ODD_MASK in the condition (num & ODD_MASK).

Benefit: Using a named constant like ODD_MASK makes the code more self-documenting. It explicitly states the purpose of the 1 in the bitwise operation (i.e., it's a mask to check for oddness). This can improve code clarity for developers who might not immediately recognize the (num & 1) pattern or for larger codebases where such constants enhance consistency.

Trade-off: It adds a very minor amount of verbosity by declaring the constant.

In essence, noOfStepsToZero is a slightly more explicit and arguably more readable version of noOfSteps for the same underlying bitwise logic. Both are efficient solutions to the problem.