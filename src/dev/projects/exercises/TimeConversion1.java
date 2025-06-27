package dev.projects.exercises;

public class TimeConversion1 {

    // Convert seconds to HH:MM:SS format
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int hours = seconds / 3600;
        int remainingSecondsAfterHours = seconds % 3600;
        int minutes = remainingSecondsAfterHours / 60;
        int remainingSeconds = remainingSecondsAfterHours % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
    }

    // Convert minutes and seconds to HH:MM:SS format
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        int totalSeconds = (minutes * 60) + seconds;
        return getDurationString(totalSeconds);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(3945)); // Example usage
        System.out.println(getDurationString(65, 45)); // Example usage
        System.out.println(getDurationString( 4560));
        System.out.println(getDurationString( 65,145));
    }
}

