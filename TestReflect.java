import java.lang.reflect.Method;

/**
 * Test reflect invoke method.
 */
public class TestReflect {
    public static void main(String[] args) throws Exception {

        Class<?> helloWorld = Class.forName("TestReflect");
        Method say = helloWorld.getMethod("say");
        say.invoke(null);
    }

    public static void say() {
        System.out.println("hello world");
    }
}
