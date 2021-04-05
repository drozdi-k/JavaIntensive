package codewars;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrackThePINTest {
    @Test
    public void simple_test() {
        assertEquals("Should work with simple PIN", "12345", CrackThePIN.crack("827ccb0eea8a706c4c34a16891f84e7b"));
    }

    @Test
    public void harder_test() {
        assertEquals("Should work with harder PIN", "00078", CrackThePIN.crack("86aa400b65433b608a9db30070ec60cd"));
    }
}

