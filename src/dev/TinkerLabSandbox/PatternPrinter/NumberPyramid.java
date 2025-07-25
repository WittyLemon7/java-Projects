package dev.TinkerLabSandbox.PatternPrinter;

public class NumberPyramid {
    public static void main(String[] args) {

        // Example usage of the printNumberPyramid method
        printNumberPyramid(5); // Should print a number pyramid with 5 rows
        System.out.println();
        printNumberPyramid(3); // Should print a number pyramid with 3 rows
        System.out.println();
        // Edge case
        printNumberPyramid(0); // Should not print anything

    }
    //method to print a number pyramid pattern with a given number of rows
    private  static void printNumberPyramid(int rows) {
        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= rows - i; j++) { // Print leading spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // Print numbers
                System.out.print(i);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
