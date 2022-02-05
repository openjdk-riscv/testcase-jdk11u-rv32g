package cn.ac.iscas.openjdk;

import org.junit.Assert;
import org.junit.Test;

public class TestArrayOverflow {

    @Test
    public void testArrayOverflow() {
        try {
            long longArray[] = new long[2];
            System.out.println(longArray[3]);
        } catch (Exception e) {
            boolean ex  = e instanceof ArrayIndexOutOfBoundsException;
            Assert.assertTrue("test array overflow", ex);
        }
    }
}
