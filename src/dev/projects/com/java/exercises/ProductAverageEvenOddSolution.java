package dev.projects.com.java.exercises;

import java.util.Scanner;

public class ProductAverageEvenOddSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productEven = 1;
        int sumOdd = 0;
        int countOdd = 0; // To track the count of odd numbers
        boolean continueInput = true;

        // Loop to get input until user decides to stop
        while (true) {
            System.out.println("Enter a number (or type 'stop' to finish): ");
            String nextEntry = scanner.nextLine();

            // Try-catch block to handle invalid input
            try {
                if (nextEntry.equalsIgnoreCase("stop")) {
                    break;
                }
                int number = Integer.parseInt(nextEntry);

                // Check if the number is even or odd
                if (number % 2 == 0) {
                    // Calculate the product of even numbers
                    productEven *= number;
                } else {
                    // Calculate the sum of odd numbers
                    sumOdd += number;
                    countOdd++;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input");
            }
        }

        // If no even numbers are entered, print the message
        if (productEven == 1) {
            System.out.println("No even numbers entered.");
        } else {
            // Print the product of even numbers
            System.out.println("The product of the even numbers = " + productEven);
        }

        // If no odd numbers are entered, print the message
        if (countOdd == 0) {
            System.out.println("No odd numbers entered.");
        } else {
            // Calculate and print the average of odd numbers
            double averageOdd = (double) sumOdd / countOdd;
            System.out.println("The average of the odd numbers = " + averageOdd);
        }
    }
}
