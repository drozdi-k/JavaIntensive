package Collections;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class UniqueWordCounterTest {

    Map<Integer, String> productsMap = new HashMap<>();

    @Test
    public void addWord() {
        productsMap.put(5, "mango");
        productsMap.put(1, "mango");
        String word = "mango";
        assertEquals(2,UniqueWordCounter.addWord(word,productsMap));
    }

    @Test
    public void getMostFrequentWord() {
        productsMap.put(1, "milk");
        productsMap.put(2, "cheese");
        productsMap.put(3, "milk");
        productsMap.put(4, "cream");
        productsMap.put(5, "cheese");
        productsMap.put(6, "milk");
        assertEquals("milk", UniqueWordCounter.getMostFrequentWord(productsMap));
    }

    @Test
    public void printWordsFrequency() {
        productsMap.put(1, "ball");
        productsMap.put(2, "doll");
        productsMap.put(3, "ball");
        productsMap.put(4, "cubes");
        productsMap.put(5, "cubes");
        productsMap.put(6, "cubes");
        productsMap.put(7, "ball");
        productsMap.put(8, "cubes");
        UniqueWordCounter.printWordsFrequency(productsMap);
    }
}