import java.util.ArrayList;
import java.util.List;

class CollectionImpl implements Collection {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    //method to add book
    public void addBook(Book book) {
        books.add(book);
    }
// method to search book on collection
    public Book searchBook(String title, String isbn) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.getISBN().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
//method to list books on collection
    public List<Book> listBooks() {
        return books;
    }
    //method to list users
    public List<User> listUsers() {
        return users;
    }

//method to search and print the status of the book
    public void searchAndPrintBook(String title, String isbn) {
        System.out.println("\nSearching for a book:");
        Book foundBook = searchBook(title, isbn);
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook.getTitle());
        } else {
            System.out.println("Book not found.");
        }
    }
}
