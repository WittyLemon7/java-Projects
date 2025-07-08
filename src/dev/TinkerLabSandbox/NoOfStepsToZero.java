package dev.TinkerLabSandbox;

public class NoOfStepsToZero {
    public static void main(String[] args) {

        int num = 30; // Example number
        int steps = noOfSteps(num);
        System.out.println("Number of steps to reduce " + num + " to zero: " + steps);

    }
//Method to calculate the number of steps to reduce a number to zero
// The method uses bitwise operations to efficiently determine the number of steps
    public static int noOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if ((num & 1) == 0) { // check if even using bitwise AND
                num >>= 1;        // right shift = divide by 2
            } else {
                num -= 1;         // subtract 1 if odd
            }
            steps++;
        }
        return steps;
    }

    //method using bitmasks
    public static int noOfStepsToZero(int num) {
        final int ODD_MASK = 1; // 0001 → LSB mask

        int steps = 0;
        while (num > 0) {
            if ((num & ODD_MASK) == 0) {
                num >>= 1;      // Even → divide by 2
            } else {
                num -= 1;       // Odd → subtract 1
            }
            steps++;
        }
        return steps;
    }



}
