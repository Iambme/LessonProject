package homework.concurrency.ex9.exceptions;

public class NoFreeSpaceException extends RuntimeException {
    public NoFreeSpaceException(String message) {
        super(message);
    }
}