package Collections;
import org.apache.log4j.Logger;
import java.util.LinkedList;
import java.util.List;

public class Library {

    private List<Book> library;

    @Override
    public String toString() {
        return "Library{" +
                "library=" + library +
                '}';
    }

    public Library(List<Book> library) {
        this.library = library;
    }

    Logger logger = Logger.getLogger(Library.class);

    public List<Book> addBook(String author, String name) {
        library.add(new Book(author, name));
        return library;
    }

    public List<Book> deleteBook(Book book){
                if (book.getName() != null) {
                    library.remove(book);
                }
        return library;
    }

    public Book findByName(String name){
        Book bookByName = null;
        for (Book book : library) {
            if (book.getName().toLowerCase().contains(name.toLowerCase())) {
                bookByName = book;
                break;
            }
        }
        if (bookByName == null) {
            return null;
        } else {
            logger.info(bookByName);
            return bookByName;
        }
    }

    public List<Book> findByAuthor(String author){
        List<Book> find = new LinkedList<>();
        for (Book book: library) {

            if (book.getAuthor().toLowerCase().equals(author.toLowerCase())
                    && !author.equals("")) {
                find.add(book);
            }
        }
        logger.info(find);
        return find;
    }
}
