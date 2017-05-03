package dao.exception;

/**
 * Created by dima on 2.5.17.
 */
public class CustomGenericException extends Exception {
    public CustomGenericException() {
        super();
    }

    public CustomGenericException(String message) {
        super(message);
    }

    public CustomGenericException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomGenericException(Throwable cause) {
        super(cause);
    }

    protected CustomGenericException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
