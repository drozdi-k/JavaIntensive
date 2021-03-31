package ObjectsInMemory;

import org.junit.Test;
import org.apache.log4j.Logger;
import static org.junit.Assert.*;

public class BookTest {

    static Logger logger = Logger.getLogger(BookTest.class);

    @Test
    public void test(){
        var book = new Book();
        var book1 = new Book("Rowling","Harry Potter and the Goblet of Fire",523);
        book.setAuthor("Rowling");
        book.setName("Harry Potter and the Prisoner of Azkaban");
        book.setNumberOfPages(413);
        assertEquals("Rowling",book.getAuthor());
        assertEquals("Harry Potter and the Prisoner of Azkaban",book.getName());
        assertEquals(413,book.getNumberOfPages());
        logger.info(book.toString());
        assertTrue(book.getAuthor().equals(book1.getAuthor()));
    }

}