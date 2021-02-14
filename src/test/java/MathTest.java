import org.junit.Test;

import junit.framework.TestCase;
import static org.junit.Assert.*;

public class MathTest extends TestCase{

    @Test
    public void subtraction() {
        int a = 18;
        int b = 7;
        assertEquals(11, Math.subtraction(a,b));
    }

    @Test
    public void addition() {
        int a = 7;
        int b = 4;
        assertEquals(11,Math.addition(a,b));
    }

    @Test
    public void division() {
        int a = 22;
        int b = 2;
        assertEquals(11,Math.division(a,b));
    }

    @Test
    public void multiplication() {
        int a = 5;
        int b = 2;
        assertEquals(10,Math.multiplication(a,b));
    }
}