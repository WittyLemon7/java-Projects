package dev.projects.exercises;

public class SumAndAverage {

    // Method to calculate the sum and average of positive numbers in a range
    public static String calculateSumAndAverage(int start, int end) {
        // Validate the input range
        if (start <= 0 || end <= 0 || start > end) {
            return "Invalid range";
        }

        int sum = 0;
        int count = 0;

        // Loop through the range from start to end (inclusive)
        for (int i = start; i <= end; i++) {
            if (i > 0) { // Ensure the number is positive
                sum += i;
                count++;
            }
        }

        // Calculate the average
        double average = (double) sum / count;

        // Return the result as a formatted string
        return "Sum: " + sum + ", Average: " + average;
    }

    public static void main(String[] args) {
        // Example usage
        String result = calculateSumAndAverage(1, 10); // Should output the sum and average of numbers from 1 to 10
        System.out.println(result);
    }
}
