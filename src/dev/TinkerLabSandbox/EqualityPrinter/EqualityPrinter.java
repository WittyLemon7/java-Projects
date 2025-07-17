package dev.TinkerLabSandbox.EqualityPrinter;

public class EqualityPrinter {
    public static void main(String[] args) {

        // Test cases for the printEqual method
        printEqual(1, 1, 1); // All numbers are equal
        printEqual(1, 2, 3); // All numbers are different
        printEqual(1, 1, 2); // Neither all are equal or different
        printEqual(-1, 2, 3); // Invalid Value
        printEqual(0, 0, 0); // All numbers are equal

    }
    //method to check if three integers are equal, different, or neither
    public static  void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {// Check if any of the numbers are negative
            System.out.println("Invalid Value");
        } else if (a == b && b == c) {// Check if all three numbers are equal
            System.out.println("All numbers are equal");
        } else if (a != b && a != c && b != c) {//
            System.out.println("All numbers are different");
        } else {// Check if neither all are equal nor all are different
            System.out.println("Neither all are equal or different");
        }
    }
}
