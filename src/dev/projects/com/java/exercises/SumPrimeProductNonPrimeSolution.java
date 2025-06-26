package dev.projects.com.java.exercises;

import java.util.Scanner;

public class SumPrimeProductNonPrimeSolution {





        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double sumPrime = 0;
            double productNonPrime = 1;
            int countPrime = 0;
            int countNonPrime = 0;

            while (true) {
                System.out.println("Enter a number (or type 'stop' to finish): ");
                String nextEntry = scanner.nextLine();
                try {
                    if (nextEntry.equalsIgnoreCase("stop")) {
                        break;
                    }

                    int number = Integer.parseInt(nextEntry);
                    if (isPrime(number)) {
                        sumPrime += number;
                        countPrime++;
                    } else {
                        productNonPrime *= number;
                        countNonPrime++;
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("Invalid input");
                }
            }

            if (countPrime == 0) {
                System.out.println("No prime numbers entered");
            } else {
                System.out.println("The sum of the prime numbers = " + sumPrime);
            }

            if (countNonPrime == 0) {
                System.out.println("No non-prime numbers entered");
            } else {
                System.out.println("The product of the non-prime numbers = " + productNonPrime);
            }
        }

        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }


}
