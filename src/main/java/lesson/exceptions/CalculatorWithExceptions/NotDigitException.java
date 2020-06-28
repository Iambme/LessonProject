package lesson.exceptions.CalculatorWithExceptions;

public class NotDigitException extends Exception {
    public NotDigitException(String text) {
        super(text);
    }
}
