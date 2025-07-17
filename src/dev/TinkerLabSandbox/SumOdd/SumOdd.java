package dev.TinkerLabSandbox.SumOdd;

public class SumOdd {
    public static void main(String[] args) {

        System.out.println("Sum of odd numbers between 1 and 100 is: " + sumOdd(1, 100));
        System.out.println("Sum of odd numbers between -5 and 5 is: " + sumOdd(-5, 5));
        System.out.println("Sum of odd numbers between 10 and 20 is: " + sumOdd(10, 20));

    }
    //method to check odd
    public static boolean isOdd(int num) {
        return num > 0 && num % 2 != 0; // check if number is positive and not divisible by 2
    }
    //method to calculate sum of odd
    public static int sumOdd(int start, int  end) {
        if (start < 0 || end < 0) {// parameters should be positive
            return -1;
        }
        int sum = 0;// initialise sum

        for (int i = start; i <= end; i++) {//iterate through range
            if (isOdd(i)) {//if odd
                sum += i;// add that to sum
            }
        }
        return sum;
    }
}
