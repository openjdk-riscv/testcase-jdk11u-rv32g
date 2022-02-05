package cn.ac.iscas.openjdk;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for lrem
 * @author Xiang Zhang
 * @version 1.0
 */
public class TestLrem {
    /**
     * 
     * @param dividend
     * @param divisor
     * @return The value of dividend/divisor. By the way, the correct result of examples in the following is 0.
     */
    public static long lrem(long dividend, long divisor){
        return dividend%divisor;
    }

    @Test
    public void testLrem() {
        System.out.println(lrem(100000000000L,100000000L));
        final long lrem = lrem(100000000000L, 100000000L);

        Assert.assertTrue(lrem == 0);
    }
}