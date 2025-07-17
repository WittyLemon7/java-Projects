package dev.TinkerLabSandbox.PrintNumberToWords;
// traditional Java class structure not using utility class
public class PrintNumberInWords {
    public static void main(String[] args) {

        // Test cases for the printNumberInWords method
        printNumberInWords(123); // Expected output: One Two Three
        printNumberInWords(1010); // Expected output: One Zero One Zero
        printNumberInWords(0); // Expected output: Zero
        printNumberInWords(-5); // Expected output: Invalid Value
        printNumberInWords(987654321); // Expected output: Nine Eight Seven Six Five Four Three Two One

    }
    // Method to print the digits of a number in words
    public static void printNumberInWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return; // Exit the method if the number is negative
        }

        // Convert the number to a string to process each digit
        String numberStr = Integer.toString(number);
        StringBuilder result = new StringBuilder();

        // Loop through each character in the string representation of the number
        for (char digit : numberStr.toCharArray()) {
            switch (digit) {
                case '0':
                    result.append("Zero ");
                    break;
                case '1':
                    result.append("One ");
                    break;
                case '2':
                    result.append("Two ");
                    break;
                case '3':
                    result.append("Three ");
                    break;
                case '4':
                    result.append("Four ");
                    break;
                case '5':
                    result.append("Five ");
                    break;
                case '6':
                    result.append("Six ");
                    break;
                case '7':
                    result.append("Seven ");
                    break;
                case '8':
                    result.append("Eight ");
                    break;
                case '9':
                    result.append("Nine ");
                    break;
                default:
                    // This should never happen since we only process digits
                    break;
            }
        }

        // Print the final result, trimming any trailing spaces
        System.out.println(result.toString().trim());
    }

}
