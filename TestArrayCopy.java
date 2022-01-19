import java.util.Arrays;

/**
 * Test array copy.
 */
public class TestArrayCopy {
    public static void main(String[] args) {

        String[] aaa =  new String[]{"aa","bb","cc","dd"};
        final String[] strings = Arrays.copyOf(aaa, 2);
        for (String str: strings) {
            System.out.println(str);
        }
        Assert.isTrue(strings.length == 2, "test array copy error.");
    }
}
