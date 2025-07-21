package dev.TinkerLabSandbox.Palindrome;

public class PalindromeStrings {
    public static void main(String[] args) {

        // Test cases for palindrome checking
        String[] testStrings = {"ROTATOR","KAYAK","WORD","DEITY"};

        // Check each string and print whether it is a palindrome
        for (String str : testStrings) {
            if (isPalindrome(str)) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
        }
    }
    //method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {// Check for null or empty strings
            return false;
        }
        // Clean the string by removing non-alphanumeric characters and converting to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;// Initialize left pointer
        int right = cleanedStr.length() - 1;// Initialize right pointer

        while (left < right) {//loop until the pointers meet
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {// Compare characters at the left and right pointers
                return false;
            }
            left++;// Move the left pointer to the right
            right--;// Move the right pointer to the left
        }
        return true;
    }
}
