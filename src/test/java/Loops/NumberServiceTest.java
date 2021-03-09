package Loops;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberServiceTest {

    @Test
    public void rangeSum() {
        int start = 3;
        int finish = 12;
        if(start > finish){
            start+=finish;
            finish=start-finish;
            start-=finish;
        }
        assertEquals(75,NumberService.rangeSum(start,finish));
        assertEquals(5, NumberService.rangeEvenCount(start,finish));
    }
}