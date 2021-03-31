package ObjectsInMemory;

import org.junit.Test;

import static org.junit.Assert.*;

public class TVandTVControllerTest {
    @Test
    public void test(){
        var controller = new TVandTVController();
        var tv = new TV(1,5,"Samsung",false);
        controller.setTv(tv);
        controller.turnTvOnController();
        controller.moreVolumeController();
        controller.nextChannelController();
        assertTrue( tv.isOn());
        assertEquals(6,tv.getCurrentVolume());
        assertEquals(2,tv.getCurrentChannel());
    }
}