package cn.ac.iscas.openjdk;

import java.lang.reflect.Method;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test reflect invoke method.
 */
public class TestReflectInvokeMethod {

    @Test
    public void testReflectInvokeMethod() throws Exception {
        Class<?> helloWorld = Class.forName(TestReflectInvokeMethod.class.getName());
        Method[] methods = helloWorld.getMethods();
        for (Method method : methods) {
            if (method.getName().contains("testPassLongArgs")) {
                method.invoke(new TestReflectInvokeMethod(), new Object[] {1, -13, 12});
            }
        }
    }

    @Test
    public void test() {
        try {
            Method pid = TestReflectInvokeMethod.class.getMethod("aa");
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

    public void testPassLongArgs(int base, long amount, int expected) {
        Assert.assertEquals(base, 1);
        Assert.assertEquals(amount, -13);
        Assert.assertEquals(expected, 12);
    }
}
