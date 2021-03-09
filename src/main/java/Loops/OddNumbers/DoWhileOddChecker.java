package Loops.OddNumbers;
import org.apache.log4j.Logger;
public class DoWhileOddChecker {

    static Logger logger = Logger.getLogger(DoWhileOddChecker.class);

    public static void main(String[] args) {
        int i = 0;
        do{
            if(i%2!=0) logger.info(i);
            i++;
        }while(i<=50);
    }
}
