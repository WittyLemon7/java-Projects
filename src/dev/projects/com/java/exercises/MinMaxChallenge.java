package dev.projects.com.java.exercises;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        //initialize scanner
        Scanner scanner = new Scanner(System.in);
        //initialize min and max
        double min = 0;
        double max = 0;
        //initialize loopCount
        int loopCount = 0;
        //while loop for user input
        while (true) {
            System.out.println("Enter number:");
            String nextEntry = scanner.nextLine();
            //try-catch block to handle invalid input
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
            }//closing try-catch
        }//closing while
        //if-else block to print min and max
        if (loopCount > 0) {
            System.out.println("Min = " + min + " Max = " + max);
        } else {
            System.out.println("No valid number entered");
        }//closing if-else



    }//closing main method
}//closing class
