package ObjectsInMemory;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class TVTest {
    @Test
    public void test(){
        var tv = new TV(23,99,"HORIZONT", true);
        var tv1 = new TV(1,5,"Samsung",false);
        tv.nextChannel();
        assertEquals(24,tv.getCurrentChannel());
        tv.previousChannel();
        assertEquals(23,tv.getCurrentChannel());
        tv.moreVolume();
        assertEquals(100,tv.getCurrentVolume());
        Assertions.assertThrows(ExceptionTV.class, tv::moreVolume);
        tv.lessVolume();
        assertEquals(99,tv.getCurrentVolume());
        assertFalse(tv.getProducer().equals(tv1.getProducer()));
        assertTrue(tv.isOn());
    }
}