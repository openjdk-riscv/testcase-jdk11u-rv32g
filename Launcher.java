import java.lang.reflect.Method;

/**
 * Test launcher
 */
public class Launcher {

    // notice we need add test case to testCase array.
    final static String[] TEST_CASE = new String[] {
        "HelloWorld",
        "TestArrayOverflow",
        "TestConvertIFD",
        "TestConvertLFD",
        "TestLadd",
        "TestLastore",
        "TestLdiv",
        "TestLmul",
        "TestLneg",
        "TestLrem",
        "TestLshl",
        "TestLshr",
        "TestLsub",
        "TestLushr",
        "TestLxor",
        "TestArrayCopy",
        "TestByteBuffer",
        "TestJavac",
        "TestReflect",
        "TestReflectInvoke"
    };

    public static void main(String[] args) throws Exception {
        System.out.println("run test start...");
        for (String str : TEST_CASE) {
            runTest(str);
        }
        System.out.println("success run all test...");
    }

    private static void runTest(String classStr) throws Exception {
        Class<?> clazz = Class.forName(classStr);
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if (method.getName().equals("main")) {
                method.invoke(null, (Object) new String[] {});
            }
        }
    }
}
