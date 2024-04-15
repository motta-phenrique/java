import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a collection
        Collection collection = new CollectionImpl();

        // Adding some books (just for example)
        Book book1 = new BookImpl("Book 1", "Author 1", 2022, "Publisher A", "ISBN001");
        Book book2 = new BookImpl("Book 2", "Author 2", 2020, "Publisher B", "ISBN002");
        collection.addBook(book1);
        collection.addBook(book2);

        // Listing the books in the collection
        System.out.println("Books in the collection:");
        List<Book> books = collection.listBooks();
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }

        // Searching for a book by title and ISBN
        ((CollectionImpl) collection).searchAndPrintBook("Book 3", "ISBN001");

        // Creating a user
        User user = new User("John", "john@example.com", "123 Street A");

        // Creating an instance of ManageBookImpl and lending a book to the user
        ManageBookImpl bookManager = new ManageBookImpl(collection);
        bookManager.lendBook(book1, user);

        // Trying to lend the same book again
        bookManager.lendBook(book2, user);

        // Returning the book
        bookManager.returnBook(book1, user);

        // Trying to lend the same book again
        bookManager.lendBook(book2, user);

        // Creating a collection report
        CollectionReport report = new CollectionReport(collection);

        // Generating and printing borrowed books report
        System.out.println("\nBorrowed Books Report:");
        report.borrowedBooksReport();

        // Generating and printing available books report
        System.out.println("\nAvailable Books Report:");
        report.availableBooksReport();

        // Generating and printing user books report
        System.out.println("\nUser Books Report:");
        report.userBooksReport();
    }
}
