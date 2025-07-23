package dev.TinkerLabSandbox.DigitsIntoWords;


public class DigitInWordSolution {
    public static void main(String[] args) {
        // Test cases including problematic ones
        System.out.println(numberToWords(1234)); // One Thousand Two Hundred Thirty Four
        System.out.println(numberToWords(567));  // Five Hundred Sixty Seven
        System.out.println(numberToWords(0));    // Zero
        System.out.println(numberToWords(-5));   // Negative numbers are not supported
        System.out.println(numberToWords(1001)); // One Thousand One

        // Additional test cases for edge scenarios
        System.out.println(numberToWords(11));   // Eleven
        System.out.println(numberToWords(20));   // Twenty
        System.out.println(numberToWords(101));  // One Hundred One
        System.out.println(numberToWords(1000)); // One Thousand
    }

    // Enhanced method to convert number to words
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Negative numbers are not supported";
        }
        if (number == 0) {
            return "Zero";
        }

        StringBuilder words = new StringBuilder();// Initialize a StringBuilder to build the words
        /* *stringBuilder is used for efficient string concatenation
         * as it is mutable and avoids creating multiple string objects
         */

        // Handle thousands (supports up to 999,999)
        int thousands = number / 1000;
        if (thousands > 0) {
            words.append(convertHundreds(thousands)).append(" Thousand ");
        }

        // Handle remaining hundreds, tens, and units
        int remainder = number % 1000;
        if (remainder > 0) {
            words.append(convertHundreds(remainder));
        }

        return words.toString().trim();// Trim to remove any trailing spaces
    }

    // Method to convert numbers 1-999 to words
    private static String convertHundreds(int number) {
        StringBuilder result = new StringBuilder();

        // Handle hundreds place
        int hundreds = number / 100;
        if (hundreds > 0) {
            result.append(convertUnits(hundreds)).append(" Hundred ");
        }

        // Handle tens and units
        int tensAndUnits = number % 100;
        if (tensAndUnits > 0) {
            result.append(convertTensAndUnits(tensAndUnits));
        }

        return result.toString().trim();
    }

    // Method to handle tens and units (1-99)
    private static String convertTensAndUnits(int number) {
        if (number < 10) {
            return convertUnits(number);
        } else if (number < 20) {
            return convertTeens(number);
        } else {
            int tens = number / 10;
            int units = number % 10;
            StringBuilder result = new StringBuilder(convertTens(tens));
            if (units > 0) {
                result.append(" ").append(convertUnits(units));
            }
            return result.toString();
        }
    }

    // Method to convert single digits (1-9)
    private static String convertUnits(int number) {
        switch (number) {
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "";
        }
    }

    // Method to convert teens (11-19)
    private static String convertTeens(int number) {
        switch (number) {
            case 11: return "Eleven";
            case 12: return "Twelve";
            case 13: return "Thirteen";
            case 14: return "Fourteen";
            case 15: return "Fifteen";
            case 16: return "Sixteen";
            case 17: return "Seventeen";
            case 18: return "Eighteen";
            case 19: return "Nineteen";
            default: return "";
        }
    }

    // Method to convert tens (20, 30, 40, etc.)
    private static String convertTens(int number) {
        switch (number) {
            case 2: return "Twenty";
            case 3: return "Thirty";
            case 4: return "Forty";
            case 5: return "Fifty";
            case 6: return "Sixty";
            case 7: return "Seventy";
            case 8: return "Eighty";
            case 9: return "Ninety";
            default: return "";
        }
    }

    // Improved digit count method (this was actually correct in your original)
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}

