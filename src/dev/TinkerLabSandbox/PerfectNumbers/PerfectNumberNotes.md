# Perfect Number
Perfect Number is a positive integer that is equal to the sum of its proper divisors (excluding itself). For example, 6 is a perfect number because its divisors are 1, 2, and 3, and their sum is 6.
## Problem Statement
Create a program that checks if a given number is a perfect number. The program should take an integer input and output whether the number is perfect or not.
## Discussion
This problem involves checking if a number is perfect by calculating the sum of its proper divisors. A perfect number is defined as a positive integer that is equal to the sum of its proper divisors (excluding itself). The program should handle user input for the number and then calculate and display whether it is a perfect number.
## Walkthrough
```java 
public class PerfectNumber {
    public static void main(String[] args) {
        int number = 28; // Example input
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false; // Perfect numbers are positive integers
        }
        
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) { // Check divisors up to half of the number
            if (number % i == 0) { // If i is a divisor
                sum += i; // Add it to the sum
            }
        }
        
        return sum == number; // Check if the sum of divisors equals the number
    }
}
```
## Logic & Explanation
- **Input Handling**: The program starts by checking if the input number is positive. If not, it returns false since perfect numbers are positive integers.
- **Looping through Possible Divisors**: A `for` loop iterates from 1 to half of the input number. For each iteration, it checks if the current number (`i`) is a divisor of the input number by using the modulus operator (`%`).
- **Calculating the Sum of Divisors**: If `i` is a divisor (i.e., `number % i == 0`), it adds `i` to the sum of divisors.
- **Checking for Perfect Numbers**: After checking all possible divisors, the program checks if the sum of divisors equals the input number. If it does, the number is perfect; otherwise, it is not.
- **Output**: The program prints whether the input number is a perfect number or not.
- **Return Value**: The method `isPerfectNumber` returns a boolean indicating whether the number is perfect.
## Edge Cases
- **Negative Numbers**: The program checks if the input number is positive. If a negative number is entered, it returns false.
- **Zero**: The program does not handle zero as a valid input for perfect numbers, as zero is not a positive integer. It returns false if zero is entered.
## Related Concepts
- [[Loops]]: The program uses a loop to iterate through potential divisors.
- [[Conditionals]]: The program uses conditional statements to check if a number is a divisor and to determine if the number is perfect.
- [[Modulus Operator]]: The modulus operator is used to determine if a number divides evenly into another number.
