package homework.concurrency.ex5;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        1. На складе есть N товаров. Каждый товар представлен классом Tovar с полями "название" и "цена".
        5 потоков одновременно могут забирать товары со склада.
        Нужно вывести список товаров, которые забрали со склада, не пользуясь глобальными переменными.
         */
        Store store = new Store();
        store.add(new Tovar());
        store.add(new Tovar());
        store.add(new Tovar());
        store.add(new Tovar());
        store.add(new Tovar());
        ExecutorService executorService = Executors.newFixedThreadPool(5);


        ArrayList<Tovar> tovars = new ArrayList<>();

        while (store.getTovars().size()>0){

            Future<Tovar> tovarFuture = executorService.submit(store);
            tovars.add(tovarFuture.get());
        }
        tovars.forEach(System.out::println);
        executorService.shutdown();

    }
}
