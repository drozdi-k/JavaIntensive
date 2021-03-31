package ObjectsInMemory;

import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {
    @Test
    public void test(){
        var counter = new Counter();
        counter.getValue();
        counter.getStep();
        counter.increment();
        counter.getValue();
        counter.decrement();
        counter.getValue();
        counter.setStep(56);
        counter.setValue(-9);
        counter.setStep(3);
        counter.setValue(8);
        counter.getValue();
        counter.getStep();
        counter.reset();
    }

}