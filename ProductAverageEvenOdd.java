package com.java.exercises;

import java.util.Scanner;

public class ProductAverageEvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productEven = 1;
        int sumOdd = 0;
        int countOdd = 0;
        //boolean to continue the input
        boolean continueInput = true;
        //loop to get the input until user decides to stop
        while (true) {
            System.out.println("Enter a number: ");
            String nextEntry = scanner.nextLine();
            //try-catch block to handle invalid input
            try {
                int number = Integer.parseInt(nextEntry);
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input");
                //break out of the loop if invalid input
                break;
            }
            if (nextEntry.equals("stop")) {
                break;
            }
            int number = scanner.nextInt();
                //check if the number is even or odd
                if (number % 2 == 0) {
                    //calculate the product of even numbers
                    productEven *= number;

                    //if the number is odd calculate the sum of odd numbers
                } else {
                    //calculate the sum of odd numbers
                    sumOdd += number;
                    countOdd++;

                }
            }//closing while
        //
        if (productEven == 1) {
            System.out.println("No even numbers entered");
        } else {
            System.out.println("The product of the even numbers = " + productEven);
        }if (sumOdd == 0) {
            System.out.println("No odd numbers entered");
        } else {
            double averageOdd = (double) sumOdd / countOdd;
            System.out.println("The average of the odd numbers = " + averageOdd);
        }//closing if else







    }//closing main method
}//closing class
