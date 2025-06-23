package dev.projects.MinimumElement;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        //solution to the Minimum Element challenge


        int count = readInteger(); // Read the number of elements
        int[] elements = readElements(count); // Read the elements into an array
        int min = findMin(elements); // Find the minimum element
        System.out.println("Minimum element is: " + min); // Print the minimum element
    }

    private static int readInteger() {

        Scanner scanner = new Scanner(System.in);// Create a Scanner object to read input from the console.
        System.out.print("Enter count: ");
        int count = scanner.nextInt();
        return count;
    }

    private static int[] readElements(int count) {// This method reads a specified number of integers from the user input.

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];// Initialize an integer array with the specified count.
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            array[i] = number;// Store each entered number in the array
        }
        return array;
    }

    private static int findMin(int[] array) {// This method finds the minimum element in an integer array.

        int cmv = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {     // 2
            if (array[i] < cmv) {                    // 3
                cmv = array[i];                      // 4
            }
        }
        return cmv;
    }

}
