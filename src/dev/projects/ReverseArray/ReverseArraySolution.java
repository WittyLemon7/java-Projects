package dev.projects.ReverseArray;

import java.util.Arrays;

public class ReverseArraySolution {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverse(myArray); // Call the reverse method to reverse the array
    }

    private static void reverse(int[] array) {

        System.out.println("Array = " + Arrays.toString(array));
        int maxIndex = array.length - 1;// Calculate the maximum index of the array
        int halfLength = array.length / 2;// Calculate half the length of the array to avoid unnecessary swaps
        for (int i = 0; i < halfLength; i++) {// Loop through the first half of the array
            int temp = array[i];                    // Store the current element in a temporary variable
            array[i] = array[maxIndex - i];         // Swap the current element with the corresponding element from the end of the array
            array[maxIndex - i] = temp;             // Assign the temporary variable to the corresponding element from the end of the array
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }


}
