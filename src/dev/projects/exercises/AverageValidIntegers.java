package dev.projects.exercises;

import java.util.Scanner;

public class AverageValidIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //initialize variables for the count of numbers and the sum of numbers
        int countNumbers = 0;
        int sumNumbers = 0;
        //loop through the arguments upto 7 valid integers
        while (countNumbers < 7) {
            System.out.println("Enter the number # " + (countNumbers + " : "));
            String nextNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                sumNumbers += number;
                countNumbers++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number");
            }//closing catch


        }//closing while
        if (countNumbers > 0) {
            int average = sumNumbers / countNumbers;
            System.out.println("The average of the 7 numbers = " + average);
        } else {
            System.out.println("No valid numbers entered");
        }//closing if else


    }//closing main method
}//closing class
