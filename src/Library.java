import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user.getName());
    }

    public void showAllBooks() {
        System.out.println("\n--- All Books ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void issueBook(String bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                book.issueBook();
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void returnBook(String bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found!");
    }
}
