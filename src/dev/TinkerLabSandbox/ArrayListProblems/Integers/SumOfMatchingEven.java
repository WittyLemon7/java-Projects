package dev.TinkerLabSandbox.ArrayListProblems.Integers;

import java.util.ArrayList;
import java.util.Random;

public class SumOfMatchingEven {
    public static void main(String[] args) {

        // Create a random int list
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // Create a random object
        Random rand = new Random();

        // Specify no & range
        int listSize = 10; // list size
        int min = 1; // lower limit
        int max = 100; // upper limit

        // Generate & add random int to list
        for (int i = 0; i < listSize; i++) {
            int num = rand.nextInt(max - min + 1) + min; // range [min, max]
            list1.add(num);
        }
        for (int j = 0; j < listSize; j++) {
            int num1 = rand.nextInt(max - min + 1) + min;
            list2.add(num1);

        }
        //print random generated lists
        System.out.println(" List1 : " + list1);
        System.out.println(" List2 : " + list2);

        //list to store sum of matched even numbers
        ArrayList<Integer> evenSum = new ArrayList<>();

        //check even in both lists
        for (int l = 0; l < Math.min(list1.size(), list2.size()); l++) {//loop through both lists
            if (list1.get(l) % 2 == 0 && list2.get(l) % 2 == 0){// check even
                System.out.println("Index " + l + ": (" + list1.get(l) + ", " + list2.get(l) + ")");// print index & numbers
                evenSum.add(list1.get(l) + list2.get(l));// add to the even sum list

            }
        }
        //print even sum list
        System.out.println("Sum of even numbers in both lists : " + evenSum);
    }
}
