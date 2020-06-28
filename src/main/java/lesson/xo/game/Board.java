package lesson.xo.game;

/**
 * игральная доска
 */
public class Board {
    private final int SIZE = 5;
    private final int winCount = 4;
    private final String EMPTY_SPACE = "_";


    public int getSize() {
        return SIZE;
    }

    public String getEMPTY_SPACE() {
        return EMPTY_SPACE;
    }

    /*
        |_||_||_|
        |_||_||_|
        |_||_||_|
         */


    public String[][] getGameField() {
        return gameField;
    }

    private String[][] gameField = new String[SIZE][SIZE];

    public Board() {
        init();
    }


    private boolean isCellEmpty(int row, int column) {
        return gameField[row][column].charAt(0) == EMPTY_SPACE.charAt(0);
    }

    public boolean getIsCellEmpty(int row, int column) {
        return isCellEmpty(row, column);
    }

    private void init() {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < gameField[0].length; j++) {
                gameField[i][j] = EMPTY_SPACE;
            }
        }
    }


    public void setGameFieldValue(int row, int column, String value) {
        gameField[row][column] = value;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < gameField[0].length; i++) {
            for (int j = 0; j < gameField[0].length; j++) {

                sb.append("|").append(gameField[i][j]).append("|");
            }

            sb.append("\n");
        }


        return sb.toString();
    }

    private boolean isMapFull() {
        boolean result = true;
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                if (gameField[i][j].charAt(0) == '_') {
                    result = false;
                }
            }

        }


        return result;
    }

    public boolean getIsMapFull() {
        return isMapFull();
    }

    private boolean isWin(String playerSymbol) {


        int hor, ver;
        for (int i = 0; i < SIZE; i++) {
            hor = 0;
            ver = 0;
            for (int j = 0; j < SIZE; j++) {
                if (gameField[i][j].equals(playerSymbol)) {
                    hor++;
                } else {
                    if (hor < 4) {
                        hor = 0;
                    }
                }

                if (gameField[j][i].equals(playerSymbol)) {
                    ver++;
                } else {
                    if (ver < 4) {
                        ver = 0;
                    }
                }
                if (hor == winCount || ver == winCount) {
                    return true;
                }

            }

        }

        int result = 0;
        //главная диагональ
        //слева навправо
        result = checkCentralDiagonal(playerSymbol, true);
        if (result == winCount) {
            return true;
        }
        result = checkCentralDiagonal(playerSymbol, false);
        if (result == winCount) {
            return true;
        }

        //нижняя
        //слева направо
        result = checkBottomDiagonal(playerSymbol, true);
        if (result == winCount) {
            return true;
        }

        //справа налево
        result = checkBottomDiagonal(playerSymbol, false);
        if (result == winCount) {
            return true;
        }

        //верхняя
        result = checkUpperDiagonal(playerSymbol, true);
        if (result == winCount) {
            return true;
        }
        result = checkUpperDiagonal(playerSymbol, false);
        if (result == winCount) {
            return true;
        }
        return false;

    }

    public boolean getIsWin(String playerSymbol) {
        return isWin(playerSymbol);
    }

    public int isWin(int i, int j, String playerSymbol, int currentCount) {
        if (gameField[i][j].equals(playerSymbol)) {
            currentCount++;

        } else {

            if (currentCount < 4) {
                currentCount = 0;
            }

        }
        return currentCount;
    }


    public int checkCentralDiagonal(String playerSymbol, boolean direction) {
        int result = 0;
        for (int i = 0; i < SIZE; i++) {
            int j;
            //слева направо
            if (direction) {
                j = i;
            } else {
                j = SIZE - i - 1;
            }
            result = isWin(i, j, playerSymbol, result);
            if(result>=winCount){
                return result;
            }
        }
        return result;
    }

    public int checkBottomDiagonal(String playerSymbol, boolean direction) {
        int result = 0;
        for (int i = 1; i < SIZE; i++) {
            int j;
            //слева направо
            if (direction) {
                j = i - 1;
            } else {
                j = SIZE - i;
            }
            result = isWin(i, j, playerSymbol, result);
            if(result>=winCount){
                return result;
            }
        }
        return result;
    }

    public int checkUpperDiagonal(String playerSymbol, boolean direction) {
        int result = 0;
        for (int i = 0; i < SIZE; i++) {
            int j;

            //слева направо
            if (direction) {
                j = i + 1;
            } else {
                j = SIZE - i - 2;
            }
            if (j <= 4 && j >= 0) {
                result = isWin(i, j, playerSymbol, result);
                if(result>=winCount){
                    return result;
                }
            }
        }
        return result;
    }

}
