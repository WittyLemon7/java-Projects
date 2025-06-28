package dev.projects.SmartLibrary;

public class Library {

    private BookShelf bookShelf;
    private ReadingArea readingArea;
    private Librarian librarian;

    // Constructor
    public Library(BookShelf bookShelf, ReadingArea readingArea, Librarian librarian) {
        this.bookShelf = bookShelf;
        this.readingArea = readingArea;
        this.librarian = librarian;
    }

    public void addBook(String bookName) {
        bookShelf.addBook(bookName);
    }

    public void listBooks() {
        bookShelf.listBooks();
    }

    public void reserveReadingArea(int seatNumber) {
        if (seatNumber <= 0) {
            System.out.println("Error: Seat number must be positive.");
            return;
        }
        readingArea.reserveSeat(seatNumber);
    }

    public void releaseReadingArea(int seatNumber) {
        if (seatNumber <= 0) {
            System.out.println("Error: Seat number must be positive.");
            return;
        }
        readingArea.releaseSeat(seatNumber);
    }

    public void issueBook(String bookName, String user) {
        librarian.issueBook(bookName, user);
    }

    public void returnBook(String bookName, String user) {
        librarian.returnBook(bookName, user);
    }

    public void operateLibrary() {
        System.out.println("Library is now open for operations.");
        addBook("1984");
        listBooks();
        reserveReadingArea(2);
        releaseReadingArea(2);
        issueBook("1984", "Alice");
        returnBook("1984", "Alice");
    }
}
