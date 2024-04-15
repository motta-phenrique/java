import java.util.Collection; // Import the Collection interface
import java.util.List;
import java.util.ArrayList;

public class CollectionReport {
    private Collection<Book> collection;

    public CollectionReport(Collection<Book> collection) {
        this.collection = collection;
    }

    // Method to generate a report of borrowed books
    public void borrowedBooksReport() {
        List<Book> books = new ArrayList<>(collection); // Convert Collection to List
        System.out.println("Borrowed Books Report:");
        for (Book book : books) {
            if (book.isBorrowed() && book.getBorrower() != null) {
                System.out.println("Title: " + book.getTitle() + ", Borrower: " + book.getBorrower().getName());
            }
        }
    }

    // Method to generate a report of books available in the collection
    public void availableBooksReport() {
        List<Book> books = new ArrayList<>(collection); // Convert Collection to List
        System.out.println("Available Books Report:");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
            }
        }
    }

    // Method to generate a report of users and the books they borrowed
    public void userBooksReport() {
        // Assuming the Collection<Book> contains both books and users with borrowed books
        System.out.println("User Books Report:");
        for (Book item : collection) {
            if (item instanceof User) {
                User user = (User) item;
                System.out.println("User: " + user.getName());
                List<Book> borrowedBooks = user.getBorrowedBooks();
                if (!borrowedBooks.isEmpty()) {
                    System.out.println("Borrowed Books:");
                    for (Book book : borrowedBooks) {
                        System.out.println("- Title: " + book.getTitle() + ", Author: " + book.getAuthor());
                    }
                } else {
                    System.out.println("No books borrowed.");
                }
                System.out.println();
            }
        }
    }
}
