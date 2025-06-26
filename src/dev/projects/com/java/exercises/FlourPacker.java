package dev.projects.com.java.exercises;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        //weight cannot be negative
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }//closing if
        //Calculates the total weight of the big bags
        int bigKilos = bigCount * 5;
        int totalKilos = bigKilos + smallCount;
        //Checks if the remainder when the goal is divided by 5 is less than or equal to the number of small bags.
        // This ensures that any leftover weight (that can't be filled by big bags) can be filled using small bags.
        return totalKilos >= goal && goal % 5 <= smallCount;
    }//closing method
}//closing class
