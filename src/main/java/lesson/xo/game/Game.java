package lesson.xo.game;

import java.util.Scanner;

public class Game {
    protected final static String X = "X";
    protected final static String O = "O";

    private void startGame() {
        Board board = new Board();


        System.out.println(board.toString());


        Scanner scn = new Scanner(System.in);
        System.out.println("Выберите режим");
        System.out.println("1. Человек vs Человек");
        System.out.println("2. Человек vs Компьютер");
        System.out.println("3. Компьютер vs Компьютер");
        System.out.println("4. Человек vs Компьютер убийца");
        System.out.println("5. Компьютер vs Компьютер убийца");
        System.out.println("6. Компьютер убийца vs Компьютер убийца");

        int userInput = scn.nextInt();
        Player player1 = null;
        Player player2 = null;
        switch (userInput) {
            case 1: {
                player1 = new HumanPlayer(board);
                player2 = new HumanPlayer(board);
                break;
            }
            case 2: {
                player1 = new HumanPlayer(board);
                player2 = new ComputerPlayer(board);
                break;
            }
            case 3: {
                player1 = new ComputerPlayer(board);
                player2 = new ComputerPlayer(board);
                break;
            }
            case 4: {
                player1 = new HumanPlayer(board);
                player2 = new ComputerKiller(board);
                break;
            }
            case 5: {
                player1 = new ComputerPlayer(board);
                player2 = new ComputerKiller(board);
                break;
            }
            case 6: {
                player1 = new ComputerKiller(board);
                player2 = new ComputerKiller(board);
                break;
            }

        }


        int count = 0;
        String currentValue = "";
        Player currentPlayer = null;
        while (true) {
            if (count % 2 == 0) {
                currentValue = X;
                currentPlayer = player1;
            } else {
                currentValue = O;
                currentPlayer = player2;
            }
            if (!isEndGame(board, currentValue)) {
                currentPlayer.makeHod(currentValue);
                System.out.println(board.toString());


            }
            if (isEndGame(board, currentValue)) {
                break;
            }
            count = userHumanSpells(scn, count, currentPlayer, board);
            count++;

        }
    }
    public void getStartGame(){
        startGame();
    }

    /**
     * Использует спосробности человека
     *
     * @param scn
     * @param count
     * @param currentPlayer
     * @return
     */

    private static int userHumanSpells(Scanner scn, int count, Player currentPlayer, Board board) {
        int userInput;
        if (currentPlayer instanceof HumanPlayer) {
            System.out.println("Выберите силу");
            System.out.println("1. Соперник пропускает ход");
            System.out.println("2. Обратить время вспять");
            System.out.println("3. Ничего не выбрать");
            boolean res = ((HumanPlayer) currentPlayer).getSkipOpponentHod();
            userInput = scn.nextInt();
            switch (userInput) {
                case 1:
                    if (res) {
                        System.out.println("Соперник прпоускает ход");
                        count++;
                    } else {
                        System.out.println("Соперник не пропускает ход");
                    }
                    break;
                case 2:
                    ((HumanPlayer) currentPlayer).getBackInTime();
                    System.out.println(board.toString());
                    count++;
                    break;
                case 3:
                    break;
            }
        }
        return count;
    }

    private static boolean isEndGame(Board board, String playerSymbol) {

        if (board.getIsWin(playerSymbol)) {
            System.out.println("Победили " + playerSymbol);

            return true;

        }
        if (board.getIsMapFull()) {
            System.out.println("Ничья");
            return true;
        }
        return false;
    }
}
