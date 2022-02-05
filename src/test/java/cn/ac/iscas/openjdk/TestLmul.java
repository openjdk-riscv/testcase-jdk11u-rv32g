package cn.ac.iscas.openjdk;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for lmul
 * @author Xiang Zhang
 * @version 1.0
 */

public class TestLmul {
    /**
     * @return By the way, the correct result of examples in the following is 10000.
     */
    public static long lmul(long m1, long m2){
        return m1*m2;
    }

    @Test
    public void testLmul() {
        System.out.println(lmul(100L,100L));
        Assert.assertTrue(lmul(100L, 100L) == 10000);
    }
}