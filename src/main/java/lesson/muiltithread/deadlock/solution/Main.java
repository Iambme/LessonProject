package lesson.muiltithread.deadlock.solution;

public class Main {
    public static void main(String[] args) {
        //Взаимная блокировка
        InitiatorState initiatorState = new InitiatorState();
        Abonent abonent1 = new Abonent("ivan", initiatorState);
        Abonent abonent2 = new Abonent("petr", initiatorState);
        Thread1 th1 = new Thread1(abonent1, abonent2);
        Thread1 th2 = new Thread1(abonent2, abonent1);
        th1.start();
        th2.start();
    }
}
