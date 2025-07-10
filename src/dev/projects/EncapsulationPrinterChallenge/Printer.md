# Encapsulation explained  Printer class
## Problem Statement
Create a `Printer` class that simulates a printer's functionality, including printing documents, checking ink levels, and managing paper. The class should encapsulate the properties and behaviors of a printer.
## Discussion
The `Printer` class is designed to represent a printer's functionality, allowing users to print documents, check ink levels, and manage paper. This class encapsulates the properties and behaviors of a printer, providing a clear interface for users to interact with the printer's features.
## Walkthrough
```java
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
```
## Logic & Explanation
-`getters` for toner level and pages printed: The `getPagesPrinted` method provides access to the total number of pages printed, allowing users to check the printer's usage.
- `constructor`: The constructor initializes the printer with a specified toner level and duplex mode. It checks if the toner level is within a valid range (0 to 100) and sets the duplex mode accordingly.
- method to print pages

## Edge Cases
- `null values` : Ensure that the toner level is not null or negative when initializing the printer.
- `negative print pages` :Number of pages print cannot be less than 0.

