package Loops.OddNumbers;
import org.apache.log4j.Logger;
public class WhileOddChecker {

    static Logger logger = Logger.getLogger(WhileOddChecker.class);

    public static void main(String[] args) {
        int i = 0;
        while (i<=50){
            if(i%2!=0) logger.info(i);
            i++;
        }
    }
}
