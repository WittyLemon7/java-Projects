package dev.TinkerLabSandbox.EvenOddDigitSum;

public class OddDigitSum {
    public static void main(String[] args) {

        // Example usage of the calculateOddDigitSum method
        int number = 123456789;
        int sum = calculateOddDigitSum(number);
        System.out.println("The sum of odd digits in " + number + " is: " + sum);
    }

    //method to calculate the sum of odd digits in a number
    public static int calculateOddDigitSum(int number) {

        if (number < 0) {// Check if the number is negative
            number = -number; // Convert negative number to positive
        }

        int sum = 0;// Initialize sum to 0

        while (number > 0) {// Loop until all digits are processed
            int digit = number % 10; // Get the last digit
            if (digit % 2 != 0) { // Check if the digit is odd
                sum += digit; // Add to the sum if it's odd
            }
            number /= 10; // Remove the last digit
        }
        return sum;
    }
}
