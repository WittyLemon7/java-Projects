package dev.TinkerLabSandbox.JavaBasics;

public class BasicAddIntegers {
    public static void main(String[] args) {
        // Example integers to add
        int num1 = 10;
        int num2 = 20;

        // Call the method to add integers and print the result
        int sum = addIntegers(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    // Method to add two integers
    public static int addIntegers(int a, int b) {
        return a + b; // Return the sum of the two integers
    }
}
