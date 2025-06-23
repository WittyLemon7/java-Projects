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
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
