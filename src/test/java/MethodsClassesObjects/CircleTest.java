package MethodsClassesObjects;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void calculateArea() {
        var circle = new Circle();
        circle.setRadius(4);
        assertEquals(50.24,circle.calculateArea(),0.01);
    }
}