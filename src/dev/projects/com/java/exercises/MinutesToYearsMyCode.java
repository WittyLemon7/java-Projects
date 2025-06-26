package dev.projects.com.java.exercises;

public class MinutesToYearsMyCode {

    public static void main(String[] args) {
        printYearsAndDays(5000);

    }
    private static final long INVALID_VALUE = -1;

    public static void printYearsAndDays(long minutes) {
        // minutes cannot be less than 0
        if (minutes < 0) {
            System.out.println(" Invalis Value ");
            return;
        }
        //calculation
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        days = days % 365; //remaining days of the year

        System.out.println(minutes + " minutes  = " + years + " years and " + days + " days ");



    }
}
