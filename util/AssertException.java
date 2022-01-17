package util;

public class AssertException extends RuntimeException {

    public AssertException(String message) {
        super(message);
    }

    public AssertException(Throwable throwable) {
        super(throwable);
    }

    public AssertException(String message, Throwable throwable) {
        super(message, throwable);
    }
}