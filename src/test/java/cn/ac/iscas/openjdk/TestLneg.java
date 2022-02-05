package cn.ac.iscas.openjdk;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for lneg
 * @author Xiang Zhang
 * @version 1.0
 */

public class TestLneg {
    /**
     * @return By the way, the correct result of examples in the following is -100.
     */
    public static long lneg(long m){
        return -m;
    }

    @Test
    public void testLneg() {
        System.out.println(lneg(100L));
        Assert.assertTrue("test lneg error", lneg(100L) == -100);
    }
}