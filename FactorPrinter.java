package com.java.exercises;

public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }//closing main method
    public static  void printFactors(int number){
        if (number < 1){
            System.out.println("Invalid Value");
            return;
        }//closing if
        //initialize factor
        int factor = 1;
        while (factor <= number){
            //check if number is a factor
            if (number % factor == 0){
                //print factor
                System.out.println(factor);
            }//closing nest if
            //continue to next factor
            factor++;
        }//closing while

    }//closing method
}//closing class

//better solution
//public class FactorPrinter {
//
//    public static void printFactors(int number) {
//
//        if (number < 1) {
//            System.out.println("Invalid Value");
//            return;
//        }
//
//        for (int i = 1; i <= number; i++) {
//            if (number % i == 0) {
//                System.out.println(i);
//            }
//        }
//    }
//}

