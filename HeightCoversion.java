package com.java.exercises;

public class HeightCoversion {





        // Convert height in inches to centimeters
        public static double convertToCentimeters(int heightInInches) {
            return heightInInches * 2.54;
        }

        // Convert height in feet and inches to centimeters
        public static double convertToCentimeters(int feet, int inches) {
            // return convertToCentimeters((feet * 12) + inches);
           // int heightInInches = (feet * 12) + inches;
            //return convertToCentimeters(heightInInches);
            int feetToInches = feet * 12;
            int totalInches = feetToInches + inches;
            double result = convertToCentimeters(totalInches);
            return result;
        }

        public static void main(String[] args) {
            int feet = 5;
            int inches = 8;
            System.out.println(feet + " Feet and " + inches + " Inches is " + convertToCentimeters(feet, inches) + " Centimeters");

            int heightInInches = 68;
            System.out.println(heightInInches + " Inches is " + convertToCentimeters(heightInInches) + " Centimeters");
        }
    }


