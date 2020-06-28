package lesson.xo.game;

public abstract class Player {
    protected Board board;

    public Player(Board board) {
        this.board = board;
    }

    protected abstract void makeHod(String value);

    protected boolean isCellValid(int row, int column) {
        boolean result = true;
        if (row < 0 || row >= board.getSize() || column < 0 || column >= board.getSize()) {
            System.out.println("Выход за пределы игрового поля, повторите ввод");
            result = false;
        } else if (!board.getIsCellEmpty(row, column)) {
            System.out.println("Клетка занята, выберите другую клетку");
            result = false;
        }

        return result;

    }
}
