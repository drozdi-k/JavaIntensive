package MethodsClassesObjects;
import org.apache.log4j.Logger;
public class Encoder {

    static Logger logger = Logger.getLogger(Encoder.class);

    public static void main(String[] args) {
        encode((short)65);
        decode('X');
    }
    static void encode(short code){
        char symbol =(char) code;
        logger.info(symbol);
    }
    static void decode(char symbol){
        int code = (int) symbol;
        logger.info(code);
    }
}
