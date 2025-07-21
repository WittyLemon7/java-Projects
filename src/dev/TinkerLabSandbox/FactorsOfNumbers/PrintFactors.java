package dev.TinkerLabSandbox.FactorsOfNumbers;

public class PrintFactors {
    public static void main(String[] args) {

        // Example usage
        printFactors(12);  // Output: Factors of 12: 1 2 3 4 6 12
        printFactors(28);  // Output: Factors of 28: 1 2 4 7 14 28
        printFactors(1);   // Output: Factors of 1: 1

        // Testing with edge cases
        printFactors(0);   // Output: Number must be greater than 0
        printFactors(-5);  // Output: Number must be greater than 0

    }
    //method to print factors of a number
    public static void printFactors(int number) {

        // Check if the number is less than 1
        if (number < 1) {
            System.out.println("Number must be greater than 0");
            return;
        }
        System.out.print("Factors of " + number + ": ");
        for (int i = 1; i <= number; i++) {// Loop from 1 to the number
            if (number % i == 0) {// Check if i is a factor of number
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
