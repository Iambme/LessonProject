package lesson.muiltithread.ex3_callable.ex3;

import java.util.Objects;

public class MyThread extends Thread{

    private Master master;

    public MyThread(Master master) {
        super(master);
        this.master = master;
    }

    public Master getMaster(){
        return master;
    }

    @Override
    public boolean equals(Object o) {
        MyThread myThread = (MyThread) o;
        return master.getMasterId() == myThread.master.getMasterId();
    }


}
