package dev.projects.com.java.exercises;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }
    public static int getLargestPrime(int number) {
        //prime numbers cannot be negative
        if (number < 2) {
            return -1;
        }//closing if
        int largestPrime = -1;
        //check for the prime numbers
        for (int i = 2; i <= number; i++) {//Iterate through numbers starting from 2 up to the given number.
            while (number % i == 0) {//Use a while loop to divide the number by i as long as it's divisible.
                largestPrime = i;
                number /= i;

            }//closing while
        }//closing for
        //return the largest prime number
        return largestPrime;
    }//closing method
}//closing class
