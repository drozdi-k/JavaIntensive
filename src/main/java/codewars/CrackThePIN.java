package codewars;

import org.apache.log4j.Logger;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CrackThePIN {
    static Logger logger = Logger.getLogger(CrackThePIN.class);

    public static String getMd5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String crack(String hash) {
        String pin;
        for (int i = 0; i < 100000; i++) {
            pin = String.valueOf(i);
            while (pin.length() < 5) {
                pin = "0" + pin;
            }
            if (getMd5(pin).equals(hash)) return pin;
        }
        return null;
    }

    public static void main(String args[]) throws NoSuchAlgorithmException {
        String s = "12345";
        logger.info("Your PIN is: " + crack(getMd5(s)));
    }

}
