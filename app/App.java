package org.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library();
        Patron patron1 = new Patron("Papah", "P001");
        Patron patron2 = new Patron("Kweku", "P002");
        Patron patron3 = new Patron("Okae", "P003");


        // Add books
        Book book1 = new Book("Training Your Dragon", "Astrid Van Helsing", "10812947");
        Book book2 = new Book("How To Be A Fuckboy", "Stan Lee", "22033299");
        library.addBook(book1);
        library.addBook(book2);

        // List available books
        library.listAvailableBooks();

        // Checkout a book
        library.checkoutBook("10812947", patron1);

        // Attempt to checkout the same book
        library.checkoutBook("10812947", patron2);

        // List available books after checkout
        library.listAvailableBooks();

        // Return a book
        library.returnBook("10812947", patron1);

        // List available books after return
        library.listAvailableBooks();

        // Checkout another book
        library.checkoutBook("22033299", patron3);

        // List available books after checkout
        library.listAvailableBooks();
    }
}
