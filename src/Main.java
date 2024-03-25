public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Ivan", "Ivanov");
        System.out.println("Author - " + author1.getName() + " " + author1.getSurName());
        Book book1 = new Book("First Book", author1, 2000);
        System.out.println("book author - " + author1.getName() + " " + author1.getSurName());
        System.out.println("book title - " + "'" + book1.getBookTitle() + "'");
        System.out.println("the year of publishing - " + book1.getYearOfPublishing());
        Author author2 = new Author("Alla", "Alaya");
        System.out.println("Author - " + author2.getName() + " " + author2.getSurName());
        Book book2 = new Book("Second Book", author2, 2020);
        System.out.println("book author - " + author2.getName() + " " + author2.getSurName());
        System.out.println("book title - " + "'" + book2.getBookTitle() + "'");
        System.out.println("the year of publishing - " + book2.getYearOfPublishing());
    }
}