/**
 * Test case for convert between long and float/double
 * @author Xiang Zhang
 * @version 1.0
 */
public class TestConvertIFD {
        /**
     * Convert between int and float/double
     * By the way, the correct result of examples in the following is:
     *
     * test l2i in: -64424509696 out: -256
     * test f2i in: -64424509696 out: -2147483648
     * test d2i in: -6.4424509E10 out: -2147483648
     * test i2l in: 10 out: 10
     * test i2d in: 10 out: 10.0
     * test i2f in: 10 out: 10.0
     */
    public static void main(String[] args) {
        long a = 0xFFFFFFF0FFFFFF00L;
        float b = -64424509696F;
        double c = -64424509696D;
        int d=10;


        System.out.println("test l2i in: "+a+" out: "+ (int)a);
        System.out.println("test f2i in: "+b+" out: "+ (int)b);
        System.out.println("test d2i in: "+c+" out: "+ (int)c);
        System.out.println("test i2l in: "+d+" out: "+ (long)d);
        System.out.println("test i2d in: "+d+" out: "+ (double)d);
        System.out.println("test i2f in: "+d+" out: "+ (float)d);

    }
}