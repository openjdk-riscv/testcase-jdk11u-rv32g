/**
 * Test case for ldiv
 * @author Dingli Zhang
 * @version 1.0
 */
public class TestLdiv {
    /**
     * This method inputs two long int data and performs division.
     * @param dividend
     * @param divisor
     * @return The value of dividend/divisor. By the way, the correct result of examples in the following is 10.
     */
    public static long ldiv(long dividend, long divisor){
        return dividend/divisor;
    }

    public static void main(String[] args) {
        System.out.println(ldiv(100000000000L,10000000000L));
    }
}