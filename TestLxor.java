/**
 * Test case for xor between long
 * @author Xiang Zhang
 * @version 1.0
 */

public class TestLxor {
    /**
     * @return By the way, the correct result of examples in the following is -2.
     */
    public static long lxor(long m1, long m2){
        return m1^m2;
    }

    public static void main(String[] args) {
        System.out.println(lxor(1L,-1L));
    }
}