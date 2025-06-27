package dev.projects.exercises;

public class SwitchDaysOfTheWeek {


        public static void main(String[] args) {
            printDaysOfTheWeek(3);
            printDaysOfTheWeek(4);
            printDaysOfTheWeek(5);
            printDaysOfTheWeek(6);
            printDaysOfTheWeek(7);
            printDaysOfTheWeek(1);
            printDaysOfTheWeek(2);
            printDaysOfTheWeek(8);

            printDaysOfTheWeek(1);
            printDaysOfTheWeek(2);
            printDaysOfTheWeek(3);
            printDaysOfTheWeek(4);
            printDaysOfTheWeek(5);
            printDaysOfTheWeek(6);
            printDaysOfTheWeek(7);
            printDaysOfTheWeek(8);



        }
        public  static void printDaysOfTheWeek(int day) {

            String dayName = switch (day) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Invalid day";
            };

            System.out.println("Day " + day + " is " + dayName);
        }
        public  static  void printWeekOfDay(int day) {

            String dayOfWeek = " Invalid Day ";
            if (day == 1) {
                dayOfWeek = "Monday";
            } else if (day == 2) {
                dayOfWeek = "Tuesday";
            } else if (day == 3) {
                dayOfWeek = "Wednesday";
            } else if (day == 4) {
                dayOfWeek = "Thursday";
            } else if (day == 5) {
                dayOfWeek = "Friday";
            } else if (day == 6) {
                dayOfWeek = "Saturday";
            } else if (day == 7) {
                dayOfWeek = "Sunday";
            }
            System.out.println("Day " + day + " is " + dayOfWeek);
        }
    }


