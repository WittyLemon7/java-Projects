package dev.TinkerLabSandbox.PatternPrinter;

public class VariableThicknessBorder {
    public static void main(String[] args) {

        // Example usage of the printVariableBorderSquare method
        printVariableBorderSquare(7, 2); // Should print a square with size 7 and thickness 2
        System.out.println();
        printVariableBorderSquare(10, 3); // Should print a square with size 10 and thickness 3
        System.out.println();
        printVariableBorderSquare(4, 1); // Should print "Invalid"
        System.out.println();
        printVariableBorderSquare(8, 5); // Should print "Invalid"
    }
    /*     * This program prints a square with a variable thickness border.
     * The size of the square and the thickness of the border are provided as input.
     * If the size is less than 5 or the thickness is invalid, it prints "Invalid".
     */
    private static void printVariableBorderSquare(int size, int thickness) {
        if (size < 5 || thickness < 1 || thickness > size / 2) {// Check for valid size and thickness
            System.out.println("Invalid");
            return;
        }

        for (int row = 1; row <= size; row++) {// Loop through each row
            for (int col = 1; col <= size; col++) {// Loop through each column
                /* Check if the current position is within the border thickness
                * if the row or column is within the thickness from the edges
                 */
                if (row <= thickness || row > size - thickness || col <= thickness || col > size - thickness) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
