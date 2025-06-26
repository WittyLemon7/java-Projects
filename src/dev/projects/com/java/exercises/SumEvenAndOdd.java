package dev.projects.com.java.exercises;

public class SumEvenAndOdd {


    public  static  boolean isEven(int num) {
        // number greater than 0
        //checks number is even
        return ((num > 0) && (num % 2 == 0));




    }//closing isEven method
    public  static  int sumEvenAndOdd(int start, int end) {

        if (start <= 0 || end <= 0 || start > end) {
            return -1;
        }//closing if
        int sumEven = 0;//initialise sum
        int sumOdd = 0;

        for (int i = start;i <= end;i++) {
            if (isEven(i)) {
                sumEven += i;
            } else {
                sumOdd += i;
            }//closing nest if
        }//closing for

        return sumEven - sumOdd;

    }//closing sum of even & odd method

    public static void main(String[] args) {
        System.out.println(sumEvenAndOdd(1,20));


    }
}
