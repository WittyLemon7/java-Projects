package com.java.exercises;

public class SumDigitsUntilSingle {

    public static int digitSumSingle(int num) {
        boolean isNegative = num < 0;
        if (isNegative) {
            num = -num;
        }

        int sum;

        do {
            sum = 0;
            // Sum the digits of the number
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }

            // Assign the sum back to num for the next iteration
            num = sum;

        } while (sum >= 10); // Continue until sum is a single digit

        // Restore the negative sign if the original number was negative
        return isNegative ? -sum : sum;
    }

    public static void main(String[] args) {
        System.out.println("Single digit sum of 9875 is: " + digitSumSingle(9875)); // Should print 2
        System.out.println("Single digit sum of -45 is: " + digitSumSingle(-45)); // Should print 9
        System.out.println("Single digit sum of 1234 is: " + digitSumSingle(1234)); // Should print 1
    }
}
