import com.sun.tools.javac.Main;

/**
 * Test call javac.
 */
public class TestJavac {
    public static void main(String[] args) throws Exception {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Main.main(args);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
