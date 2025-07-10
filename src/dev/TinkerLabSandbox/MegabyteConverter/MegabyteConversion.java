package dev.TinkerLabSandbox.MegabyteConverter;

public class MegabyteConversion {
    public static void main(String[] args) {

        printMegabytesAndKilobytes(5000); // Example usage
        printMegabytesAndKilobytes(-1);   // Invalid value example
        printMegabytesAndKilobytes(1024);  // Edge case example

        printGigabytesAndMegabytes(5000); // Example usage
        printGigabytesAndMegabytes(-1);   // Invalid value example
        printGigabytesAndMegabytes(2048);  // Edge case example

    }
    //method to convert kilobytes to megabytes and remaining kilobytes
    public static void printMegabytesAndKilobytes(int kilobytes) {
        if (kilobytes < 0) {// Check for negative values
            System.out.println("Invalid Value");
        } else {
            int megabytes = kilobytes / 1024;// Convert kilobytes to megabytes
            int remainingKilobytes = kilobytes % 1024;// Calculate remaining kilobytes
            System.out.println(kilobytes + " KB = " + megabytes + " MB and " + remainingKilobytes + " KB");
        }
    }
    //method to convert megabytes to gigabytes and remaining megabytes
    public static void printGigabytesAndMegabytes(int megabytes) {
        if (megabytes < 0) {// Check for negative values
            System.out.println("Invalid Value");
        } else {
            int gigabytes = megabytes / 1024;// Convert megabytes to gigabytes
            int remainingMegabytes = megabytes % 1024;// Calculate remaining megabytes
            System.out.println(megabytes + " MB = " + gigabytes + " GB and " + remainingMegabytes + " MB");
        }
    }
}
