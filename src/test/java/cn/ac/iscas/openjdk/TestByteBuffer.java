package cn.ac.iscas.openjdk;

import java.nio.ByteBuffer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test allocate direct memory.
 */
public class TestByteBuffer {

    @Test
    public void testByteBufferSize() {

        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(8192);

        System.out.println(byteBuffer.capacity());
        Assert.assertTrue(byteBuffer.capacity() == 8192);
    }
}
