import model.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("1", "Java Basics", "John Doe", 2023, "Programming");

        System.out.println(book.getTitle());
        System.out.println(book.getType());

        book.borrowItem();
        System.out.println("Available: " + book.isAvailable());
    }
}