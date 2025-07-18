package dev.TinkerLabSandbox.SumOddEven;

import java.math.BigInteger;

public class SumOddMultiplyEven {
    public static void main(String[] args) {
        // Test cases
        System.out.println(sumOdd(1, 100));
        // Using a smaller range for multiplyEven to keep the output readable
        System.out.println(multiplyEven(1, 20));

        //Edge case
        System.out.println("--- Edge Cases ---");
        System.out.println(sumOdd(-1, 100)); // Should be handled
        System.out.println(sumOdd(100, 1)); // Should be handled

    }

    /**
     * A clearer and more concise check for whether a number is even.
     * The previous name "isOddEvenCheck" was ambiguous.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int sumOdd(int start, int end) {
        // Input validation is a good practice to prevent errors.
        if (end < start || start < 0) {
            System.out.println("Invalid range provided. 'start' must be non-negative and 'end' must be >= 'start'.");
            return -1; // Indicate an error
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            // To sum ODD numbers, we check for numbers that are NOT even.
            if (!isEven(i)) {
                sum += i;
            }
        }
        // The return statement must be *outside* the loop to allow the loop to complete.
        return sum;
    }

    public static BigInteger multiplyEven(int start, int end) {
        // Input validation
        if (end < start || start < 0) {
            System.out.println("Invalid range provided. 'start' must be non-negative and 'end' must be >= 'start'.");
            return BigInteger.valueOf(-1); // Indicate an error
        }

        // Use BigInteger to prevent overflow, as the product can get very large, very quickly.
        BigInteger product = BigInteger.ONE;
        for (int i = start; i <= end; i++) {
            // To multiply EVEN numbers, we check for numbers that ARE even.
            if (isEven(i)) {
                // Skip multiplying by 0, as it would make the whole product 0.
                if (i == 0) continue;
                product = product.multiply(BigInteger.valueOf(i));
            }
        }
        // The return statement must be *outside* the loop.
        return product;
    }
}
