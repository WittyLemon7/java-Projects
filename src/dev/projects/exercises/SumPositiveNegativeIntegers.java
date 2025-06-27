package dev.projects.exercises;

import java.util.Scanner;

public class SumPositiveNegativeIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int positiveSum = 0;
        int negativeSum = 0;
        boolean isAnInt = true;

        while (true) {
            System.out.println("Enter a number: ");
            try {
                isAnInt = scanner.hasNextInt();
            } catch (Exception e) {
                System.out.println("Invalid input");
                break;
            }
            if (isAnInt) {
                int number = scanner.nextInt();
                if (number > 0) {
                    positiveSum += number;
                } else if (number < 0) {
                    negativeSum += number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }//closing while
        int totalSum = positiveSum + negativeSum;
        System.out.println("The sum of the positive numbers = " + positiveSum);

    }
}
