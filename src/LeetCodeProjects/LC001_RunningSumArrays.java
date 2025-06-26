package LeetCodeProjects;

public class LC001_RunningSumArrays {
    public static void main(String[] args) {
        // Example usage
        LC001_RunningSumArrays solution = new LC001_RunningSumArrays();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.runningSum(nums);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length]; // Create an array to store the running sum
        result[0] = nums[0]; // The first element is the same as the input array

        for (int i = 1; i < nums.length; i++) {// The first element's running
            // sum is just itself → no prior elements to add

            result[i] = result[i - 1] + nums[i]; // Calculate the running sum
        }

        return result; // Return the resulting array
    }
    //Time Complexity: O(n) where n is the length of the input array nums.
    //SpaceComplexity O(i) where i is the length of the result array,
    // which is equal to the length of nums.
    // This is because we are using an additional array to store the running sum.

}
