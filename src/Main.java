public class Main {
    public static void main(String[] args) {

        Library library = new Library();


        Book b1 = new Book("B001", "The Alchemist", "Paulo Coelho");
        Book b2 = new Book("B002", "1984", "George Orwell");
        library.addBook(b1);
        library.addBook(b2);

        User u1 = new Student("S001", "Jatin");
        User u2 = new Librarian("L001", "Rahul");
        library.addUser(u1);
        library.addUser(u2);

        u1.showRole();
        u2.showRole();

        library.showAllBooks();

        library.issueBook("B001");
        library.showAllBooks();

        library.returnBook("B001");
        library.showAllBooks();
    }
}
