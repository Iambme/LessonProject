package lesson.exceptions.ex3_customExceptions;

public class Main {
    public static void main(String[] args) {
        //Написать исключение, возникающее, когда польозватель пытается сходить в уже занятую ячейку
        try {
            isCellBusy();
        }catch(BusyBoardCellException e){
            System.out.println(e);
        }
        System.out.println("end programm");

    }

    public static boolean isCellBusy() throws BusyBoardCellException{
        throw new BusyBoardCellException("Клетка уже занята");
    }
}
