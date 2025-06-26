package LeetCodeProjects;

//given an int n, return a string array answer where
// answer[i] is equal to "Fizz" if i is divisible by 3, "Buzz" if i is divisible by 5,
// "FizzBuzz" if i is divisible by both 3 and 5, and i otherwise.

import java.util.ArrayList;
import java.util.List;

public class LC003_FizzBuzz {
    public static void main(String[] args) {
        // Example usage
        LC003_FizzBuzz solution = new LC003_FizzBuzz();
        int n = 15; // Change this value to test with different inputs
        List<String> result = solution.fizzBuzz(n);

        // Print the result
        for (String str : result) {// Iterate through the list and print each string
            System.out.println(str);
        }
    }
    public List<String> fizzBuzz(int n) {
        // Create a list to store the results
        List<String> result = new ArrayList<>(n);

        // Loop through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check divisibility and append the appropriate string
            if (i % 3 == 0 && i % 5 == 0) {//divisible by 5 & 3
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {//divisible by 3
                result.add("Fizz");
            } else if (i % 5 == 0) {//divisible by 5
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result; // Return the list of results
    }
}
