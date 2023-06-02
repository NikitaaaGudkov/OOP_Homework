package DZ_1.task_3;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalog;

    public Library() {
        this.catalog = new ArrayList<>();
    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void removeBook(Book book) {
        catalog.remove(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Доступные книги в библиотеке: ");
        for (Book book : catalog) {
            if(book.getAvailable() == true) {
                book.displayInfo();
            }
        }
    }

    public void searchByAuthor(String author) {
        System.out.println("Книги данного автора, находящиеся в каталоге библиотеки: ");
        for (Book book : catalog) {
            if(book.getAuthor() == author) {
                book.displayInfo();
            }
        }
    }
}
