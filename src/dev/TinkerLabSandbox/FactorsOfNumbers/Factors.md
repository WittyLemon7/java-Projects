# Factors
## Problem Statement
Create a program that finds all the factors of a given number. The program should allow the user to input a number and then display all the factors of that number.
## Discussion
This problem involves finding the `factors` of a number, which are the `integers that divide the number evenly without leaving a remainder`. The program should handle user input for the number and then calculate and display its factors. It should also handle edge cases such as negative numbers and zero.
## Walkthrough
```java
public class FactorsOfNumbers {
    public static void main(String[] args) {
        int number = 28; // Example input
        System.out.println("Factors of " + number + ":");
        findFactors(number);
    }

    public static void findFactors(int number) {
        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than zero.");
            return;
        }
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check if i is a factor of number
                System.out.print(i + " "); // Print the factor
            }
        }
        System.out.println(); // New line after printing all factors
    }
}
```
## Logic & Explanation
- **Input Handling**: The program starts by checking if the input number is positive. If not, it prompts the user to enter a valid number.
- **Looping through Possible Factors**: A `for` loop iterates from 1 to the input number. For each iteration, it checks if the current number (`i`) is a factor of the input number by using the modulus operator (`%`).
- **Printing Factors**: If `i` is a factor (i.e., `number % i == 0`), it prints `i` as a factor of the input number.
- **Output**: After checking all possible factors, the program prints them in a single line, separated by spaces.
## Edge Cases
- **Negative Numbers**: The program checks if the input number is positive. If a negative number is entered, it prompts the user to enter a valid positive integer.
- **Zero**: The program does not handle zero as a valid input for finding factors, as zero has an infinite number of factors. It prompts the user to enter a positive integer greater than zero.
- **Large Numbers**: The program can handle large numbers, but performance may degrade for very large inputs due to the linear search for factors. Consider optimizing for larger inputs if necessary.
- **Prime Numbers**: If a prime number is entered, the program will only print 1 and the number itself as factors.
## Related Concepts
- [[Loops]]: The program uses a loop to iterate through potential factors.
- [[Conditionals]]: The program uses conditional statements to check if a number is a factor.
- [[Modulus Operator]]: The modulus operator is used to determine if a number divides evenly into another number.
- [[Input Validation]]: The program validates user input to ensure it is a positive integer greater than zero.
- [[Factors and Multiples]]: Understanding the concept of factors is essential for this problem.
