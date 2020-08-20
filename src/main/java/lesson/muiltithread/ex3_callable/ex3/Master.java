package lesson.muiltithread.ex3_callable.ex3;

import java.util.concurrent.Callable;

public class Master implements Runnable {
    private TV tv;
    private int id;
    private static int count;

    public Master() {
        this.id = ++count;
    }


    public void addTv(TV tv){
        this.tv = tv;
    }


    public int getMasterId(){
        return id;
    }

    @Override
    public void run() {
        System.out.println("Мастер " + id + " ремонтирует тв " + tv.getId());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tv.setFixed(true);
    }

    public TV getTV(){
        return tv;
    }
}
