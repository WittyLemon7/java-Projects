package dev.TinkerLabSandbox.DecimalComparator;

public class DecimalComparator {
    public static void main(String[] args) {

        // Test the method with some example values
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); // false
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.175)); // true
        System.out.println(areEqualByThreeDecimalPlaces(3.123456, 3.123456)); // true
        System.out.println(areEqualByThreeDecimalPlaces(3.123, 3.1234)); // false

    }
    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue) {
        // Round both values to three decimal places and compare them
        return Math.round(firstValue * 1000) == Math.round(secondValue * 1000);
    }
//     Alternative method using integer comparison
//    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2) {
//        //multiply by 1000 to cast into int and truncate it to 3 decimal places
//        int intnum1 = (int) (num1 * 1000);
//        int intnum2 = (int) (num2 * 1000);
//        //compare the values
//        return intnum1 == intnum2;
//    }
}
