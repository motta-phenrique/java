import java.util.List;
import java.util.ArrayList;
class ManageBookImpl implements ManageBook {
    private Collection collection;
    private List<User> usersWithBooks;

    public ManageBookImpl(Collection collection) {
        this.collection = collection;
        this.usersWithBooks = new ArrayList<>();
    }

    public void lendBook(Book book, User user) {
        // Check if the book is available in the collection
        if (collection.listBooks().contains(book)) {
            // Check if the user already has the book lent
            if (usersWithBooks.contains(user)) {
                System.out.println("User already has a book lent.");
            } else {
                // Add the book to the user
                usersWithBooks.add(user);
                System.out.println("Book lent successfully to user " + user.getName());
            }
        } else {
            System.out.println("The book is not available in the collection.");
        }
    }

    public void returnBook(Book book, User user) {
        // Check if the user has the book lent
        if (usersWithBooks.contains(user)) {
            // Remove the book from the user
            usersWithBooks.remove(user);
            System.out.println("Book returned successfully by user " + user.getName());
        } else {
            System.out.println("The user does not have this book lent.");
        }
    }
}
