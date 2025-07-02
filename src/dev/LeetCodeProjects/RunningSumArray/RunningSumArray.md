# Running Sum of an Array

# Problem Statement
Given an integer array `nums`, return an array `result` such that `result[i]` is the running sum of `nums[0]` to `nums[i]`.

# Discussion
The running sum of an array is a common problem that helps in understanding cumulative sums and prefix sums. The goal is to create a new array where each element at index `i` is the sum of all elements from the original array up to index `i`.

# Walkthrough

```java
package dev.LeetCodeProjects;

public class LC001_RunningSum1DArrays {
    public static void main(String[] args) {
        dev.LeetCodeProjects.RunningSumArray.LC001_RunningSum1DArrays runningSum = new dev.LeetCodeProjects.RunningSumArray.LC001_RunningSum1DArrays();//
        int[] nums = {1, 2, 3, 4};
        int[] results = runningSum.runningSum(nums);// Create an instance of the class and call the runningSum method
        for (int result : results) {// Loop through the results array
            System.out.print(result + " ");
        }
    }

    public int[] runningSum(int[] num) {// Method to calculate the running sum of a 1D array
        int[] results = new int[num.length];// Initialize the results array with the same length as num
        results[0] = num[0];// Set the first element of results to the first element of num

        for (int i = 1; i < num.length; i++) {// Loop through the array starting from the second element
            results[i] = num[i] + results[i - 1];// Calculate the running sum by adding the current element to the previous running sum
        }
        return results;
    }
    //Time complexity O(n)
    //Space Complexity O(i)

}
```
🔹Initialise the `results` array with the same length as `num`.

??Set the first element of `results` to the first element of `num`.

??Loop through the array starting from the second element.

??Calculate the running sum by adding the current element to the previous running sum.

??Return the `results` array containing the running sums.

# Logic & Explanation
- **Initialization**: The `results` array is initialized with the same length as the input array `num`. The first element of `results` is set to the first element of `num`.
- **Looping through the Array**: A loop starts from the second element of `num` (index 1) and iterates through the array.
- **Calculating Running Sum**: For each element at index `i`, the running sum is calculated by adding the current element `num[i]` to the previous running sum `results[i - 1]`.

# Edge Cases
- **Empty Array**: If the input array is empty, the method should return an empty array.
- **Single Element Array**: If the input array has only one element, the running sum should be the same as the input element.

- **Negative Numbers**: The method should handle negative numbers correctly, ensuring that the running sum reflects the cumulative total accurately.

# Use Case
The running sum of an array is useful in various scenarios, such as:
- **Data Analysis**: Calculating cumulative totals for financial data, sales figures, or any sequential data.

## Related Concepts
[[java]]
[[arrays]]
