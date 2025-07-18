package dev.TinkerLabSandbox.SumOddEven;

public class SumEven {
    public static void main(String[] args) {

        System.out.println("Sum of even numbers between 1 and 100 is: " + sumEven(1, 100));
        System.out.println("Sum of even numbers between -5 and 5 is: " + sumEven(-5, 5));
        System.out.println("Sum of even numbers between 10 and 20 is: " + sumEven(10, 20));

    }
    public static boolean isEven(int num) {
        return num > 0 && num % 2 == 0; // check if number is positive and divisible by 2
    }
    public static int sumEven(int start, int  end) {

        int sum = 0;//initialise the sum

        if (start < 0 || end < 0) {// parameters should be positive
            return -1;
        }

        for (int i = start; i <= end; i++) {//iterate through the range
            if (isEven(i)) {//if even
                sum += i;// add that to sum
            }
        }
        return sum;

    }
}
