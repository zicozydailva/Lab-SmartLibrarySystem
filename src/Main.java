import controller.BorrowController;
import model.Book;
import model.UserAccount;

public class Main {
    public static void main(String[] args) {
        BorrowController controller = new BorrowController();

        Book book = new Book("1", "Java Basics", "John Doe", 2023, "Programming");

        UserAccount user1 = new UserAccount("U1", "Alice");
        UserAccount user2 = new UserAccount("U2", "Bob");

        controller.borrowItem(user1, book); // Alice borrows
        controller.borrowItem(user2, book); // Bob goes to queue

        controller.returnItem(user1, book); // Should auto assign to Bob
    }
}