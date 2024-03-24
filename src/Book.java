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
}
