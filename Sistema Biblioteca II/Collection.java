import java.util.List;
interface Collection {
    void addBook(Book book);
    Book searchBook(String title, String isbn);
    List<Book> listBooks();
    List<User> listUsers();
}
