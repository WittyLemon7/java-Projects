package dev.projects.com.java.exercises;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
    public static boolean isPerfectNumber(int number) {
        //perfect number is a positive integer
        if (number < 1) {
            return false;
        }//closing if
        int sum = 0;
        //loop to find the divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }//closing if
        }//closing for
        return sum == number;
    }//closing method
}
