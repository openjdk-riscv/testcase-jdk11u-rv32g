/**
 * Test case for convert between long and float/double
 * @author Dingli Zhang
 * @version 1.0
 */
public class TestConvertLFD {
    /**
     * Convert between long and float/double
     * By the way, the correct result of examples in the following is:
     *
     * test l2f in: -64424509696 out: -6.4424509E10
     * test l2d in: -64424509696 out: -6.4424509696E10
     * test f2l in: -6.4424509E10 out: -64424509440
     * test d2l in: -6.4424509696E10 out: -64424509696
     */
    public static void main(String[] args) {
        long a = 0xFFFFFFF0FFFFFF00L;
        float b = -64424509696F;
        double c = -64424509696D;

        System.out.println("test l2f in: "+a+" out: "+ (float)a );
        System.out.println("test l2d in: "+a+" out: "+ (double)a);
        System.out.println("test f2l in: "+b+" out: "+ (long)b);
        System.out.println("test d2l in: "+c+" out: "+ (long)c);

        Assert.isTrue((float)a == -6.4424509E10F, "test l2f error");
        Assert.isTrue((double)a == -6.4424509696E10, "test l2d error");
        Assert.isTrue((long)b == -64424509440L, "test f2l error");
        Assert.isTrue((long)c == -64424509696L, "test d2l error");
    }
}