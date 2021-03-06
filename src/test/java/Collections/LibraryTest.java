package Collections;

import org.junit.Test;
import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;

import static org.junit.Assert.*;

public class LibraryTest {

    private List<Book> books;
    Logger logger = Logger.getLogger(LibraryTest.class);

    public List<Book> initialization() {
        return books = new LinkedList<>(List.of(new Book("Conan Doyle", "Sherlock Holmes"),
                new Book("Conan Doyle", "The Lost World"),
                new Book("Osten", "Pride And Prejudice"),
                new Book("Rowling", "Harry Potter and the Goblet of Fire"),
                new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"),
                new Book("Rowling", "Harry Potter and the Half-blood Prince"),
                new Book("Dostoevsky", "Idiot")));
    }

    @Test
    public void addBook() {
        Library library = new Library(initialization());
        String author = "Dante";
        String name = "Inferno";
        assertEquals(8, library.addBook(author, name).size());
        logger.info(library.toString());
    }

    @Test
    public void deleteBook() {
        Library library = new Library(initialization());
        Book book = (books.get(2));
        assertEquals(6,library.deleteBook(book).size());
        logger.info(library.toString());
    }

    @Test
    public void findByName() {
        Library library = new Library(initialization());
        String name = "Idiot";
        assertEquals(books.get(6),library.findByName(name));
    }

    @Test
    public void findByAuthor() {
        Library library = new Library(initialization());
        String author = "Rowling";
        assertEquals(List.of(books.get(3),books.get(4),books.get(5)), library.findByAuthor(author));
    }
}