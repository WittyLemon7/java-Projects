package dev.Utils.InputValidator;

    public class InputValidator {

        // ✅ Checks if a number is non-negative
        public static boolean isNonNegative(int number) {
            return number >= 0;
        }

        // ✅ Checks if a number is within a specific range (inclusive)
        public static boolean isInRange(int number, int min, int max) {
            return number >= min && number <= max;
        }

        // ✅ Checks if a string is null or empty (after trimming)
        public static boolean isEmpty(String str) {
            return str == null || str.trim().isEmpty();
        }

        // ✅ Checks if a string is numeric
        public static boolean isNumeric(String str) {
            if (isEmpty(str)) return false;
            return str.matches("-?\\d+(\\.\\d+)?");
        }

        // ✅ Checks if an array is null or empty
        public static boolean isEmptyArray(int[] arr) {
            return arr == null || arr.length == 0;
        }

        // ✅ Checks if a character is a valid digit (0–9)
        public static boolean isDigit(char ch) {
            return ch >= '0' && ch <= '9';
        }

}
