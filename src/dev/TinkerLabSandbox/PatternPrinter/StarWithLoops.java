package dev.TinkerLabSandbox.PatternPrinter;

public class StarWithLoops {
    public static void main(String[] args) {

        // Example usage of the printSquareStar method
        printSquareStar(5); // Should print a 5x5 square star pattern
        System.out.println();
        printSquareStar(8); // Should print an 8x8 square star pattern
        System.out.println();
        // Edge cases
        printSquareStar(3); // Should print "Invalid Value"
    }
    // Method to print a square star pattern with diagonals
    public static void printSquareStar(int number) {
        if (number < 5) {// Check if the number is less than 5
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {// Loop through each row
            for (int col = 1; col <= number; col++) {// Loop through each column
                // Check if we are at the border, diagonal, or anti-diagonal
                if (row == 1 || row == number || col == 1 || col == number ||
                    row == col || row + col == number + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
