package dev.LeetCodeProjects.LC003_NumberOfStepsToReduceTo0;

public class NoOfStepsToZero {
    public static void main(String[] args) {

        int num = 15;//Example
        System.out.println("No of steps to reduce " + num + " to 0 is: " + noOfSteps(num));


    }

    public static int noOfSteps(int num) {
        int steps = 0;// Initialize step count to 0
        while (num > 0) {// Continue until num is reduced to 0
            if (num % 2 == 0) {// Check if num is even
                num /= 2; // If even, divide by 2
            } else {
                num -= 1; // If odd, subtract 1
            }
            steps++; // Increment the step count
        }
        return steps; // Return the total number of steps
    }
}
