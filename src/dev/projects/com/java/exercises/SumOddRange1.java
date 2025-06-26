package dev.projects.com.java.exercises;

public class SumOddRange1 {

    // Method to determine if a number is odd
    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        return (number % 2 != 0);
    }

    // Method to calculate the sum of odd numbers in a range
    public static int sumOdd(int start, int end) {
        if (start > end || start <= 0 || end <= 0) {
            return -1;
        }

        int sum = 0;
        // Loop through the range from start to end (inclusive)
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example usage
        int result = sumOdd(1, 10); // Should output the sum of odd numbers from 1 to 10
        System.out.println("Sum of odd numbers from 1 to 10 is: " + result);
    }
}
