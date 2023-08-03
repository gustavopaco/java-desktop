package main.java.com.pacoprojects.aula98.util.bigdecimal.bignumber;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Boot {
    public static void main(String[] args) {

        //---------------------------------------------------------------------------------------------------------------
        // BigDecimal

        double a = 0.03;
        double b = 0.04;

        double c = b - a;

        System.out.println(c);

        BigDecimal _a = new BigDecimal("0.03");
        BigDecimal _b = new BigDecimal("0.04");
        // Note: -
        BigDecimal _c = _b.subtract(_a);

        System.out.println(_c);

        BigDecimal bd1 = new BigDecimal("1234567890.0987654321");
        BigDecimal bd2 = new BigDecimal("987654321.9876543210");

        // Note: +
        System.out.println(bd1.add(bd2));
        // Note: *
        System.out.println(bd1.multiply(bd2));
        // Note: /
        System.out.println(bd1.divide(new BigDecimal(2)));

        //---------------------------------------------------------------------------------------------------------------
        // BigInteger

        BigInteger bi = new BigInteger("10000000000000000000000000");
        System.out.println(bi);
    }
}
