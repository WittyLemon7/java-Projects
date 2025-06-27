package dev.projects.MinimumElement;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] returnArray = readIntegers();
        System.out.println(Arrays.toString(returnArray));

        int returnMin = findMin(returnArray);
        System.out.println("MIN = " + returnMin);


    }

    private static int[] readIntegers() {// This method reads integers from the user input, separated by commas.
        Scanner scanner = new Scanner(System.in);// Create a Scanner object to read input from the console.
        System.out.println("Enter integers seprated by commas");// Prompt the user to enter integers separated by commas.
        String input = scanner.nextLine();// Read the entire line of input from the user.

        String[] splits = input.split(",");// Split the input string into an array of strings using commas as the delimiter.
        int[] values = new int[splits.length];// Initialize an integer array with the same length as the number of splits.

        for (int i = 0; i < splits.length; i++) {// Loop through each split string.
            values[i] = Integer.parseInt(splits[i].trim());// Convert each split string to an integer after trimming any leading or trailing whitespace.
        }
        return values;
    }

    private static int findMin(int[] array) {// This method finds the minimum value in an array of integers.
        int min = Integer.MAX_VALUE;// Initialize min to the maximum possible integer value.
        for (int el : array) {// Loop through each element in the array.
            if (el < min) {// If the current element is less than the current minimum,
                min = el;
            }
        }
        return min;
    }

}
