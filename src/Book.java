import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null ||getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(authorsName, book.authorsName) && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(yearOfPublishing, book.yearOfPublishing);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorsName, bookTitle, yearOfPublishing);
    }
}
