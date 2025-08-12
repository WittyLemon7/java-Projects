package dev.TinkerLabSandbox.ArrayListProblems.Integers;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenCheck {
    public static void main(String[] args) {

        ArrayList<Integer> number1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(number1);

        //filter out even numbers
//        number1.removeIf(n -> n % 2 == 0);
        // this prints the remaining ODD numbers in the list
//        System.out.println(number1);
        // crete a new list with the even numbers
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < number1.size(); i++) {//loop through the list
            if (number1.get(i) % 2 == 0) {//check if the number is even
                evenNumbers.add(number1.get(i));//add it to the new list
            }
        }
        System.out.println(evenNumbers);
    }
}
