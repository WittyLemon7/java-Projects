package com.java.exercises;

public class SwitchStatementChallengeEnhance {



        public static void main(String[] args) {

            char characterValue = 'A';

            switch (characterValue) {
                case 'A' -> System.out.println(" A is ABLE");
                case 'B' -> System.out.println(" B is BAKER");
                case 'C' -> System.out.println(" C is CHARLIE");
                case 'D' -> System.out.println(" D is DOG");
                case 'E' -> System.out.println(" E is EASY");
                default -> System.out.println(" Letter " + characterValue + " was not found ");
            }// closing bracket for switch
        }// closing bracket for main method
    }// closing bracket for SwitchStatementChallengeEnhance class


