package dev.TinkerLabSandbox.DigitsIntoWords;

public class DigitInWords {
    public static void main(String[] args) {

        // Example usage of the numberToWords method
        System.out.println(numberToWords(1234)); // Output: One Thousand Two Hundred Thirty Four
        System.out.println(numberToWords(567));  // Output: Five Hundred Sixty Seven
        //Edge cases
        System.out.println(numberToWords(0));    // Output: Zero
        System.out.println(numberToWords(-5));   // Output: Negative numbers are not supported
        //Additional test cases
        System.out.println(numberToWords(1001)); // Output: One Thousand One

    }
    //method to convert a number into words
    public static String numberToWords(int number) {
        if (number < 0) {// Check if the number is negative
            return "Negative numbers are not supported";
        }
        if (number == 0) {
            return "Zero";
        }

        StringBuilder words = new StringBuilder();// Initialize a StringBuilder to build the words
        int thousands = number / 1000;// Get the thousands place
        int hundreds = (number % 1000) / 100;// Get the hundreds place
        int tens = (number % 100) / 10;// Get the tens place
        int units = number % 10;// Get the units place

        if (thousands > 0) {// If there are thousands, convert to words
            words.append(convertToWord(thousands)).append(" Thousand ");
        }
        if (hundreds > 0) {// If there are hundreds, convert to words
            words.append(convertToWord(hundreds)).append(" Hundred ");
        }
        if (tens > 1) {// If tens are greater than 1, convert to words
            words.append(convertToWord(tens)).append(" ");
            /* * nested if condition to check if there are units
            * because if tens is 1, it will be handled separately
             */
            if (units > 0) {// If there are units, convert to words
                words.append(convertToWord(units)).append(" ");
            }
        } else if (tens == 1) {
            words.append(convertToWord(units)).append(" ");
        } else if (units > 0) {
            words.append(convertToWord(units)).append(" ");
        }

        return words.toString().trim();
    }
    //method to convert a number to words
    public static String convertToWord(int number) {
        switch (number) {// Switch case to convert number to words
            /* * cases for numbers 1 to 9
             */
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
    //method to keep digit count
    public static int getDigitCount(int number) {
        if (number < 0) {// Check if the number is negative
            return -1; // Return -1 for negative numbers
        }
        if (number == 0) {
            return 1; // Return 1 for zero
        }

        int count = 0;// Initialize count to 0
        while (number > 0) {// Loop until all digits are processed
            number /= 10; // Remove the last digit
            count++; // Increment count
        }
        return count;
    }
}
