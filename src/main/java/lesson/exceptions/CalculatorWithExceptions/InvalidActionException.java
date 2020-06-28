package lesson.exceptions.CalculatorWithExceptions;

public class InvalidActionException extends Exception {
    public InvalidActionException(String message) {
        super(message);
    }
}
