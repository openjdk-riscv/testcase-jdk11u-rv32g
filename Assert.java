public class Assert {

    public static void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new AssertException(message);
        }
    }

    public static <T> T requireNonNull(T object, String message) {
        if (object == null) {
            throw new AssertException(message);
        }
        return object;
    }

    public static boolean isEmpty(Object o) {
        return o == null;
    }

}
