# Digit in Words
## Problem Statement
Create a method that converts a given integer into its English word representation. The method should handle numbers from 0 to 9999, including special cases for numbers like 10-19 and multiples of ten.
## Discussion
The Digit in Words problem is a common exercise in programming that helps reinforce the understanding of number manipulation and string formatting. This problem is useful for practicing loops, conditionals, and basic arithmetic operations, as well as string manipulation to convert numbers into their English word representation.
## Walkthrough
```java
public class DigitInWords {
    // Method to convert a number into its English word representation
    public static String numberToWords(int number) {
        if (number < 0 || number > 9999) {
            return "Invalid Value"; // Handle out of range values
        }
        
        if (number == 0) {
            return "Zero"; // Special case for zero
        }

        StringBuilder words = new StringBuilder();
        
        // Handle thousands place
        if (number >= 1000) {
            words.append(getWordForDigit(number / 1000)).append(" Thousand ");
            number %= 1000; // Reduce the number to the last three digits
        }
        
        // Handle hundreds place
        if (number >= 100) {
            words.append(getWordForDigit(number / 100)).append(" Hundred ");
            number %= 100; // Reduce the number to the last two digits
        }
        
        // Handle tens and units place
        if (number >= 20) {
            words.append(getWordForTens(number / 10)).append(" ");
            number %= 10; // Reduce to the last digit
        } else if (number >= 10) {
            words.append(getWordForTeen(number)).append(" ");
            return words.toString().trim(); // Return immediately for teens
        }
        
        // Handle units place
        if (number > 0) {
            words.append(getWordForDigit(number)).append(" ");
        }
        
        return words.toString().trim(); // Return the final string without trailing spaces
    }

    private static String getWordForDigit(int digit) {
        switch (digit) {
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return ""; // For zero or invalid digits
        }
    }

    private static String getWordForTens(int tens) {
        switch (tens) {
            case 2: return "Twenty";
            case 3: return "Thirty";
            case 4: return "Forty";
            case 5: return "Fifty";
            case 6: return "Sixty";
            case 7: return "Seventy";
            case 8: return "Eighty";
            case 9: return "Ninety";
            default: return ""; // For invalid tens
        }
    }
    private static String getWordForTeen(int number) {
        switch (number) {
            case 10: return "Ten";
            case 11: return "Eleven";
            case 12: return "Twelve";
            case 13: return "Thirteen";
            case 14: return "Fourteen";
            case 15: return "Fifteen";
            case 16: return "Sixteen";
            case 17: return "Seventeen";
            case 18: return "Eighteen";
            case 19: return "Nineteen";
            default: return ""; // For invalid teens
        }
    }
private static int getDigitCount(int number) {
        if (number < 0) {
            return -1; // Invalid number
        }
        if (number == 0) {
            return 1; // Special case for zero
        }
        
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10; // Remove the last digit
        }
        return count; // Return the total digit count
    }
}
```
## Logic & Explanation
- **Input Validation**: The method checks if the input number is within the valid range (0 to 9999). If not, it returns "Invalid Value".
- **Special Case for Zero**: If the input number is zero, it returns "Zero".
- **StringBuilder for Efficiency**: A `StringBuilder` is used to efficiently build the final string representation of the number.
- **Thousands Place Handling**: If the number is 1000 or greater, it extracts the thousands place and appends the corresponding word to the `StringBuilder`.
- **Hundreds Place Handling**: If the number is 100 or greater, it extracts the hundreds place and appends the corresponding word.
- **Tens and Units Place Handling**: 
  - If the number is 20 or greater, it extracts the tens place and appends the corresponding word.
  - If the number is between 10 and 19, it directly appends the word for that teen number.
  - If the number is less than 10, it appends the word for that single digit.
  - **Final String Trimming**: The final string is trimmed to remove any trailing spaces before returning.
  - **Helper Methods**:
  - `getWordForDigit(int digit)`: Returns the English word for a single digit (1-9).
  - `getWordForTens(int tens)`: Returns the English word for tens (20-90).
  - `getWordForTeen(int number)`: Returns the English word for teen numbers (10-19).
  - `getDigitCount(int number)`: Returns the count of digits in the number, handling special cases for negative numbers and zero.
## Edge Cases
- **Negative Numbers**: The method returns "Invalid Value" for negative inputs.
- **Zero Input**: The method correctly handles zero by returning "Zero".
- **Single-Digit Numbers**: The method correctly converts single-digit numbers (1-9) to their word representation.
- **Teen Numbers**: The method correctly handles teen numbers (10-19) with special cases.
- **Tens and Multiples of Ten**: The method correctly handles multiples of ten (20, 30, etc.) and ensures that the correct word is returned.
- **Invalid Inputs**: The method returns "Invalid Value" for inputs outside the range of 0 to 9999.
- **Leading Zeros**: The method does not handle leading zeros, as it assumes the input is a valid integer without leading zeros.
## Related Concepts
- [[String Manipulation]]: The problem involves converting numbers to their string representation.
- [[Loops]]: The method uses loops to count digits and process the number.
- [[Conditionals]]: The method uses conditional statements to handle different ranges of numbers and special cases.
- [[Switch Statements]]: The method uses switch statements to map digits and tens to their corresponding words.


