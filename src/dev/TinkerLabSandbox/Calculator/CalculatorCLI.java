package dev.TinkerLabSandbox.Calculator;

import java.util.Scanner;
/**
 * A simple command-line calculator that performs basic arithmetic operations.
 * It prompts the user for two numbers and an operator, then displays the result.
 */

public class CalculatorCLI {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        System.out.println("Welcome to the Simple Calculator!");
        Scanner input = new Scanner(System.in);
        performCalculation(input);
        input.close();
    }

    /**
     * Prompts the user for two numbers and an operator, performs the calculation,
     * and prints the result.
        * If the input is invalid, it prints an error message.
     */
    private static void performCalculation(Scanner input) {
        System.out.print("Enter first number: ");
        if (!input.hasNextDouble()) {//invalid input check
            System.out.println("Error: Invalid number.");
            return;
        }
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        if (!input.hasNextDouble()) {//invalid input check
            System.out.println("Error: Invalid number.");
            return;
        }
        double num2 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        if (!input.hasNext("[+\\-*/]")) {//invalid operator check
            System.out.println("Error: Invalid operator.");
            return;
        }
        char operator = input.next().charAt(0);

        double result;
        switch (operator) {//switch case to handle different operators
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/':
                if (num2 == 0) {// Check for division by zero
                    System.out.println("Error: Division by zero.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Error: Unknown operator.");
                return;
        }
        System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operator, num2, result);
    }
}

