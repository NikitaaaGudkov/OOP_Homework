package DZ_3.task_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Library implements Iterable<Book>{
    private ArrayList<Book> catalog;

    @Override
    public Iterator<Book> iterator() {
        Iterator<Book> it = new Iterator<Book>() {
            private int index = 0;

            public boolean hasNext() {
                return index < catalog.size();
            };

            public Book next() {
                return catalog.get(index++);
            };
        };
        return it;
    }

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
