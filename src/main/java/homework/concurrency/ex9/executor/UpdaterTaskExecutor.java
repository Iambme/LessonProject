package homework.concurrency.ex9.executor;

import homework.concurrency.ex9.task.Task;

import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class UpdaterTaskExecutor extends TaskExecutor {


    public UpdaterTaskExecutor(Task task, int period) {
        super(task, period);
    }

    @Override
    public void run() {

        while (true) {
            FutureTask<String> futureTask = new FutureTask<>(task);

            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(period));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executorService.execute(futureTask);
            try {
                String modifiedSmsText = futureTask.get();
                System.out.println("Изменение: Updater : " + modifiedSmsText);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}