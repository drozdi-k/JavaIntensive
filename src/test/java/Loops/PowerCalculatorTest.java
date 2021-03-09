package Loops;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerCalculatorTest {

    @Test
    public void power() {
        int number = 2;
        int pow = 5;
        assertEquals(32,PowerCalculator.power(number,pow));
    }
}