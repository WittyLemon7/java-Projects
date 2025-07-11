package dev.TinkerLabSandbox.JavaBasics;

public class CheckNumber {
    public static void main(String[] args) {
        int num2 = -5; // Example number
        System.out.println(checkNumber(num2));

        int num1 = 5; //Example number 2
        System.out.println(checkNumber(num1));

    }

    //method to check if number is +ve or -ve
    public static String checkNumber( int num) {
        if (num < 0 ) {
            System.out.println("Number " + num + " is negative number");
        } else if (num > 0) {
            System.out.println("Number " + num + "is a positive number");
        }
        return "Number is Zero";



    }
}
