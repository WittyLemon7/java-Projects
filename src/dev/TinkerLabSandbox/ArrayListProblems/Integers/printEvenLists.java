package dev.TinkerLabSandbox.ArrayListProblems.Integers;

import java.util.ArrayList;
import java.util.Arrays;

public class printEvenLists {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2, 5, 8, 7, 4, 9, 6, 12));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 14, 8, 7, 2, 10, 6, 3));

        //print both lists
        System.out.println(" List1 : " + list1);
        System.out.println("List2 : " + list2);

        // Find & print all pairs of numbers at  the same index which are both even

        System.out.println(" Pairs of Even numbers at the same index : ");

        for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {// loop through both lists
            // Math.min for BOUNDARY CHECK if lists are not same size
            if (list1.get(i) % 2 == 0 && list2.get(i) % 2 == 0) {// check even
                //print even at same index in both list
                System.out.println("Index " + i + ": (" + list1.get(i) + ", " + list2.get(i) + ")");
            }
        }
    }
}









