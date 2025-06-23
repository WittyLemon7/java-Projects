package com.java.exercises;

public class WhileLoopChallengeIsEvenNumber {

    public static void main(String[] args) {

        int i = 4;
        int j = 20;
        int countEven = 0;
        int countOdd = 0;
        while (i <= j) {
            i++;
            if (isEvenNumber(i)) {
                System.out.println("Even Number: " + i);
                countEven++;
                continue;
            }
            countOdd++;
            if (countEven >= 5) {
                break;
            }
        }

        System.out.println("Total number of Odd count: " + countOdd);
        System.out.println("Total number of Even count: " + countEven);
    }

    public static boolean isEvenNumber(int num) {
        return (num % 2 == 0); // Check if num is even
    }
}
