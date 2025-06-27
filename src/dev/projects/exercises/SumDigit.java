package dev.projects.exercises;

public class SumDigit {

    public static int sumDigits(int number) {

        if (number < 0) {
            return -1;

        }int sum = 0;

        while (number > 0) {
            //extract the last digit
            int digit = (number % 10);
            //add the digit to the sum
            sum += digit;
            //remove the last digit
            number /= 10;
        }//closing while
        return sum;
    }//closing sum  digit method

    public static void main(String[] args) {
        System.out.println(" the sum of digits in 125 is " +sumDigits(125));
        System.out.println("The sum of digits in 10000 is" +sumDigits(10000));
        System.out.println("The sum of digits in 2 is" + sumDigits(2));
        System.out.println("The sum of digits in 187 is"  + sumDigits(187));
        System.out.println("The sum of digits in 1234 is " + sumDigits(1234));
        System.out.println("The sum of digits in -123 is " + sumDigits(-123));

    }
}
