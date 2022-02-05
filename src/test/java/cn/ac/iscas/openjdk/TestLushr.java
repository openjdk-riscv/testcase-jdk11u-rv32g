package cn.ac.iscas.openjdk;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for lush
 * @author Dingli Zhang
 * @version 1.0
 */
public class TestLushr {
    /**
     * Logical shift right long.
     * By the way, the correct result of examples in the following is 15.
     */
    @Test
    public void testLushr() {
        long a = -1L;
        int b = -68;
        System.out.println(a>>>b);
        Assert.assertTrue("test lushr error", a>>>b == 15);
    }
}