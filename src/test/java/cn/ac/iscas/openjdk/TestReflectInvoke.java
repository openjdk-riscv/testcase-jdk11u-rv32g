package cn.ac.iscas.openjdk;

import java.lang.reflect.Method;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test reflect invoke
 */
public class TestReflectInvoke {

    @Test
    public void test() {
        try {
            Method pid = TestReflectInvoke.class.getMethod("aa");
            final Long result = (Long)pid.invoke(null);
            System.out.println(result);
            Assert.assertTrue("assert result error", result==99999);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static long aa() {
        return 99999;
    }
}
