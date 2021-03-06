package Collections;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class UniqueWordVocabularyTest {

    UniqueWordVocabulary text = new UniqueWordVocabulary();

    @Test
    public void addWord() {
        assertEquals(4, text.addWord().size());
    }

    @Test
    public void printVocabulary() {
        assertEquals(4, text.printVocabulary().size());
    }

    @Test
    public void getWordsCount() {
        assertEquals(4, text.getWordsCount().size());
    }
}