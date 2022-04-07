package cn.ac.iscas.openjdk;

import org.junit.Assert;
import org.junit.Test;

public class DoubleTest {

    static private final long kInfinity = 0x7FF0000000000000L;

    // We assume that doubles and long have the same endianness.
    public static long doubleToLong(final double d)   { return Double.doubleToRawLongBits(d); }
    public static double longToDouble(final long d64) { return Double.longBitsToDouble(d64); }

    @Test
    public void doubleTest() {
        final double v = Double.longBitsToDouble(kInfinity);
        final long l = Double.doubleToRawLongBits(v);
        System.out.println(v);
        System.out.println(l);
        Assert.assertEquals(l, 9218868437227405312L);
    }

    public static void main(String[] args) {
        new DoubleTest().doubleTest();
    }
}
