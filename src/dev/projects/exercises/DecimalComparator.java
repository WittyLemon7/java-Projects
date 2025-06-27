package dev.projects.exercises;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2) {
        //multiply by 1000 and cast to int
        int intnum1 = (int)(num1 * 1000);
        int intnum2 = (int) (num2 * 1000);
        //compare the values
        return intnum1 == intnum2;


    }

    public static void main(String[] args) {
       System.out.println(areEqualByThreeDecimalPlaces(1,2));
       System.out.println(areEqualByThreeDecimalPlaces(3.145,3.145));
       System.out.println(areEqualByThreeDecimalPlaces(3.143786,3.143794));

    }
}
