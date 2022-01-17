import java.lang.reflect.Method;

public class Launcher {

    public static void main(String[] args) throws Exception {

        String[] testCase = new String[] {
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
            "TestLxor"
        };

        System.out.println("run test start...");
        for (String str : testCase) {
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
