package dev.TinkerLabSandbox.PatternPrinter;

public class HollowSquare {
    public static void main(String[] args) {

        // Example usage of the printSquare method
        printSquare(5); // Should print a hollow square with 5 rows
        System.out.println();
        printSquare(8); // Should print a hollow square with 8 rows
        System.out.println();
        // Edge case
        printSquare(3); // Should print "Invalid"
    }
//    //method to print hollow square
//    private static void printSquare(int number) {
//        if (number < 5) {// check for number less than 5
//            System.out.println("Invalid");
//            return;
//        }
//        int rows;// variable to hold the number of rows
//        int columns;//variable to hold number of columns
//
//        for (rows = 1;rows <= number;rows++) {//loop rows
//            for (columns = 1;columns <= number;columns++) {//loop columns
//                    /*check for borders
//                    note no diagnals or anti diagnals for hollow square
//                     */
//                if (rows == 1 || rows == number || columns == 1 || columns == number || rows == columns) {
//                    System.out.println("*");
//                } else {
//                    System.out.println(" ");
//                }
//            }
//            System.out.println();
//
//        }
//    }
//
//}





        // Method to print a hollow square
        private static void printSquare(int number) {
            if (number < 5) { // Check for number less than 5
                System.out.println("Invalid");
                return;
            }

            for (int rows = 1; rows <= number; rows++) { // Loop rows
                for (int columns = 1; columns <= number; columns++) { // Loop columns
                    /*
                     * Check for borders:
                     * First row (rows == 1)
                     * Last row (rows == number)
                     * First column (columns == 1)
                     * Last column (columns == number)
                     */
                    if (rows == 1 || rows == number || columns == 1 || columns == number) {
                        System.out.print("*"); // Use print() to keep characters on the same line
                    } else {
                        System.out.print(" "); // Use print() for spaces as well
                    }
                }
                System.out.println(); // Move to the next line after each row is complete
            }
        }
    }