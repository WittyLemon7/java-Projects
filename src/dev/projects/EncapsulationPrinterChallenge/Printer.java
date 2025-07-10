package dev.projects.EncapsulationPrinterChallenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
//constructor to initialize the printer with toner level and duplex mode
    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
//getter for toner level
    public int addToner(int tonerAmount) {

        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }
//method to print pages, considering duplex mode
    public int printPages(int pages) {

        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
//getter for toner level
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
//my solution

//private int tonerLevel;
//private int pagesPrinted;
//private boolean isDupex;
//
//public Printer(int tonerLevel, boolean isDupex) {
//    if (tonerLevel < 0) {
//        this.tonerLevel = 0;
//    } else if (tonerLevel > 100) {
//        this.tonerLevel = 100;
//    } else {
//        this.tonerLevel = tonerLevel;
//    }
//    this.pagesPrinted = 0; // Initialize to 0
//    this.isDupex = isDupex;
//}
//
//public int tonerRemaining() {
//    return tonerLevel;
//}
//public int getPagesPrinted() {
//    return pagesPrinted;
//}
//
//public void addToner(int tonerAmount) {
//    if (tonerAmount <= 0) { // Validate toner amount
//        System.out.println("Invalid toner amount. Please add a positive value.");
//        return;
//    }
//    tonerLevel = tonerLevel + tonerAmount;
//    if (tonerLevel > 100) {
//        tonerLevel = 100;
//    }
//    System.out.println("Toner level: " + tonerLevel);
//}
//public void printPages(int pages) {
//    int actualPagesPrinted = pages;
//    if (isDupex) {
//        actualPagesPrinted = (pages / 2) + (pages % 2);
//    }
//    pagesPrinted = pagesPrinted + actualPagesPrinted;
//    System.out.println("Pages printed: " + pagesPrinted);
//}

// public void printPages(int pages) {
//   int actualPagesPrinted = pages; // Separate variable for clarity
// if (isDupex) {
//   actualPagesPrinted = (pages / 2) + (pages % 2);
//}
//     pagesPrinted = pagesPrinted + actualPagesPrinted;
//     System.out.println("Pages printed: " + pagesPrinted);
// }

