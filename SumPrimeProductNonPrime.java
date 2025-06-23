package com.java.exercises;

import java.util.Scanner;

public class SumPrimeProductNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumPrime = 0;
        double productNonPrime = 1;
        int countPrime = 0;
        int countNonPrime = 0;
        boolean continueLoop = true;
        boolean isPrime = true;

        while (true) {
            System.out.println("Enter a number: ");
            String nextEntry = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextEntry);
                if (isPrime(number)) {
                    sumPrime += number;
                    countPrime++;
                } else {
                    productNonPrime *= number;
                    countNonPrime++;
                }//closing if else
            } catch (NumberFormatException nfe) {
                break;
            }//closing try-catch
        }//closing while
        if (countPrime == 0) {
            System.out.println("No prime numbers entered");
        } else {
            System.out.println("The sum of the prime numbers = " + sumPrime);
        }//closing if else
        if (countNonPrime == 0) {
            System.out.println("No non-prime numbers entered");
        } else {
            System.out.println("The product of the non-prime numbers = " + productNonPrime);
        }//closing if else




        }//closing main method
    public  static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }//closing isPrime method

}//closing class
