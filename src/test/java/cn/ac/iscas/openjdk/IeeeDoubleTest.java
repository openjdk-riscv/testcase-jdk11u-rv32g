package cn.ac.iscas.openjdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.Assert;
import org.junit.Test;

/**
 * IeeeDouble tests
 */
@SuppressWarnings({"unchecked", "javadoc"})
public class IeeeDoubleTest {

    static final Method doubleToLong;

    static private final long kInfinity = 0x7FF0000000000000L;

    static {
        try {
            final Class<?> IeeeDouble = Class.forName("cn.ac.iscas.openjdk.IeeeDoubleTest");
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

    // We assume that doubles and long have the same endianness.
    static long doubleToLong(final double d)   {
        System.out.println("before:"+ d);
        long l = Double.doubleToRawLongBits(d);
        System.out.println("after:"+ l);
        return l;
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