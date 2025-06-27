package dev.projects.exercises;

public class ProductAndSumOfDigitDiffrence {

    public static void main(String[] args) {
        System.out.println(" The difference between product and sum of digits of 254 is " + ProductSumDigitDiffrence(254));
    }

    public static int ProductSumDigitDiffrence(int num) {

        if (num < 0) {
            return -1;
        }//closing if

        int sum = 0;
        int product = 1;
        //extract the last digit
        while (num > 0) {


            int digit = (num % 10);
            //add product the digit
            sum += digit;
            product *= digit;
            //remove the last digit
            num /= 10;
        }//closing while


        int result = (product - sum);
        return result;
    }//closing method



}//closing class

