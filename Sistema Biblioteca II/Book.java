interface Book {
    String getTitle();
    String getAuthor();
    int getPublicationYear();
    String getPublisher();
    String getISBN();
    boolean isBorrowed();
    User getBorrower();
}
