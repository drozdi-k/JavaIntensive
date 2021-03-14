package IfElse;

import org.junit.Test;

import static org.junit.Assert.*;

public class SignComparatorTest {

    @Test
    public void compare() {
        int number = 67;
        assertEquals("Number is positive", SignComparator.compare(number));
    }
}