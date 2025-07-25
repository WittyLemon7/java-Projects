# Calculator
## Overview
The Calculator project is a simple command-line calculator that performs basic arithmetic operations such as addition, subtraction, multiplication, and division. It allows users to input two numbers and an operator, and it outputs the result of the operation.
## Discussion
The Calculator project is a fundamental exercise in programming that helps reinforce the understanding of basic arithmetic operations, user input handling, and output formatting. This project is useful for practicing loops, conditionals, and basic arithmetic operations. It also serves as a good introduction to building command-line applications.
## Walkthrough
```java
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        double result;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return;
        }
        
        System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operator, num2, result);
    }
}
```
## Logic & Explanation
- **Input Handling**: The program uses a `Scanner` to read user input for two
- numbers and an operator. It prompts the user to enter the first number, second number, and the operator.
- **Switch Statement**: A `switch` statement is used to determine which arithmetic operation to
perform based on the operator entered by the user. It handles addition, subtraction, multiplication, and division operations.
- **Arithmetic Operations**: Depending on the operator, the program performs the corresponding arithmetic operation and stores the result in the `result` variable.
- **Division by Zero Check**: Before performing division, the program checks if the second number is zero. If it is, it prints an error message and exits the program to prevent division by zero.
- **Output Formatting**: The program uses `System.out.printf` to format the output, displaying the result with two decimal places.
## Edge Cases
- **Division by Zero**: The program checks for division by zero and handles it gracefully by
- printing an error message and exiting the program.
- **Invalid Operator**: If the user enters an invalid operator, the program prints an errormessage and exits.
- **Non-numeric Input**: The program assumes that the user will enter valid numeric input. If non-numeric input is entered, it will throw an exception. This can be handled by adding additional input validation.
## Related Concepts
- **Loops**: The program does not use loops, but it can be extended to allow
- multiple calculations in a loop until the user decides to exit.
- **Conditionals**: The program uses conditional statements to check the operator and handle division by