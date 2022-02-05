package cn.ac.iscas.openjdk;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for lsub
 * @author Xiang Zhang
 * @version 1.0
 */

public class TestLsub {
    /**
     * @return By the way, the correct result of examples in the following is 900.
     */
    public static long lsub(long m1, long m2){
        return m1-m2;
    }

    @Test
    public void testLsub() {
        System.out.println(lsub(1000L,100L));
        Assert.assertTrue("test lsub error", lsub(1000L, 100L) == 900);
    }
}