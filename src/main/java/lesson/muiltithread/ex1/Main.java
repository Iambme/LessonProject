package lesson.muiltithread.ex1;

public class Main {
    public static void main(String[] args) {
        //Многопоточность

        //вывести в главном потоке числа от 0 до 10
        //вывести в побочном потоке числа от 20 до 30



//        MyThread myThread = new MyThread("myThread2");
//        myThread.start();

        MyRunnrableThread myRunnrableThread = new MyRunnrableThread();
        Thread thread = new Thread(myRunnrableThread);
        thread.start();

        Runnable runnable = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(runnable).start();



        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class MyThread extends Thread{
    public MyThread(String name) {
        setName(name);
    }

    @Override
    public void run() {
        for (int i = 20; i < 30; i++) {
            System.out.println(getName()+" "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class MyRunnrableThread implements Runnable{

    @Override
    public void run() {
        for (int i = 20; i < 30; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}