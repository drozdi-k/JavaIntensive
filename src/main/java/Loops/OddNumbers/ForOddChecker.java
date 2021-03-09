package Loops.OddNumbers;

import org.apache.log4j.Logger;

public class ForOddChecker { //нечетные числа в диапазоне от 0 до 50 включительно

    static Logger logger = Logger.getLogger(ForOddChecker.class);

    public static void main(String[] args) {
        for(int i = 0; i<=50;i++){
            if(i%2!=0) logger.info(i);
        }
    }
}
