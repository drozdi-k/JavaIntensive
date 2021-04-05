package codewars;

import java.math.BigInteger;

public class EasyDiagonal {
    public static BigInteger diagonal(int n, int p) {
        if (n > p && p >= 0) {
            if (p == 0) return BigInteger.valueOf(n + 1);
            BigInteger sum = BigInteger.valueOf(1);
            BigInteger num = BigInteger.valueOf(1);
            for (int i = 1; i < n - p + 1; i++) {
                num = num.multiply(BigInteger.valueOf((p + i)));
                num = num.divide(BigInteger.valueOf(i));
                sum = sum.add(num);
            }
            return sum;
        } else {
            try {
                throw new Exception("Wrong parameters!");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return BigInteger.valueOf(0);
        }
    }
}
