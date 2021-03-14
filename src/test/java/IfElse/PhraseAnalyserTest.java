package IfElse;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhraseAnalyserTest {

    @Test
    public void analyse() {
        String text = "Make bla bla great again bla";
        assertEquals("It could be worse",PhraseAnalyser.analyse(text));
    }
}