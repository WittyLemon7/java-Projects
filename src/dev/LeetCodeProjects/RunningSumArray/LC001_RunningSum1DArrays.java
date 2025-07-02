package dev.LeetCodeProjects.RunningSumArray;

public class LC001_RunningSum1DArrays {
    public static void main(String[] args) {
        LC001_RunningSum1DArrays runningSum = new LC001_RunningSum1DArrays();//
        int[] nums = {1, 2, 3, 4};
        int[] results = runningSum.runningSum(nums);// Create an instance of the class and call the runningSum method
        for (int result : results) {// Loop through the results array
            System.out.print(result + " ");
        }
    }
    public int[] runningSum(int[] num) {// Method to calculate the running sum of a 1D array
        int[] results = new int[num.length];// Initialize the results array with the same length as num
        results[0] = num[0];// Set the first element of results to the first element of num

        for (int i = 1;i < num.length;i++) {// Loop through the array starting from the second element
            results[i] = num[i] + results[i - 1];// Calculate the running sum by adding the current element to the previous running sum
        }
        return results;
    }
    //Time complexity O(n)
    //Space Complexity O(i)

}
