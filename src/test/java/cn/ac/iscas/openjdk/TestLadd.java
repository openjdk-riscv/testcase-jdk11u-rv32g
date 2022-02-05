package cn.ac.iscas.openjdk;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for add between long
 * @author Xiang Zhang
 * @version 1.0
 */

public class TestLadd {
    /**
     * @return By the way, the correct result of examples in the following is 200.
     */
    public static long ladd(long m1, long m2){
        return m1+m2;
    }

    @Test
    public void testLadd() {
        System.out.println(ladd(100L,100L));
        long result = ladd(100L, 100L);
        Assert.assertTrue(result == 200);
    }
}