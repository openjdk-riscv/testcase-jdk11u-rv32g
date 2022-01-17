import util.Assert;

public class TestArrayOverflow {
    public static void main(String[] args) {
        try {
            long longArray[] = new long[2];
            System.out.println(longArray[3]);
        } catch (Exception e) {
            boolean ex  = e instanceof ArrayIndexOutOfBoundsException;
            Assert.isTrue(ex,"test array overflow");
        }
    }
}
