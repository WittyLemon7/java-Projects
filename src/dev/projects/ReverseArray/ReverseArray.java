package dev.projects.ReverseArray;

public class ReverseArray {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array:");
        printArray(intArray);

        reverseArray(intArray);
        System.out.println("Reversed Array:");
        printArray(intArray);
    }

    private static void reverseArray(int[] array) {
        int start = 0;// Get the first index of the array
        int end = array.length - 1;// Get the last index of the array

        while (start < end) {// While start index is less than end index
            // Swap elements
            int temp = array[start];// Store the start element in a temporary variable
            array[start] = array[end];// Assign the end element to the start index
            array[end] = temp;// Assign the temporary variable (start element) to the end index

            start++;// Move the start index to the right
            end--;// Move the end index to the left
        }
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
