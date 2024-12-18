package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Book> checkedOutBooks;

    public Library() {
        this.books = new ArrayList<>();
        this.checkedOutBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("org.example.Book added: " + book.getTitle());
    }

    public void listAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }

    public void checkoutBook(String isbn, Patron patron) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                checkedOutBooks.add(book);
                System.out.println(patron.getName() + " checked out: " + book.getTitle());
                return;
            }
        }
        System.out.println("org.example.Book with ISBN " + isbn + " not found or already checked out.");
    }

    public void returnBook(String isbn, Patron patron) {
        for (Book book : checkedOutBooks) {
            if (book.getIsbn().equals(isbn)) {
                checkedOutBooks.remove(book);
                books.add(book);
                System.out.println(patron.getName() + " returned: " + book.getTitle());
                return;
            }
        }
        System.out.println("org.example.Book with ISBN " + isbn + " was not checked out or was stolen.");
    }
}
