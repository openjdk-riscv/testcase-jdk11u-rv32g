package cn.ac.iscase.openjdk;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for xor between long
 *
 * @author Xiang Zhang
 * @version 1.0
 */

public class TestLxor {
    /**
     * @return By the way, the correct result of examples in the following is -2.
     */
    public static long lxor(long m1, long m2) {
        return m1 ^ m2;
    }

    @Test
    public void testLxor() {
        System.out.println(lxor(1L, -1L));
        Assert.assertTrue(lxor(1L, -1L) == -2);
    }
}