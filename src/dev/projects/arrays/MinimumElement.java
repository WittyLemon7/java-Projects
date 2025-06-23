package dev.projects.arrays;

public class MinimumElement {
    public static void main(String[] args) {
        int[][] array = {
                {12, 7, 19},
                {3, 15, 9},
                {4, 18, 21}
        };
        // Initialize min with the first element of the array
        int min = array[0][0];


    // Iterate through the array to find the minimum element
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j]; // Update min if a smaller element is found
                }
            }
        }
        // Print the minimum element found in the array
        System.out.println("Minimum Element: " + min);
    }
}
