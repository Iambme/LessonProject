package lesson.muiltithread.race_condition;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static volatile int sharedValue;

    public static void main(String[] args) throws InterruptedException {
        //Состояние гонки
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (Main.class) {
                        if (sharedValue % 2 == 0) {
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("sharedValue = " + sharedValue);
                        }
                    }

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (Main.class) {
                        sharedValue++;

                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
