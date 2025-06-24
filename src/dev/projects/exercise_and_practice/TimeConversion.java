package com.java.exercises;



public class TimeConversion {

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return minutes + " minutes and " + remainingSeconds + " seconds";
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }
        int totalSeconds = (minutes * 60) + seconds;
        return getDurationString(totalSeconds);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(3945)); // Example usage
        System.out.println(getDurationString(65, 45)); // Example usage
        System.out.println(getDurationString(59, 45)); //example
        System.out.println(getDurationString( 4560));
    }
}

