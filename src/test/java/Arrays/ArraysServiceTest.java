package Arrays;

import java.util.Arrays;
import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;

public class ArraysServiceTest {
    Logger logger = Logger.getLogger(ArraysServiceTest.class);

    @Test
    public void create() {
        int size = 10;
        int[] array = ArraysService.create(size);
        assertEquals(10, ArraysService.create(size).length);
    }

    @Test
    public void fillRandomly() {
        ArraysService arrayService = new ArraysService();
        int[] array = new int[5];
        arrayService.fillRandomly(array);
        assertNotEquals(0, array[0] + array[1]);
    }

    @Test
    public void printArray() {
        int[] array = {3,6,8,6,4,5,0,7,9};
        ArraysService.printArray(array);
        assertEquals(9, array.length);
    }

    @Test
    public void sum() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(36, ArraysService.sum(array));
    }

    @Test
    public void avg() {
        int[] array = {1, 2, 3, 4};
        assertEquals(2.5, ArraysService.avg(array), 0.0001);
        assertNotEquals(0, array[0] + array[1]);
    }

    @Test
    public void sort() {
        int[] array = {1,9,2,8,3,7,4,6,5};
        int[] expected = {1,2,3,4,5,6,7,8,9};
        Assert.assertArrayEquals(expected, ArraysService.sort(array));
        logger.info("sorted array " + Arrays.toString(array));
    }

    @Test
    public void swap() {
        int[] array = {1,3,5,7,9,11};
        int[] expected = {11,9,7,5,3,1};
        Assert.assertArrayEquals(expected, ArraysService.swap(array));
        logger.info("swap array " + Arrays.toString(array));
    }
}