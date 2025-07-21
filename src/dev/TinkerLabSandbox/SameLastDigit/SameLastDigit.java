package dev.TinkerLabSandbox.SameLastDigit;

public class SameLastDigit {
    public static void main(String[] args) {

        // Test cases
        System.out.println(hasSameLastDigit(12, 22, 32)); // true
        System.out.println(hasSameLastDigit(9, 99, 999)); // false
        System.out.println(hasSameLastDigit(10, 20, 30)); // true
        System.out.println(hasSameLastDigit(1001, 2000, 3000)); // false
        System.out.println(getLastDigit(123)); // 3
        System.out.println(getLastDigit(9)); // -1 (invalid)

    }
    //method to check if a number is valid
    public static boolean hasSameLastDigit(int a, int b, int c) {

        // Check if all numbers are valid
        if (isValid(a) && isValid(b) && isValid(c)) {
            return (a % 10 == b % 10) || (b % 10 == c % 10) || (a % 10 == c % 10);
        }
        return false;
    }
    //method to check if a number is valid
    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
    //method to get the last digit of a number
    public static int getLastDigit(int number) {

        // Use the isValid method to check if the number is valid
        if (isValid(number)) {
            return number % 10;
        }
        return -1; // Return -1 if the number is not valid
    }
}
//another way to implement the same functionality without using the isValid method
// public class SameLastDigit {
//    // Method to check if two integers have the same last digit
//    public static boolean hasSameLastDigit(int num1, int num2) {
//        // Check if either number is negative
//        if (num1 < 0 || num2 < 0) {
//            return false; // Return false for negative numbers
//        }

//        // Extract the last digits using modulo operation
//        int lastDigit1 = num1 % 10;
//        int lastDigit2 = num2 % 10;
//
//        // Compare the last digits
//        return lastDigit1 == lastDigit2;
//    }
//}