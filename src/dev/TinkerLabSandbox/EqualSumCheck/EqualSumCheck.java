package dev.TinkerLabSandbox.EqualSumCheck;

public class EqualSumCheck {
    public static void main(String[] args) {

        // Test cases for the hasEqualSum method
        System.out.println(hasEqualSum(1, 2, 3)); // Expected: true
        System.out.println(hasEqualSum(1, -1, 0)); // Expected: true
        System.out.println(hasEqualSum(1, 1, 2)); // Expected: true
        System.out.println(hasEqualSum(1, 2, 4)); // Expected: false
        System.out.println(hasEqualSum(0, 0, 0)); // Expected: true

    }
    // method for equal sum check
    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {
        // Check if the sum of the first two numbers equals the third number
        return (firstNumber + secondNumber) == thirdNumber;
    }
// Alternative method with different parameter names
//    public static boolean hasEqualSum(int num1, int num2, int num3) {
//        // Check if the sum of the first two numbers equals the third number
//        int sum = num1 + num2;
//        return sum == num3;
//    }
}
