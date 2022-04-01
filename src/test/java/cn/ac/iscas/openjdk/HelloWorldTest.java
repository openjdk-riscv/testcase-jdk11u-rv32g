package cn.ac.iscas.openjdk;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for hello world
 * @author Ningning Shi
 * @version 1.0
 */
public class HelloWorldTest {
    /**
     * @return By the way, the correct result of examples in the following is "Hello World".
     */
    @Test
    public void testSayHelloWorld() {
        System.out.println("Hello World");
        Assert.assertEquals("hello world.","hello world.");
    }
}
