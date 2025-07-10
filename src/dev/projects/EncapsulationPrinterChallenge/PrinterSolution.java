package dev.projects.EncapsulationPrinterChallenge;

public class PrinterSolution {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    //constructor that ensures toner level is between 0 and 100
    public PrinterSolution(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;// initialize pages printed to 0
    }

    //method to add toner amount that ensures toner amount remains
    //between 0 & 100
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

    //method to print pages that returns the number of pages printed
    public int printPages(int pages) {

        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    //getter for pages printed
    public int getPagesPrinted() {
        return pagesPrinted;
    }


}
