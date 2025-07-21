package dev.TinkerLabSandbox.EvenOddDigitSum;

public class EvenDigitSum {
    public static void main(String[] args) {

        // Example usage of the calculateEvenDigitSum method
        int number = 123456789;
        int evenSum = calculateEvenDigitSum(number);
        System.out.println("The sum of the even digits in " + number + " is: " + evenSum);
    }
    //method to calculate the sum of even digits in a number
    public static int calculateEvenDigitSum(int number) {

        //check if the number is negative
        if (number < 0) {
            number = -number; // Convert negative number to positive
        }

        int sum = 0;// Initialize sum to 0

        // Loop through each digit of the number
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            if (digit % 2 == 0) { // Check if the digit is even
                sum += digit; // Add to sum if even
            }
            number /= 10; // Remove the last digit
        }
        return sum;
    }
}
