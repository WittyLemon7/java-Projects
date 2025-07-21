package dev.TinkerLabSandbox.Palindrome;

public class PalindromeNumbers {
    public static void main(String[] args) {
        // This program checks if a number is a palindrome
        int[] numbers = {121, 12321, 123, 45654, 78987, 1001, 123456};
        System.out.println("Palindrome Numbers:");

        // Loop through each number in the array
        for (int number : numbers) {
            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        }
    }
    //method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;// Store the original number to compare later
        int reversedNumber = 0;// Variable to hold the reversed number

        while (number > 0) {// Loop until the number is reduced to 0
            int digit = number % 10;// Get the last digit of the number
            reversedNumber = reversedNumber * 10 + digit;// Build the reversed number
            number /= 10;// Remove the last digit from the number
        }

        return originalNumber == reversedNumber;// Check if the original number is equal to the reversed number
    }
}
