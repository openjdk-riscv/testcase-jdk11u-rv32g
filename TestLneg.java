/**
 * Test case for lneg
 * @author Xiang Zhang
 * @version 1.0
 */

public class TestLneg {
    /**
     * @return By the way, the correct result of examples in the following is -100.
     */
    public static long lneg(long m){
        return -m;
    }

    public static void main(String[] args) {
        System.out.println(lneg(100L));
    }
}