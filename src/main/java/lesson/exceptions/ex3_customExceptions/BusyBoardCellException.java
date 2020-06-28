package lesson.exceptions.ex3_customExceptions;

//если наследуемся от Exception, BusyBoardCellException будет checked
//если наследуемся от RuntimeException, BusyBoardCellException будет unchecked
public class BusyBoardCellException extends Exception {
    public BusyBoardCellException(String text) {
        super(text);
    }

}
