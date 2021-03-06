package Collections;

import java.util.*;
import org.apache.log4j.Logger;

public class UniqueWordVocabulary {

    static Logger logger = Logger.getLogger(UniqueWordVocabulary.class);
    Set<Vocabulary> text = new HashSet<>();

    public Set<Vocabulary> addWord() {

        text.add(new Vocabulary("apple"));
        text.add(new Vocabulary("kiwi"));
        text.add(new Vocabulary("melon"));
        text.add(new Vocabulary("apple"));
        text.add(new Vocabulary("banana"));
        text.add(new Vocabulary(""));
        for(Vocabulary a: text){
            if(a.getWord()=="") text.remove(a);
        }
        logger.info(text.toString());
        logger.info("Count of text: " + text.size());
        return text;
    }

    public Set<Vocabulary> getWordsCount() {
        text.add(new Vocabulary("apple"));
        text.add(new Vocabulary("kiwi"));
        text.add(new Vocabulary("melon"));
        text.add(new Vocabulary("apple"));
        text.add(new Vocabulary("banana"));
        logger.info("Unique words: " + text);
        logger.info("Count of uniques: " + text.size());
        return text;
    }

    public Set<Vocabulary> printVocabulary() {
        text.add(new Vocabulary("apple"));
        text.add(new Vocabulary("kiwi"));
        text.add(new Vocabulary("melon"));
        text.add(new Vocabulary("banana"));
        logger.info(text);
        return text;
    }
}
