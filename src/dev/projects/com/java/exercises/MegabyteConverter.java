package dev.projects.com.java.exercises;

public class MegabyteConverter {

    public static  void  printMegabyteConverter(int kilobytes){

        if (kilobytes >= 0){
            int megabytes = kilobytes / 1024;
            int remainderMegabytes = kilobytes % 1024;
            System.out.println(kilobytes + " KB is " + megabytes + "  MB and " + remainderMegabytes + "  KB");
        }
        else if (kilobytes <= 0) {
            System.out.println("Invalid");
        }


    }
    public static void main(String[] args) {
        printMegabyteConverter(5678);
        printMegabyteConverter(112659);

    }
}
