import java.nio.ByteBuffer;

/**
 * Test allocate direct memory.
 */
public class TestByteBuffer {
    public static void main(String[] args) {

        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(8192);

        System.out.println(byteBuffer.capacity());
        Assert.isTrue(byteBuffer.capacity() == 8192,"test byteBuffer error");
    }
}
