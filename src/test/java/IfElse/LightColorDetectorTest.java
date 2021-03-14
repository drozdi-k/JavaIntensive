package IfElse;

import org.junit.Test;

import static org.junit.Assert.*;

public class LightColorDetectorTest {

    @Test
    public void detect() {
        int wavelength = 675;
        assertEquals("Красный (Red)",LightColorDetector.detect(wavelength));
    }
}