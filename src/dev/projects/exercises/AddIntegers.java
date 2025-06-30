package dev.projects.exercises;

public class AddIntegers {

    public static void main(String[] args) {
        int [] numArray = {1,2,3,4,5,6};
        System.out.println(" Sum of numbers in array is " + sumInt(numArray));
    }
    public static int sumInt(int[] num){// Method to calculate the sum
        // of integers in an array

        int sum = 0;// Initialize sum to 0

        for (int i = 0;i < num.length;i++) {// Loop through the array
            sum += num[i];// Add each element to the sum
        }
        return sum;
    }
}


