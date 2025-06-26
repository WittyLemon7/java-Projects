package dev.projects.com.java.exercises;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }//closing main method

    public  static  void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }
        int reverseNumber = reverse(number);
        int digitCount = getDigitCount(number);
        int reverseDigitCount = getDigitCount(reverseNumber);
        int lastDigit = 0;
        while (reverseNumber > 0){
            lastDigit = reverseNumber % 10;
            switch (lastDigit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reverseNumber /= 10;
        }
        if (digitCount > reverseDigitCount){
            for (int i = 0; i < (digitCount - reverseDigitCount); i++){
                System.out.println("Zero");
            }
        }
    }//closing number to words method
    //reverse method
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }//closing reverse method
//digit count method
    public static int getDigitCount(int number) {
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }//closing get digit count method

}//closing class
