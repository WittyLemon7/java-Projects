package com.java.exercises;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020)); // Output: 31
        System.out.println(getDaysInMonth(2, 2020)); // Output: 29 (Leap year)
        System.out.println(getDaysInMonth(2, 2019)); // Output: 28 (Non-leap year)
        System.out.println(getDaysInMonth(4, 2020)); // Output: 30
        System.out.println(getDaysInMonth(13, 2020)); // Output: -1 (Invalid month)
    }

    public static boolean isLeapYear(int year) {
        // Define range of years and year cannot be 0
        if (year < 1 || year > 9999) {
            return false;
        }
        // Leap year should be divisible by 4 and not divisible by 100, unless also divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        }

        int daysInMonth;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = isLeapYear(year) ? 29 : 28;
                break;
            default:
                daysInMonth = -1;
                break;
        }
        return daysInMonth;
    }
}

//public class NumberOfDaysInMonth {
    // write code here

   // public static boolean isLeapYear(int year) {
     //   // Define range
       // if (year < 1 || year > 9999) {
         //   return false;
        //}
        // Leap year calculation
        //return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    //}

    //public static int getDaysInMonth(int month, int year) {
      //  if (month < 1 || month > 12) {
        //    return -1;
        //}
        //if (year < 1 || year > 9999) {
          //  return -1;
        //}

        //int daysInMonth = switch (month) {
    //        case 1, 3, 5, 7, 8, 10, 12 -> 31;
      //      case 4, 6, 9, 11 -> 30;
        //    case 2 -> isLeapYear(year) ? 29 : 28;
          //  default -> -1; // This case will never be reached due to previous checks
       // };

 //       return daysInMonth;
   // }
//}
