package dev.TinkerLabSandbox.PatternPrinter;

public class DiamnondPattern {
    public static void main(String[] args) {

        // Example usage of the printDiamond method
        printDiamond(5); // Should print a diamond pattern with 5 rows
        System.out.println();
        printDiamond(3); // Should print a diamond pattern with 3 rows
        System.out.println();
        // Edge case
        printDiamond(0); // Should print "Invalid"


    }
    // method to print a diamond pattern with a given number of rows
    private static void printDiamond(int rows) {
        if (rows < 1) { // Check for invalid input
            System.out.println("Invalid");
            return;
        }

        // Print the upper part of the diamond
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) { // Print leading spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // Print stars
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        // Print the lower part of the diamond
        for (int i = rows - 1; i >= 1; i--) {// Loop through each row
            for (int j = rows; j > i; j--) { // Print leading spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // Print stars
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
