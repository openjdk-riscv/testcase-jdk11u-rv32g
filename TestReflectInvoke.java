import java.lang.reflect.Method;

/**
 * Test reflect invoke
 */
public class TestReflectInvoke {
    public static void main(String[] args)  {
        try {
            TestReflectInvoke.test();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void test() {
        try {
            Method pid = TestReflectInvoke.class.getMethod("aa");
            final Long result = (Long)pid.invoke(null);
            System.out.println(result);
            Assert.isTrue(result==99999,"assert result error");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static long aa() {
        return 99999;
    }
}
