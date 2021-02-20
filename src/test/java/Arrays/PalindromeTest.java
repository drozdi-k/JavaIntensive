package Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void isPalindrome() {
       // String text = "Sp*el Le!ps";
        String text = "ma#dAm";
        assertEquals(true,Palindrome.isPalindrome(text));
    }
}