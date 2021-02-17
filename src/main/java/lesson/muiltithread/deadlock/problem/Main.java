package lesson.muiltithread.deadlock.problem;

public class Main {
    public static void main(String[] args) {
        //Взаимная блокировка
        Abonent abonent1 = new Abonent("ivan");
        Abonent abonent2 = new Abonent("petr");
        //Ivan звонит Petr
        Thread1 th1 = new Thread1(abonent1, abonent2);
        //Petr звонит Ivan
        Thread1 th2 = new Thread1(abonent2, abonent1);
        th1.start();
        th2.start();
    }
}
