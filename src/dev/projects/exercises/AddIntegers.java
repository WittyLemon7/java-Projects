package dev.projects.exercises;

public class AddIntegers {

    public static void main(String[] args) {
        int [] numArray = {1,2,3,4,5,6};
        System.out.println(" Sum of numbers in array is " + sumInt(numArray));
    }
    public static int sumInt(int[] num){




        int sum = 0;

        for (int i = 0;i < num.length;i++) {
            sum += num[i];
        }
        return sum;
    }
}


