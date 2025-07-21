package dev.TinkerLabSandbox.SharedDigit;

public class SharedDigitBetweenNumbers {
    public static void main(String[] args) {

        // Test cases
        System.out.println(hasSharedDigit(12, 23)); // true
        System.out.println(hasSharedDigit(9, 99));   // false
        System.out.println(hasSharedDigit(15, 55));  // true
        System.out.println(hasSharedDigit(10, 20));  // false
        System.out.println(hasSharedDigit(34, 43));  // true

    }
    //method to check if two numbers share a digit
    public static boolean hasSharedDigit(int first, int second) {

        // Check if the numbers are in the range of 10 to 99
        if (first < 10 || first > 99 || second < 10 || second > 99) {
            return false;
        }

        int firstFirstDigit = first / 10;// first digit of the first number

        int firstSecondDigit = first % 10;// second digit of the first number

        int secondFirstDigit = second / 10;// first digit of the second number

        int secondSecondDigit = second % 10;// second digit of the second number

        return (firstFirstDigit == secondFirstDigit || firstFirstDigit == secondSecondDigit ||
                firstSecondDigit == secondFirstDigit || firstSecondDigit == secondSecondDigit);
    }
}
