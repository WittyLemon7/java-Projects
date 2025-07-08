package dev.TinkerLabSandbox.RansomNoteSolution;

public class RansomNoteSolution {
    public static void main(String[] args) {

        RansomNoteSolution solution = new RansomNoteSolution();
        String ransomNote = "aa";
        String magazine = "aab";
        boolean canConstruct = solution.canConstruct(ransomNote, magazine);
        System.out.println("Can construct ransom note: " + canConstruct);

    }

    public boolean canConstruct(String ransomNote, String magazine) {

        for (int i = 0; i < ransomNote.length(); i++) {// Iterate through each character in the ransom note
            char c = ransomNote.charAt(i);// Get the character at the current index
            int matchingIndex = magazine.indexOf(c);// Find the index of the character in the magazine

            if (matchingIndex == -1) {// If the character is not found in the magazine
                return false; // Character not found in magazine
            } else {
                // Remove the character from the magazine to prevent reuse
                magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex + 1);// Remove the character at the found index
            }
        }
        return true; // All characters in the ransom note were found in the magazine

//            int  magazineIndex = -1;
//
//            for (int j = 0; j < magazine.length(); j++) {
//                    char m = magazine.charAt(j);
//
//                    if (c == m) {
//                        magazineIndex = j;
//                        break;
//                    }
//                }
//            }
    }
}
