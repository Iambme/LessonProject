package homework.concurrency.ex3;

public class Robot {

    public void goForward(int steps) throws InterruptedException {
        System.out.println("робот идет вперед на " + steps + " шагов");
        for (int i = 1; i <= steps; i++) {
            Thread.sleep(1000);
            System.out.println("робот прошел вперед на " + i + " шагов");
        }
        System.out.println();
    }

    public void goLeft(int steps) throws InterruptedException {
        System.out.println("робот идет влево на " + steps + " шагов");
        for (int i = 1; i <= steps; i++) {
            Thread.sleep(1000);
            System.out.println("робот прошел влево на " + i + " шагов");

        }
        System.out.println();
    }

    public void goRight(int steps) throws InterruptedException {
        System.out.println("робот идет вправо на " + steps + " шагов");
        for (int i = 1; i <= steps; i++) {
            Thread.sleep(1000);
            System.out.println("робот прошел вправо на " + i + " шагов");
        }
        System.out.println();
    }
}
