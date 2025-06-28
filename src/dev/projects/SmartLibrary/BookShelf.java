package dev.projects.SmartLibrary;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {

    private List<String> books = new ArrayList<>();

    public BookShelf() {// No-args constructor initializes an empty book shelf
        books = new ArrayList<>();
    }

    public void addBook(String bookName) {
        books.add(bookName);
        System.out.println("Book added: " + bookName);
    }

    public void listBooks() {// Method to list all books on the shelf
        System.out.println("Books available on the shelf:");
        for (String book : books) {// Iterate through the list of books and print each one
            System.out.println(book);
        }
    }
}
