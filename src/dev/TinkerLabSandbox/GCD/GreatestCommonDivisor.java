package dev.TinkerLabSandbox.GCD;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        // Example usage of the getGreatestCommonDivisor method
        System.out.println("GCD of 25 and 15: " + getGreatestCommonDivisor(25, 15)); // Should return 5
        System.out.println("GCD of 12 and 30: " + getGreatestCommonDivisor(12, 30)); // Should return 6


        //Edge case examples
        System.out.println("GCD of 10 and 20: " + getGreatestCommonDivisor(10, 20)); // Should return 10
        System.out.println("GCD of 9 and 3: " + getGreatestCommonDivisor(9, 3)); // Should return 3

    }
    //method to calculate the greatest common divisor (GCD) of two integers
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {//invalid input check
            return -1;
        }
        while (second != 0) {//loop until second becomes zero
            int temp = second;//store the value of second in a temporary variable
            second = first % second;//update second to the remainder of first divided by second
            first = temp;//update first to the value of second
        }
        return first;
    }
}
