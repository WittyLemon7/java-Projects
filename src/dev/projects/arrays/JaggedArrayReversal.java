package dev.projects.arrays;

public class JaggedArrayReversal {
    public static void main(String[] args) {
        int[][] jaggedArray = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        // Print original jagged array
        System.out.println("Original Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        //prnt the reversed jagged array
        reverseJaggedArray(jaggedArray);

// Print the reversed jagged array
        System.out.println("Reversed Jagged Array:");
        for (int[] row : jaggedArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    //Method to  Reverse the jagged array
    public static void reverseJaggedArray(int[][] jaggedArray) {
        for (int i = 0; i < jaggedArray.length; i++) {
            int left = 0;// Start from the leftmost element
            int right = jaggedArray[i].length - 1;// Start from the rightmost element
            while (left < right) {// Continue until the left index is less than the right index
                // Swap elements
                int temp = jaggedArray[i][left];// Store the left element in a temporary variable
                jaggedArray[i][left] = jaggedArray[i][right];// Assign the right element to the left index
                jaggedArray[i][right] = temp;// Assign the temporary variable (left element) to the right index
                left++;
                right--;
            }
        }
//        reverseJaggedArray(jaggedArray);// Recursive call to reverse the jagged array


    }
}

