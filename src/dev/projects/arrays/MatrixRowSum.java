package dev.projects.arrays;

public class MatrixRowSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 5, 2},
            {8, 1, 7},
            {6, 4, 9}
        };

        // Using enhanced for loop to calculate the sum of each row
        for (int[] outerRow : matrix) {
            int sum = 0; // Initialize sum inside loop (resets per row)
            for (int element : outerRow) {
                sum += element; // Accumulate row sum
            }
            System.out.println("Row sum: " + sum);
        }
        // Using traditional for loop to calculate the sum of each row
        for (int i = 0; i < matrix.length; i++) { // Iterate through each row
            int sum = 0; // Initialize sum for the current row
            for (int j = 0; j < matrix[i].length; j++) { // Iterate through each column in the current row
                sum += matrix[i][j]; // Add the current element to the sum
            }
            System.out.println("Sum of row " + i + ": " + sum);
        }
    }
}
