package cn.ac.iscas.openjdk;

import org.junit.Assert;
import org.junit.Test;

public class TestLastore {

    @Test
    public void testLastore() {
        long elements[] = new long[2];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = -1;
        }
        Assert.assertTrue(elements[1] == -1);
    }
}