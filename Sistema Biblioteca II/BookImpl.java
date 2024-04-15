public class BookImpl implements Book {
    private String title;
    private String author;
    private int publicationYear;
    private String publisher;
    private String isbn;
    private boolean borrowed;
    private User borrower;

    public BookImpl(String title, String author, int publicationYear, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.isbn = isbn;
        this.borrowed = false;
        this.borrower = null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public User getBorrower() {
        return borrower;
    }

    public void borrowBook(User user) {
        if (!borrowed) {
            borrowed = true;
            borrower = user;
        }
    }

    public void returnBook() {
        if (borrowed) {
            borrowed = false;
            borrower = null;
        }
    }
}
