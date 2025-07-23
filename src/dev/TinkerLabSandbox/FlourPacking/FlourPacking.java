package dev.TinkerLabSandbox.FlourPacking;

public class FlourPacking {
    public static void main(String[] args) {

        // Example usage of the canPack method
        System.out.println("Can pack 2 big bags and 3 small bags to make 11 kg? " + canPack(2, 3, 11)); // Should return true
        System.out.println("Can pack 1 big bag and 5 small bags to make 9 kg? " + canPack(1, 5, 9)); // Should return true

        // Edge cases
        System.out.println("Can pack 0 big bags and 0 small bags to make 0 kg? " + canPack(0, 0, 0)); // Should return true
        System.out.println("Can pack 0 big bags and 0 small bags to make 1 kg? " + canPack(0, 0, 1)); // Should return false
    }

    //method to determine if we can pack the goal amount of flour using big and small bags
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // Check if the goal is less than 0
        if (goal < 0) {
            return false;
        }

        // Calculate the maximum number of big bags that can be used
        int maxBigBags = goal / 5;

        // Use the smaller of the available big bags or the maximum needed
        if (maxBigBags > bigCount) {
            maxBigBags = bigCount;
        }

        // Calculate the remaining goal after using big bags
        int remainingGoal = goal - (maxBigBags * 5);

        // Check if we have enough small bags to meet the remaining goal
        return remainingGoal <= smallCount;
    }
}
//another version of the FlourPacking
//public class FlourPacker {
//    // write code here
//    public static boolean canPack(int bigCount,int smallCount, int goal) {
//        //weight cannot be negative
//        if (bigCount < 0 || smallCount < 0 || goal < 0) {
//            return false;
//        }//closing if
//        //calculate the weight  of bigCount as 1 bigCount = 5 kilos
//        int bugKilos = bigCount * 5;
//        //smallCount = 1 kilo as per challenge
//        int totalKilos = bugKilos + smallCount;
//        return totalKilos >= goal && goal % 5 <= smallCount;
//    }
//}