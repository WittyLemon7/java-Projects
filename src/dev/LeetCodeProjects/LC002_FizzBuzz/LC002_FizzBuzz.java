package dev.LeetCodeProjects.LC002_FizzBuzz;
//FizzBuzz is a classic programming problem that requires printing
// numbers from 1 to n, but with a twist: for multiples of 3,
// print "Fizz" instead of the number, for multiples of 5, print "Buzz",
// and for multiples of both 3 and 5, print "FizzBuzz".
public class LC002_FizzBuzz {
    public static void main(String[] args) {
        int n = 15; // Example input
        fizzBuzz(n);
    }

    public static void fizzBuzz(int n) {// FizzBuzz implementation
        for (int i = 1; i <= n; i++) {// Loop from 1 to n
            if (i % 3 == 0 && i % 5 == 0) {// Check if divisible by both 3 and 5
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {// Check if divisible by 3
                System.out.println("Fizz");
            } else if (i % 5 == 0) {// Check if divisible by 5
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
