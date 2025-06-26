package dev.projects.com.java.exercises;

import java.util.Scanner;

public class MinMaxChallengeSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize min and max with null values for the first valid input
        Double min = null;
        Double max = null;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter number:");
            String nextEntry = scanner.nextLine();
            try {
                double number = Double.parseDouble(nextEntry);
                if (loopCount == 0 || number < min) {
                    min = number;
                }
                if (loopCount == 0 || number > max) {
                    max = number;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        // Print min and max if at least one valid number was entered
        if (loopCount > 0) {
            System.out.println("Min = " + min + " Max = " + max);
        } else {
            System.out.println("No valid number entered");
        }
    }
}
