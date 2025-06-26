package dev.projects.com.java.exercises;

import java.util.Scanner;

public class SumPositiveNegativeIntegersSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables for positive and negative sums
        int sumPositive = 0;
        int sumNegative = 0;
        boolean continueInput = true;

        while (continueInput) {
            System.out.println("Enter a number (or type 'stop' to finish):");
            String nextEntry = scanner.nextLine();

            if (nextEntry.equalsIgnoreCase("stop")) {
                break; // Exit the loop if the user types "stop"
            }

            try {
                int number = Integer.parseInt(nextEntry);
                if (number > 0) {
                    sumPositive += number;
                } else if (number < 0) {
                    sumNegative += number;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("INVALID");
            }
        }

        // Print the results
        System.out.println("Sum of positive integers: " + sumPositive);
        System.out.println("Sum of negative integers: " + sumNegative);
        System.out.println("Total sum: " + (sumPositive + sumNegative));
    }
}
