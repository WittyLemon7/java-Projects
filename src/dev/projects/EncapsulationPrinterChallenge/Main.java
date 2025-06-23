package dev.projects.EncapsulationPrinterChallenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial toner level: " + printer.addToner(0));
        System.out.println("Pages printed: " + printer.printPages(5));
        System.out.println("Pages printed: " + printer.getPagesPrinted());
        System.out.println("Toner level after printing: " + printer.addToner(0));
        System.out.println("Pages printed: " + printer.printPages(10));
        System.out.println("Pages printed: " + printer.getPagesPrinted());
    }


}
