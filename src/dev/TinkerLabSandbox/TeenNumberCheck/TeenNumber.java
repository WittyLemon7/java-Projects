package dev.TinkerLabSandbox.TeenNumberCheck;

public class TeenNumber {
    public static void main(String[] args) {

        // Test cases for the hasTeen method
        System.out.println(hasTeen(13, 20, 10)); // Expected: true
        System.out.println(hasTeen(22, 19, 9)); // Expected: true
        System.out.println(hasTeen(22, 24, 15)); // Expected: true
        System.out.println(hasTeen(22, 24, 25)); // Expected: false

        // Test cases for the isTeen method
        System.out.println(isTeen(13)); // Expected: true
        System.out.println(isTeen(20)); // Expected: false

    }
    public static boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true; // At least one number is in the teen range
        } else {
            return false; // No numbers are in the teen range
        }
    }
    // Alternate method to check if a single number is in the teen range
    public static boolean isTeen(int number) {
        return (number >= 13 && number <= 19); // Check if the number is in the teen range
    }
}
