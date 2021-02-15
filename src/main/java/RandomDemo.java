import java.util.Random;

import org.apache.log4j.Logger;

public class RandomDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(RandomDemo.class);
        Random randomGenerator = new Random();
        int a = randomGenerator.nextInt(30);
        int b = randomGenerator.nextInt(15);
        int c = randomGenerator.nextInt(50);
        int result = RandomDemo.adding(a, b, c);
        logger.info("a = " + a + " b = " + b + " c = " + c + " total = " + RandomDemo.adding(a, b, c));
    }
    public static int adding(int a, int b, int c) {
        return a + b + c;
    }
}
