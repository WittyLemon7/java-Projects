# Equality Printer
## Problem Statement
Create a program that prints the equality of two objects in a human-readable format. The program should handle different data types and provide a clear output indicating whether the objects are equal or not.
## Discussion
The Equality Printer is a simple program that checks if two objects are equal and prints the result in a human-readable format. This problem helps in understanding object comparison, type checking, and output formatting, which are fundamental concepts in programming.
## Walkthrough
```java
public class EqualityPrinter {

    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if (a != b && a != c && b != c) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static void main(String[] args) {
        printEqual(1, 1, 1); // All numbers are equal
        printEqual(1, 2, 3); // All numbers are different
        printEqual(1, 1, 2); // Neither all are equal or different
        printEqual(-1, -1, -1); // Invalid Value
    }
}
```
## Logic & Explanation
- **Input Validation**: The method first checks if any of the input integers are negative. If so, it prints "Invalid Value".
- **Equality Check**: 
  - If all three integers are equal, it prints "All numbers are equal".
  - If all three integers are different, it prints "All numbers are different".
  - If neither condition is met, it prints "Neither all are equal or different". 
 - This logic ensures that the program correctly identifies the relationship between the three integers and provides a clear output.
 - The method is designed to handle three integer inputs, but it can be extended to handle other data types by overloading the method or using generics.
## Edge Cases
- **Negative Values**: If any of the input integers are negative, the method will print "Invalid Value".
- **All Equal**: If all three integers are equal, the method will print "All numbers are equal".
- **All Different**: If all three integers are different, the method will print "All numbers are different".
- **Mixed Values**: If two integers are equal and one is different, the method will print "Neither all are equal or different".
- **Zero Values**: The method handles zero values correctly, treating them as valid integers.
## Related Concepts
- [[Object Comparison]]: This problem is a fundamental exercise in comparing objects and understanding equality in programming.
- [[Type Checking]]: The method can be extended to handle different data types, demonstrating the importance of type checking in programming.
