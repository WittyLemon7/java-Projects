package dev.projects.com.java.exercises;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Initialize variables to store the sum and count of valid integers
        int sum = 0;
        int count = 1;
        int number;

        while (count <= 5) {
            // Prompt the user to enter a number
            System.out.print("Enter number #" + count + ": ");

            try {
                // Attempt to read and parse the input
                number = Integer.parseInt(scanner.nextLine());
                // Add the valid integer to the sum
                sum += number;
                count++;

            } catch (NumberFormatException e) {
                // Handle invalid input
                System.out.println("INVALID");
            }//closing catch
        }//closing while

        // Print the sum of the valid integers
        System.out.println("Sum of valid integers: " + sum);
    }//closing main method
}//closing class
