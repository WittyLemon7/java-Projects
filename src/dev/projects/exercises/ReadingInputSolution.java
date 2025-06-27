package dev.projects.exercises;

import java.util.Scanner;

public class ReadingInputSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        double sum = 0;

        while (count <= 5) {
            System.out.println("Enter number # " + count + ":");
            String nextNumber = scanner.nextLine();
           // String nextNumber = scanner.nextlLine();
            try {
                //int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                count++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number ");
            }
        }
        System.out.println(" The sum of the 5 numbers = " + sum);
    }
}


