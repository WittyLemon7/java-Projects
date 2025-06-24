package com.java.exercises;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public  static  int  getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }//closing if
        int gcd = 1;
        //find the minimum number
        int min = first < second ? first : second;//ternary operator for Math.min
       // int min = Math.min(first, second);
        //calculate the greatest common divisor
        for (int i = 1; i <= min; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }//closing nest if
        }//closing for
        return gcd;
    }//closing method
}//closing class
