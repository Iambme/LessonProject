package lesson.muiltithread.ex3_callable.ex1;

import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] arr = new Random().ints(10, -10, 10).toArray();
        MyArray myArray = new MyArray(arr);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future = executorService.submit(myArray);
        System.out.println(future.get());
        System.out.println("finish");
        executorService.shutdown();

    }
}
