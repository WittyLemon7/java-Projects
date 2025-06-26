package dev.projects.com.java.exercises;

public class EqualSumChecker {

    public static boolean hasEqualSum(int num1, int num2, int num3) {

        //define the values
        if ((num1 + num2) == (num3)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(4, 2, 3));
        System.out.println(hasEqualSum(2, 2, 4));
        System.out.println(hasEqualSum(1, 1, 2));

    }
}
