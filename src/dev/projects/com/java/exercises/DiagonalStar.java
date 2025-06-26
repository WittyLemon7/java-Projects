package dev.projects.com.java.exercises;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(8);

    }//closing main method
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 0; row < number; row++) {
                for (int column = 0; column < number; column++) {
                    //row == 0 || row == number - 1: Ensures the first and last rows are filled with stars.
                    //column == 0 || column == number - 1: Ensures the first and last columns are filled with stars.
                    //column == 0 || column == number - 1: Ensures the first and last columns are filled with stars.
                    //row == column || column == number - row - 1: Ensures the diagonal from the top-left to the bottom-right is filled with stars.
                    if (row == 0 || row == number - 1 || column == 0 || column == number - 1 || row == column || column == number - row - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }//closing 2nd for
                System.out.println();
            }//closing 1st for
        }
    }//closing method

}//closing class
