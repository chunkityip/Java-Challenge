package Exception.CustomException;

public class CustomExceptionWithCauseAnswer extends Exception {
    public CustomExceptionWithCauseAnswer (String message , Throwable cause) {
        super(message , cause);
    }
}
