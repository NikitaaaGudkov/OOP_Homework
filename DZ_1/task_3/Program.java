package DZ_1.task_3;

public class Program {
    public static void main(String[] args) {
        Book book1 = new Book("Название_1", "Автор_1", true);
        Book book2 = new Book("Название_2", "Автор_2", true);
        Book book3 = new Book("Название_3", "Автор_1", false);
        Book book4 = new Book("Название_4", "Автор_4", true);
        Book book5 = new Book("Название_5", "Автор_1", true);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        library.displayAvailableBooks();

        library.removeBook(book3);

        library.searchByAuthor("Автор_1");
    }
}
