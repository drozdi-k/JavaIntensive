package ObjectsInMemory;
import org.apache.log4j.Logger;
public class Counter {
    static Logger logger = Logger.getLogger(Counter.class);

    private int value;
    private int step;

    public Counter() {
        this.value = 0;
        this.step = 1;
    }

    public void increment() {
        if(value+step <= 100) value = value + step;
        else logger.info("too much!");
    }

    public void decrement() {
        if(value-step >= 0) value = value - step;
        else logger.info("too low!");
    }

    public void reset() {
        setValue(new Counter().getValue());
        setStep(new Counter().getStep());
    }

    public void setValue(int value) {
        if(0<=value && value<=100) this.value=value;
        else logger.info("wrong value!");
    }

    public int getValue() {
        logger.info("value = "+ value);
       return value;
    }

    public void setStep(int step) {
        if(1<=step && step<=10) this.step=step;
        else logger.info("wrong step!");
    }

    public int getStep() {
        logger.info("step = "+ step);
        return step;
    }
}
