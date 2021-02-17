package lesson.muiltithread.reentrantlock;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();

        myThread1.join();
        myThread2.join();
        System.out.println(val);
        System.out.println(ai.get());

    }

    static int val = 0;
    static AtomicInteger ai = new AtomicInteger();
    static ReentrantLock locker = new ReentrantLock();
    static class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                //synchronized (Main.class) {

                increment1();
                increment2();
                ai.incrementAndGet();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //}
            }
        }


        public void increment1(){
            locker.lock();
            val++;
        }
        public void increment2(){
            val++;
            locker.unlock();
        }

    }
}


