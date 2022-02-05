package cn.ac.iscase.openjdk;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test array copy.
 */
public class TestArrayCopy {

    @Test
    public void testArrayCopy() {

        String[] aaa =  new String[]{"aa","bb","cc","dd"};
        final String[] strings = Arrays.copyOf(aaa, 2);
        for (String str: strings) {
            System.out.println(str);
        }
        Assert.assertTrue(strings.length == 2);
    }
}
