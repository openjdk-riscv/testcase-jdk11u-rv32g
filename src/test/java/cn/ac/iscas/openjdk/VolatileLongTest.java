package cn.ac.iscas.openjdk;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.junit.Test;

public class VolatileLongTest {
    static final long timeout = 1000;
    static volatile boolean stop = false;
    static volatile boolean has_exception = false;

    class MyThread extends Thread {
        volatile long myLong = 0;
        MyThread peer;
        public synchronized void run() {
            long startTime = System.currentTimeMillis();
            while (true) {
                for (long i = 0; i < 1024; i++ ) {
                    myLong = (i << 32) | i;
                    long peerLong = peer.myLong;
                    if ((peerLong >> 32) != (peerLong & 0xFFFF)) {
                        System.out.println("value not consistent: " + Long.toHexString(peerLong));
                        has_exception = true;
                        stop = true;
                        break;
                    }
                }
                if (System.currentTimeMillis() - startTime >= timeout) { stop = true; }
                if (stop) { return; }
            }
        }
    }

    @Test
    public void testVolatileLong() {
        new VolatileLongTest().test();
    }    

    void test() {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.peer = thread2;
        thread2.peer = thread1;
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
            while (true != stop) {
                TimeUnit.SECONDS.sleep(1);
            }
            if (has_exception) {
                Assert.assertTrue("VolatileLongTest test run failed.", true);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}