import util.Assert;

/**
 * Test case for lush
 * @author Dingli Zhang
 * @version 1.0
 */
public class TestLushr {
    /**
     * Logical shift right long.
     * By the way, the correct result of examples in the following is 15.
     */
    public static void main(String[] args) {
        long a = -1L;
        int b = -68;
        System.out.println(a>>>b);
        Assert.isTrue(a>>>b == 15, "test lushr error");
    }
}