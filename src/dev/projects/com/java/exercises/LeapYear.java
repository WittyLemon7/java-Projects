package dev.projects.com.java.exercises;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        //define range of years and year cannot be 0
        if (year < 1 || year > 9999) {
            return false;
        }
        //leapYear should be /4 and not /100
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1990));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1658));


    }
}
