package dev.projects.com.java.exercises;

public class PrimeNumberChallenge {

    public  static  boolean isPrime(int wholeNumber) {
        //condition for no being a prime no
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }//closing if
        //check no is prime or not
        for (int divisor = 2; divisor <= wholeNumber/2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }//closing nest if
        }//closing for
        return true;
    }//closing prime method

    public static void main(String[] args) {

        int countPrime = 0;
        //define rage for loop

        for (int i = 10; i <= 50;i++) {
            if (isPrime(i)) {
                System.out.println(" Number " + i + " is a Prime Number");
                countPrime++;
                //count no of prime in range
                if (countPrime == 5) {
                    System.out.println(" Found 5 Prime Number -- Existing Loop");
                    break;
                }//closing sub nest if


            }//closing nest if
        }//closing for count





    }//closing main method
}//closing class
