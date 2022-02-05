package cn.ac.iscas.openjdk;

import java.util.Enumeration;
import java.util.Properties;
import org.junit.Test;

public class TestPrintSystemProperties {

    @Test
    public void testPrintSystemProperties() {
        final Properties properties = System.getProperties();
        final Enumeration<Object> keys = properties.keys();
        while (keys.hasMoreElements()) {
            final Object key = keys.nextElement();
            final Object value = properties.get(key);
            System.out.println(key +": "+value);
        }
    }
}
