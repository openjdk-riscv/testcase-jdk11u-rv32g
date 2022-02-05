package cn.ac.iscase.openjdk;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for convert between long and float/double
 * @author Dingli Zhang
 * @version 1.0
 */
public class TestConvertLFD {
    /**
     * Convert between long and float/double
     * By the way, the correct result of examples in the following is:
     *
     * test l2f in: -64424509696 out: -6.4424509E10
     * test l2d in: -64424509696 out: -6.4424509696E10
     * test f2l in: -6.4424509E10 out: -64424509440
     * test d2l in: -6.4424509696E10 out: -64424509696
     */
    @Test
    public void testConvertLFD() {
        long a = 0xFFFFFFF0FFFFFF00L;
        float b = -64424509696F;
        double c = -64424509696D;

        System.out.println("test l2f in: "+a+" out: "+ (float)a );
        System.out.println("test l2d in: "+a+" out: "+ (double)a);
        System.out.println("test f2l in: "+b+" out: "+ (long)b);
        System.out.println("test d2l in: "+c+" out: "+ (long)c);

        Assert.assertTrue((float)a == -6.4424509E10F);
        Assert.assertTrue((double)a == -6.4424509696E10);
        Assert.assertTrue((long)b == -64424509440L);
        Assert.assertTrue((long)c == -64424509696L);
    }
}