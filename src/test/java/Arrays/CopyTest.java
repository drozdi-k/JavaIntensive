package Arrays;

import org.junit.Assert;
import java.util.Arrays;
import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.*;

public class CopyTest {

    Logger logger = Logger.getLogger(CopyTest.class);

    @Test
    public void copyInRange() {
        int[] in = {1,2,3,4,5,6,8,0};
        int[] expected = {2, 3, 4, 5};
        int leftBound = 2;
        int rightBound = 5;
        Assert.assertArrayEquals(expected, Copy.copyInRange(in, leftBound,rightBound));
        logger.info(Arrays.toString(Copy.copyInRange(in, leftBound,rightBound)));
    }
}