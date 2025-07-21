package dev.TinkerLabSandbox.FirstAndLastDigit;

public class FirstLastDigit {
    public static void main(String[] args) {

        // Example usage
        int number = 12345;
        int firstDigit = getFirstDigit(number);
        int lastDigit = getLastDigit(number);

        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);

        int sum = sumFirstAndLastDigit(number);
        System.out.println("Sum of first and last digit: " + sum);

    }

    //method to get 1st digit
    public static int getFirstDigit(int number) {

        while (number >= 10) {// Keep dividing by 10 until we reach the first digit
            number /= 10;
        }
        return number;
    }

    //method to get last digit
    public static int getLastDigit(int number) {
        return number % 10;// Return the last digit using modulus operator
    }
    //method to get the sum of first and last digit
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers
        }
        int firstDigit = getFirstDigit(number);
        int lastDigit = getLastDigit(number);
        return firstDigit + lastDigit; // Return the sum of the first and last digits
    }
}
