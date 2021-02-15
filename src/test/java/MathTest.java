import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import static org.junit.Assert.*;

public class MathTest{
    Logger logger = Logger.getLogger(MathTest.class);
    @Test
    public void subtraction() {
        int a = 18;
        int b = 7;
        assertEquals(11, Math.subtraction(a,b));
        logger.info("a - b = " + a + " - " + b + " = " + Math.subtraction(a,b));
    }

    @Test
    public void antiSubtraction() {
        int a = 18;
        int b = 7;
        logger.info("a - b = " + a + " - " + b + " = " + Math.subtraction(a,b));
        assertEquals(27, Math.subtraction(a,b));
    }

    @Test
    public void addition() {
        int a = 7;
        int b = 4;
        assertEquals(11,Math.addition(a,b));
        logger.info("a + b = " + a + " + " + b + " = " + Math.addition(a,b));

    }

    @Test
    public void antiAddition() {
        int a = 7;
        int b = 4;
        logger.info("a + b = " + a + " + " + b + " = " + Math.addition(a,b));
        assertEquals(27, Math.addition(a,b));
    }

    @Test
    public void division() {
        int a = 22;
        int b = 2;
        assertEquals(11,Math.division(a,b));
        logger.info("a / b = " + a + " / " + b + " = " + Math.division(a,b));
    }

    @Test
    public void antiDivision() {
        int a = 22;
        int b = 2;
        logger.info("a / b = " + a + " / " + b + " = " + Math.division(a,b));
        assertEquals(27, Math.division(a,b));
    }

    @Test
    public void multiplication() {
        int a = 5;
        int b = 2;
        assertEquals(10,Math.multiplication(a,b));
        logger.info("a * b = " + a + " * " + b + " = " + Math.multiplication(a,b));
    }

    @Test
    public void antiMultiplication() {
        int a = 22;
        int b = 2;
        logger.info("a * b = " + a + " * " + b + " = " + Math.multiplication(a,b));
        assertEquals(27, Math.multiplication(a,b));
    }
}