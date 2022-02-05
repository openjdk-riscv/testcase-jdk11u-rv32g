package cn.ac.iscase.openjdk;

import java.lang.reflect.Method;
import org.junit.Test;

/**
 * Test reflect invoke method.
 */
public class TestReflect {

    @Test
    public void testReflectInvokeMethod() throws Exception {
        Class<?> helloWorld = Class.forName(TestReflect.class.getName());
        Method say = helloWorld.getMethod("say");
        say.invoke(null);
    }

    public static void say() {
        System.out.println("hello world");
    }
}
