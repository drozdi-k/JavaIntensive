package Collections;

import org.apache.log4j.Logger;
import java.util.Map;

public class UniqueWordCounter {

    static Logger logger = Logger.getLogger(UniqueWordCounter.class);

    static int addWord(String word, Map<Integer, String> productsMap) {
        int wordCounter = 0;
        for (Map.Entry<Integer, String> entry : productsMap.entrySet()) {
            if (word.equals(entry.getValue())) wordCounter++;
        }
        return wordCounter;
    }

    static String getMostFrequentWord(Map<Integer, String> productsMap) {
        int max = 0;
        int wordCounter = 0;
        String frequentWord = null;
        int i = 0;

        for (Map.Entry<Integer, String> word : productsMap.entrySet()) {
            for (Map.Entry<Integer, String> entry : productsMap.entrySet()) {
                if (entry.getValue().equals(word.getValue()) && i != 0) {
                    wordCounter++;
                }
                i++;
            }
            if (wordCounter > max) {
                max = wordCounter;
                frequentWord = word.getValue();
            }
            i = 0;
            wordCounter = 0;
        }
        logger.info("The most frequent product: " + frequentWord);
        return frequentWord;
    }

    static void printWordsFrequency(Map<Integer, String> toysMap) {
        int wordCounter = 0;
        int i = 0;
        for (Map.Entry<Integer, String> word : toysMap.entrySet()) {
            for (Map.Entry<Integer, String> entry : toysMap.entrySet()) {
                if (entry.getValue().equals(word.getValue()) && i >= 0) {
                    wordCounter++;
                }
                i++;
            }
            logger.info("Key: " + word.getKey() + " Value: "
                    + word.getValue() + " Frequency: " + wordCounter);
            i = 0;
            wordCounter = 0;
        }
    }
}
