## FizzBuzz
FizzBuzz is a classic programming problem often used in coding interviews and exercises to test basic programming skills.

## Problem Statement
Write a program that prints the numbers from 1 to 100. But for multiples of three, print "Fizz" instead of the number, and for the multiples of five, print "Buzz". For numbers which are multiples of both three and five, print "FizzBuzz".

## Discussion
This problem is a great exercise for understanding control flow, loops, and conditionals in programming. It helps in reinforcing the concepts of modulus operations and logical conditions.

## Walkthrough
```java
 public static void fizzBuzz(int n) {// FizzBuzz implementation
        for (int i = 1; i <= n; i++) {// Loop from 1 to n
            if (i % 3 == 0 && i % 5 == 0) {// Check if divisible by both 3 and 5
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {// Check if divisible by 3
                System.out.println("Fizz");
            } else if (i % 5 == 0) {// Check if divisible by 5
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
```
🔹- **Looping**: The loop iterates from 1 to `n`, where `n` is the upper limit (100 in this case).

??- **Conditionals**: 
  - The first condition checks if the number is divisible by both 3 and 5 using the modulus operator (`%`).
  - The second condition checks if the number is divisible by 3.
  - The third condition checks if the number is divisible by 5.
  - If none of these conditions are met, it simply prints the number.

## Logic & Explanation
- **Initialization**: The method starts by defining a loop that runs from 1 to `n`.
- **Divisibility Checks**: 
  - The first check for divisibility by both 3 and 5 ensures that "FizzBuzz" is printed for numbers like 15, 30, etc.
  - The second check for divisibility by 3 prints "Fizz" for numbers like 3, 6, etc.
  - The third check for divisibility by 5 prints "Buzz" for numbers like 5, 10, etc.`

- **Default Case**: If none of the conditions are met, the number itself is printed.
- **Output**: The output is printed directly to the console, showing either the number or the corresponding string ("Fizz", "Buzz", or "FizzBuzz").

## Edge Cases
- **Negative Numbers**: If `n` is negative, the loop will not execute, and nothing will be printed.
- **Zero**: If `n` is zero, the loop will also not execute, resulting in no output.

## Related Concepts
[[Control Flow]]: This problem is a fundamental exercise in control flow, demonstrating how to use loops and conditionals effectively.
[[Modulus Operator]]: The modulus operator is crucial for determining divisibility, which is a key aspect of this problem.
[[Loops]]: Understanding loops is essential for iterating through a range of numbers and applying conditions to each.
[[Conditionals]]: The use of `if-else` statements is fundamental in determining which output to print based on the conditions met.