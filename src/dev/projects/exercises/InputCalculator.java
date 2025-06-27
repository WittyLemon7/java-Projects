package dev.projects.exercises;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {


    }//closing main method
    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        long average = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                int number = scanner.nextInt();
                sum += number;
                count++;
            }else {
                break;
            }
            scanner.nextLine();
        }
        average = Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }//closing method
}
