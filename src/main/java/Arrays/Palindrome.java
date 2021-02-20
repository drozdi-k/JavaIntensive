package Arrays;

import java.util.Arrays;
import org.apache.log4j.Logger;

public class Palindrome {

    static Logger logger = Logger.getLogger(Palindrome.class);

    static boolean isPalindrome(String text){

        text = text.replaceAll("\\W","");
        char[] array = text.toCharArray();
        char[] arrayReversed = text.toCharArray();
        int len = arrayReversed.length;

        for(int i=0,j=len-1; i < len/2;i++,j--){
            char temp = arrayReversed[i];
            arrayReversed[i] = arrayReversed[j];
            arrayReversed[j] = temp;
        }
        String s1 = String.valueOf(array);
        String s2 = String.valueOf(arrayReversed);
        logger.info("original: " + s1);
        logger.info("reversed: " + s2);
        return s1.equalsIgnoreCase(s2);
    }
}
