package homework.concurrency.ex9.exceptions;

public class NoExistingSmsException extends RuntimeException {
    public NoExistingSmsException(String message) {
        super(message);
    }
}