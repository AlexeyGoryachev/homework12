public class Book {
    private String bookTitle;
    private Author authorsName;
    private int yearOfPublishing;

    public Book(String bookTitle, Author authorsName, int yearOfPublishing) {
        this.authorsName = authorsName;
        this.bookTitle = bookTitle;
        this.yearOfPublishing = yearOfPublishing;
    }

    public Author getAuthorsName() {
        return this.authorsName;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()){
            return false;
        }
        Book book1 = (Book) other;
        return bookTitle.equals(book1.bookTitle);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorsName);
    }
}
