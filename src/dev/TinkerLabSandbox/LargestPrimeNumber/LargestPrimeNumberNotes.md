# Largest Prime Number
A `Prime Number` is a natural number greater than 1 that cannot be formed by multiplying two smaller natural numbers.
- A `Largest Prime Number` problem involves finding the largest prime number within a given range or up to a certain limit.
## Problem Statement
Create a method that finds the largest prime number less than or equal to a given integer. The method should return the largest prime number found, or -1 if no prime number exists in the range.
## Discussion
The Largest Prime Number problem is a common exercise in programming that helps reinforce the understanding of prime numbers and algorithms for finding them. This problem is useful for practicing loops, conditionals, and basic arithmetic operations. The method should efficiently find the largest prime number less than or equal to a given integer.
## Walkthrough
```java
public class LargestPrimeNumber {
    // Method to find the largest prime number less than or equal to a given integer
    public static int getLargestPrime(int number) {
        // Check if the number is less than 2, as there are no prime numbers less than 2
        if (number < 2) {
            return -1; // Return -1 if no prime number exists
        }
        
        // Start checking from the given number down to 2
        for (int i = number; i >= 2; i--) {
            if (isPrime(i)) {
                return i; // Return the first prime number found
            }
        }
        
        return -1; // Return -1 if no prime number is found
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false; // Numbers less than 2 are not prime
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible by any number other than 1 and itself, it's not prime
            }
        }
        
        return true; // The number is prime
    }
}
```
## Logic & Explanation
- **Input Handling**: The method `getLargestPrime` starts by checking if the input number is less than 2. If it is, the method returns -1, as there are no prime numbers less than 2.
- **Looping through Possible Prime Numbers**: A `for` loop iterates from the input number down to 2. For each iteration, it checks if the current number (`i`) is prime by calling the `isPrime` method.
- **Prime Check**: The `isPrime` method checks if a number is prime by iterating from 2 to the square root of the number. If the number is divisible by any of these values, it is not prime.
- **Return Value**: If a prime number is found, it is returned immediately. If no prime number is found after checking all numbers down to 2, the method returns -1.
- **Efficiency**: The algorithm efficiently checks for prime numbers by reducing the number of iterations needed through the use of the square root in the `isPrime` method.
## Edge Cases
- **Negative Numbers**: If the input number is negative or zero, the method will return -1, as there are no prime numbers in that range.
- **Single-Digit Numbers**: The method correctly identifies single-digit prime numbers (2, 3, 5, 7) and returns the largest one if applicable.
- **Large Numbers**: The method can handle large numbers, but performance may degrade for very large inputs due to the number of iterations required. Consider optimizing for larger inputs if necessary.
- **Prime Number Input**: If the input number is already a prime number, the method will return that number as it is the largest prime number less than or equal to itself.
## Related Concepts
- [[Prime Numbers]]: Understanding the definition and properties of prime numbers is essential for this problem.
- [[Loops]]: The program uses loops to iterate through potential prime numbers.
- [[Conditionals]]: The program uses conditional statements to check if a number is prime and to handle edge cases.
- [[Mathematical Operations]]: The method uses basic arithmetic operations to check for divisibility and to find the square root of numbers.
