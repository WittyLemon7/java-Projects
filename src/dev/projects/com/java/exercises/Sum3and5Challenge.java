//sum 3 and 5 challenge

package dev.projects.com.java.exercises;

public class Sum3and5Challenge {

    public static void main(String[] args) {

        int countNum = 0;
        int sum = 0;

        for (int i = 1;i <= 1000;i++) {
            //check if number is divisible by 3 & 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number " + i + " is divisible by 3 and 5");
                countNum++;
                //add
                sum += i;
            }//closing if
            if (countNum == 5) {
                System.out.println("Found 5 numbers divisible by 3 & 5");
                break;
            }//closing subnest if
        }//closing for
        System.out.println("sum is " + sum);


    }//closing main method
}//closing class
