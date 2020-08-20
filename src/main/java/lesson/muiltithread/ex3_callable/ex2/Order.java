package lesson.muiltithread.ex3_callable.ex2;

import java.util.concurrent.Callable;

public class Order extends Thread implements Callable<Integer> {

    public Order(String name) {
        super(name);
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Заказ "+getName()+" выполняется");
        Thread.sleep(10000);
        return 100;
    }
}
