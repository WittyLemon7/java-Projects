package dev.TinkerLabSandbox.PatternPrinter;

public class PyramidWithLoop {
    public static void main(String[] args) {

        // Example usage of the printPyramid method
        printPyramid(5); // Should print a pyramid with 5 rows
        System.out.println();
        printPyramid(3); // Should print a pyramid with 3 rows
        System.out.println();
        // Edge case
        printPyramid(0); // Should not print anything

    }
    // Method to print a pyramid pattern with a given number of rows
    private static void printPyramid(int rows) {
        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= rows - i; j++) { // Print leading spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // Print stars
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
