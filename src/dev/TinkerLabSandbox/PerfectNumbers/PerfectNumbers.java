package dev.TinkerLabSandbox.PerfectNumbers;

public class PerfectNumbers {
    public static void main(String[] args) {
        //Example usage of the isPerfect method
        int number = 28; // Example number to check
        if (isPerfect(number)) { // call the isPerfect method
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        //Edge cases
        System.out.println("Checking edge cases:");
        int[] edgeCases = {0, 1, 6, 12, 496, 8128, -6};
        for (int edgeCase : edgeCases) {// loop through edge cases
            if (isPerfect(edgeCase)) {// call the isPerfect method for each edge case
                System.out.println(edgeCase + " is a perfect number.");
            } else {
                System.out.println(edgeCase + " is not a perfect number.");
            }
        }

    }
    //method to check if a number is perfect
    public static boolean isPerfect(int number) {
        if (number < 1) {//invalid input check
            return false;
        }

        int sum = 0;//variable to hold the sum of divisors
        for (int i = 1; i <= number / 2; i++) {// loop through all numbers from 1 to number/2
            if (number % i == 0) {// check if i is a divisor of number
                sum += i;// add the divisor to the sum
            }
        }

        return sum == number;
    }
}
