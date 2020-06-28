package lesson.xo.game;

import java.util.Random;

public class ComputerKiller extends Player {
    String opponentValue = null;
    public ComputerKiller(Board board) {
        super(board);
    }

    @Override
    protected void makeHod(String value) {

        int row;
        int column;
        int count = 0;
        System.out.println("Ход Компьютера убийцы:");

        if(value.equals(Game.X)){
            opponentValue = Game.O;
        }else{
            opponentValue = Game.X;
        }

        if(!isMapEmpty()) {
            do {
                Random rnd = new Random();
                row = rnd.nextInt(board.getSize());
                column = rnd.nextInt(board.getSize());

            }
            while (!isFoundOpponentCell(row, column));
        }


        do {
            Random rnd = new Random();
            row = rnd.nextInt(board.getSize());
            column = rnd.nextInt(board.getSize());
        }
        while (!isCellValid(row, column));
        board.setGameFieldValue(row, column, value);
    }


    private boolean isFoundOpponentCell(int row, int column) {
        boolean result = false;
        Random rnd = new Random();
        int val = rnd.nextInt(11);

        if (board.getGameField()[row][column].charAt(0) == opponentValue.charAt(0)) {

            if (val > 3 && val < 9) {
                board.setGameFieldValue(row, column, "_");
                System.out.println("Компьютер убийца усмехается над вами и превращает клетку " + row + " " + column + " в пустую");
            }
            result = true;
        }

        return result;
    }

    @Override
    protected boolean isCellValid(int row, int column) {
        boolean result = true;


        if (!(board.getGameField()[row][column].charAt(0) == '_')) {

            result = false;
        }

        return result;

    }

    private boolean isMapEmpty(){
        for (int i = 0; i < board.getGameField().length; i++) {
            for (int j = 0; j < board.getGameField().length; j++) {
                if (board.getGameField()[i][j].charAt(0) == opponentValue.charAt(0)) {
                   return false;
                }
            }

        }
        return true;
    }


}
