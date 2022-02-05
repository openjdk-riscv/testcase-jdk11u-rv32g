package cn.ac.iscase.openjdk;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for lshl
 * @author Xiang Zhang
 * @version 1.0
 */
public class TestLshl {
    /**
     * Logical shift left long.
     * By the way, the correct result of examples in the following are 4000 and -4000.
     */
    @Test
    public void testLshl() {
        long c = 1000L;
        long d = -1000L;
        long a=2L;
        long b1=c<<a;
        long b2=d<<a;
        System.out.println(b1);
        System.out.println(b2);

        Assert.assertTrue("test lshl error", b1 == 4000);
        Assert.assertTrue("test lshl error", b2 == -4000);
    }
}