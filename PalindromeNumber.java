package com.java.exercises;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));

    }

    public static boolean isPalindrome(int number) {
        //negative numbers are not palindromes
        if (number < 0) {
            return false;
        }//closing if

        int reverseNumber = 0;
        int originalNumber = number;

        while (number > 0) {
            //extract the last digit
            int digit = (number % 10);
            //append the digit
            reverseNumber = reverseNumber * 10 + digit;
            //remove the last digit
            number /= 10;
        }
        return (originalNumber == reverseNumber);
    }//closing NumberPalindrome class
}
