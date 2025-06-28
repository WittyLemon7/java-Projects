package dev.projects.SmartLibrary;

public class Main {
    public static void main(String[] args) {
        // Create components
        BookShelf bookShelf = new BookShelf();
        ReadingArea readingArea = new ReadingArea(5); // 5 seats available
        Librarian librarian = new Librarian("Placeholder");

        // Create Library
        Library library = new Library(bookShelf, readingArea, librarian);

        // Operate the Library
        System.out.println("===== Library Operations =====");
        library.operateLibrary(); // Initialize operations

        // Test adding and listing books
        library.addBook("To Kill a Mockingbird");
        library.addBook("The Great Gatsby");
        library.addBook("Dune");
        // List all books
        library.listBooks();

        // Test issuing and returning books
        library.issueBook("Dune", "Alice");
        library.returnBook("Dune", "Alice");

        // Test reserving and releasing seats
        library.reserveReadingArea(2); // Valid seat
        library.reserveReadingArea(6); // Invalid seat
        library.releaseReadingArea(2); // Valid seat
        library.releaseReadingArea(6); // Invalid seat
    }


}
