package cn.ac.iscas.openjdk;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for lshr
 * @author Xiang Zhang
 * @version 1.0
 */
public class TestLshr {
    /**
     * Logical shift right long.
     * By the way, the correct result of examples in the following are 250 and -250.
     */
    @Test
    public void testLshr() {
        long c = 1000L;
        long d = -1000L;
        long a=2L;
        long b1=c>>a;
        long b2=d>>a;
        System.out.println(b1);
        System.out.println(b2);

        Assert.assertTrue("test lshr error", b1 == 250);
        Assert.assertTrue("test lshr error", b2 == -250);
    }
}