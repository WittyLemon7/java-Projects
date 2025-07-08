package dev.LeetCodeProjects.LC004_RansomNote;

public class RansomNote {
    public static void main(String[] args) {

        String ransomNote = "a";
        String magazine = "b";
        boolean result = canConstruct(ransomNote, magazine);
        System.out.println("Can construct ransom note: " + result); // Output: false

        ransomNote = "aa";
        magazine = "ab";
        result = canConstruct(ransomNote, magazine);
        System.out.println("Can construct ransom note: " + result); // Output: false

        ransomNote = "aa";
        magazine = "aab";
        result = canConstruct(ransomNote, magazine);
        System.out.println("Can construct ransom note: " + result); // Output: true

    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26]; // Array to count occurrences of each character

        // Count characters in the magazine
        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Check if we can construct the ransom note
        for (char c : ransomNote.toCharArray()) {
            if (charCount[c - 'a'] == 0) {
                return false; // Character not available in magazine
            }
            charCount[c - 'a']--; // Use one occurrence of the character
        }

        return true; // All characters in ransom note can be constructed from magazine
    }
}
