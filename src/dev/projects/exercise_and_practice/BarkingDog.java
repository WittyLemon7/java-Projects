package com.java.exercises;

public class BarkingDog {
    public  static boolean shouldWakeUp(boolean barkingDog, int hourOfDay) {
        //if  hour is less than or gretaer than 23 its not possible
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;

        }
        //if dog is barking before 8 am and after 10 pm should wake up
        return barkingDog && (hourOfDay < 8 || hourOfDay > 22);
    }


    public static void main(String[] args) {
        shouldWakeUp(false, 7);

    }
}
