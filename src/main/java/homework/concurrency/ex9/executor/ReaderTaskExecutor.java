package homework.concurrency.ex9.executor;

import homework.concurrency.ex9.task.Task;

import java.util.Random;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class ReaderTaskExecutor extends TaskExecutor {


    public ReaderTaskExecutor(Task task, int secFrom, int secTo) {
        super(task, secFrom, secTo);
    }

    @Override
    public void run() {
        Random rnd = new Random();
        while(true){
            FutureTask<String> futureTask = new FutureTask<>(task);
            int time = rnd.nextInt(secTo-secFrom) + secFrom;
            System.out.println("Time: Reader "+Thread.currentThread().getName()+": time=" + time);
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(time));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executorService.execute(futureTask);
            try {
                String smsText = futureTask.get();
                System.out.println("Чтение: Ридер "+Thread.currentThread().getName()+" достал смс: "+smsText);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}