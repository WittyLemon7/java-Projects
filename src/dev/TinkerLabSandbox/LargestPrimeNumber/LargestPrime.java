package dev.TinkerLabSandbox.LargestPrimeNumber;

public class LargestPrime {
    public static void main(String[] args) {

        // Example usage of the getLargestPrime method
        int number = 20; // Example number to find the largest prime less than or equal to
        getLargestPrime(number); // Call the method to find and print the largest prime number
        int number2 = 50; // Another example number
        getLargestPrime(number2); // Call the method to find and print the largest prime number
        // Edge cases
        getLargestPrime(1); // Should print "No prime number found."
        getLargestPrime(2); // Should print "The largest prime number less than or equal to 2 is: 2"
        getLargestPrime(0); // Should print "No prime number found."

    }
    public static void getLargestPrime(int num) {
        if (num < 2) {// Check if the number is less than 2 as 2 is the smallest prime number
            System.out.println("No prime number found.");
            return;
        }

        int largestPrime = -1; // Initialize largest prime to -1
        for (int i = 2; i <= num; i++) {// Loop through all numbers from 2 to num
            if (isPrime(i)) {
                largestPrime = i; // Update largest prime
            }
        }

        if (largestPrime != -1) {// If a prime number was found & largestPrime is not -1
            System.out.println("The largest prime number less than or equal to " + num + " is: " + largestPrime);
        } else {
            System.out.println("No prime number found.");
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {// Check if the number is less than or equal to 1
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {// Loop through all numbers from 2 to the square root of number
            if (number % i == 0) {// Check if number is divisible by i
                return false; // If it is divisible, it's not prime
            }
        }
        return true; // If no divisors found, it's prime
    }
}
// another way  to find the largest prime number
//public class LargestPrime {
//    // write code here
//    public static int getLargestPrime(int number) {
//        //prime numbers cannot be negative
//        if (number < 1) {
//            return -1;
//        }//closing if
//
//        int largestPrime = -1;
//
//        for (int i = 2;i <= number;i++) {
//            while (number % i == 0) {
//                largestPrime = i;
//                number /= i;
//            }//closing while
//        }//closing for
//        return largestPrime;
//    }
//}