package lesson.xo.game;

import java.util.Random;

public class ComputerPlayer extends Player {

    public ComputerPlayer(Board board) {
        super(board);
    }

    @Override
    protected void makeHod(String value) {
        int row;
        int column;
        System.out.println("Ход компьютера:");
        do {
            Random rnd = new Random();
            row = rnd.nextInt(board.getSize());
            column = rnd.nextInt(board.getSize());
        }
        while (!isCellValid(row, column));
        board.setGameFieldValue(row, column, value);
    }

    @Override
    protected boolean isCellValid(int row, int column) {
        boolean result = true;


        if (!(board.getGameField()[row][column].charAt(0) == '_')) {

            result = false;
        }

        return result;

    }
}

