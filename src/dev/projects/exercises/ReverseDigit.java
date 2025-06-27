package dev.projects.exercises;

public class ReverseDigit {
    public static void main(String[] args) {
        System.out.println("Reverse of 1234 is " + reverseDigits(1234));
        System.out.println("Reverse of -567 is " + reverseDigits(-567));
    }//closing main method

    public  static int reverseDigits(int num) {
        boolean isNegative = num < 0;
        if (isNegative) {
            num = -num;
        }//closing if
        int reverseNum = 0;

        while (num > 0) {
            int digit = (num % 10);
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }// closing while
        if (isNegative) {
            reverseNum = -reverseNum;
        }//closing second if
        return reverseNum;
    }//closing method
}//closing class
