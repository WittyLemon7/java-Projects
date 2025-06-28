package dev.projects.SmartLibrary;

public class Librarian {

    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    public void issueBook(String bookName, String user) {
        System.out.println("Book issued: " + bookName + " to " + user);
    }

    public void returnBook(String bookName, String user) {
        System.out.println("Book returned: " + bookName + " by " + user);
    }
}
