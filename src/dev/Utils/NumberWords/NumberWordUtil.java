package dev.Utils.NumberWords;

public class NumberWordUtil {

    // ✅ Method 1: Handles full numbers (e.g., 123, 1000)
    public static void printNumberInWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (number == 0) {
            System.out.println("Zero");
                return;
        }

            int reversed = reverse(number);
            int leadingZeroes = getDigitCount(number) - getDigitCount(reversed);

            while (reversed != 0) {
                int lastDigit = reversed % 10;
                printDigitWord(lastDigit);
                reversed /= 10;
            }

            for (int i = 0; i < leadingZeroes; i++) {
                System.out.println("Zero");
            }
        }

        // ✅ Method 2: Overloaded for single-digit input
        public static void printNumberInWords(byte digit) {
            if (digit < 0 || digit > 9) {
                System.out.println("OTHER");
                return;
            }
            printDigitWord(digit);
        }

        // 🔹 Helper: Prints word for a digit
        private static void printDigitWord(int digit) {
            switch (digit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
        }

        // 🔹 Helper: Reverses a number
        private static int reverse(int number) {
            int reverse = 0;
            while (number != 0) {
                reverse = reverse * 10 + number % 10;
                number /= 10;
            }
            return reverse;
        }

        // 🔹 Helper: Counts digits in a number
        private static int getDigitCount(int number) {
            if (number < 0) return -1;
            if (number == 0) return 1;

            int count = 0;
            for (int i = 1; i <= number; i *= 10) {
                count++;
            }
            return count;
        }

}
