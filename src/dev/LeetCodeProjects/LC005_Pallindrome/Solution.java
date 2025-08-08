package dev.LeetCodeProjects.LC005_Pallindrome;

/* This solution reverses half the number
* this aloows to remove limit overflow checks altogether
* as we are reversing half the no to determine if an int is pallindrome
* otherwise use (Integer.MAX_VALUE) to check overflow
* note : always check overflows in integer operations
 */

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        return (x == reversedHalf) || (x == reversedHalf / 10);
    }

    public static void main(String[] args) {

        int[] nums = {121, -121, 1001, 2345, 78987};
        // You need to create an instance of the Solution class
        Solution solution = new Solution();

        for ( int num : nums) {
            // Call the instance method on the created object
            if (solution.isPalindrome(num)) {
                System.out.println(num + " is a palindrome");
            } else {
                System.out.println(num + " is not a palindrome");
            }
        }
    }

}