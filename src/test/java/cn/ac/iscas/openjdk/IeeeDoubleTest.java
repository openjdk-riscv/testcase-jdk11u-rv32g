package cn.ac.iscas.openjdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.Assert;
import org.junit.Test;

/**
 * IeeeDouble tests
 *
 * @test
 * @modules jdk.scripting.nashorn/jdk.nashorn.internal.runtime.doubleconv:open
 * @run testng jdk.nashorn.internal.runtime.doubleconv.test.IeeeDoubleTest
 */
@SuppressWarnings({"unchecked", "javadoc"})
public class IeeeDoubleTest {

    static final Method doubleToLong;

    static private final long kInfinity = 0x7FF0000000000000L;

    static {
        try {
            final Class<?> IeeeDouble = Class.forName("cn.ac.iscas.openjdk.DoubleTest");
            doubleToLong = method(IeeeDouble, "doubleToLong", double.class);
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static Method method(final Class<?> clazz, final String name, final Class<?>... params) throws NoSuchMethodException {
        final Method m = clazz.getDeclaredMethod(name, params);
        m.setAccessible(true);
        return m;
    }

    @Test
    public void test() throws InvocationTargetException, IllegalAccessException {
        final double v = Double.longBitsToDouble(kInfinity);
        System.out.println("v:"+v);
        System.out.println("doubleToLong:"+ doubleToLong.invoke(null, v));
        Assert.assertEquals(doubleToLong.invoke(null, v), 9218868437227405312L);
    }

    public static void main(String[] args) throws Exception{
        new IeeeDoubleTest().test();
    }
}