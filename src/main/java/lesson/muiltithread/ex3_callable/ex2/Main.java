package lesson.muiltithread.ex3_callable.ex2;

import com.google.common.collect.Ordering;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        На кухне работает 5 поваров, производительность каждого 1 заказ в 10 секунд. Всего в кафе поступило N заказов, где N число от 10 до 50.
        В конце смены каждый повар получает оплату в виде 100 руб за каждый выполненный заказ.
        Создать в мейне выполнение заказов в одном параллельном потоке с помощью ExecutorService.
        Посчитать заработанную прибыль каждого повара.
         */

//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        //ExecutorService executorService = Executors.newCachedThreadPool();
//        //ExecutorService executorService = Executors.newSingleThreadExecutor();
//
//        int n = (int) (Math.random() * 40) + 40;
//        System.out.println("n = "+n);
//        List<Future<Integer>> list = new ArrayList();
//        while (n > 0) {
//            Order order = new Order(String.valueOf(n));
//            Future<Integer> future = executorService.submit((Callable) order);
//            list.add(future);
//            n--;
//        }
//        System.out.println("finish loop");
//        int sum = 0;
//        for (Future<Integer> future : list) {
//            sum += future.get();
//        }
//        System.out.println(sum);
//        executorService.shutdown();

    }
}
