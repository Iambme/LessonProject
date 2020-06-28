package lesson.xo.game;

import java.util.Random;
import java.util.Scanner;

public class HumanPlayer extends Player {

    private Scanner scn = new Scanner(System.in);

    private int row;
    private int column;

    public HumanPlayer(Board board) {
        super(board);
    }

    /**
     * заставляет противника пропустить ход
     *
     * @return true, если пропускает
     */
    private boolean skipOpponentHod() {
        Random rnd = new Random();
        int val = rnd.nextInt(11);
        if (val > 3 && val < 8) {
            return true;
        }
        return false;
    }

    public boolean getSkipOpponentHod() {
        return skipOpponentHod();
    }

    private void backInTime() {
        System.out.println("вы вернулись назад во времени");
        board.setGameFieldValue(row, column, "_");
    }
    public void getBackInTime(){
        backInTime();
    }

    @Override
    protected void makeHod(String value) {
        do {

            System.out.println("Введите строку");
            row = scn.nextInt();

            System.out.println("Введите столбец");
            column = scn.nextInt();
        }

        while (!isCellValid(row, column));


        board.setGameFieldValue(row, column, value);

    }


}
