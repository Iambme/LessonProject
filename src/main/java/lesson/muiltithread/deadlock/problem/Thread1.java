package lesson.muiltithread.deadlock.problem;

public class Thread1 extends Thread{
    Abonent from;
    Abonent to;

    public Thread1(Abonent from, Abonent to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        //звонящий абонент from набирает номер абонента to
        from.dialUp(to);
    }
}
