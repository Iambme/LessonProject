package homework.concurrency.ex9.service;

import homework.concurrency.ex9.data.Chat;
import homework.concurrency.ex9.executor.ReaderTaskExecutor;
import homework.concurrency.ex9.executor.TaskExecutor;
import homework.concurrency.ex9.executor.UpdaterTaskExecutor;
import homework.concurrency.ex9.executor.WriterTaskExecutor;
import homework.concurrency.ex9.task.ReaderTask;
import homework.concurrency.ex9.task.Task;
import homework.concurrency.ex9.task.UpdaterTask;
import homework.concurrency.ex9.task.WriterTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Service {
    private Chat chat;
    private AtomicInteger atomicInteger;
    //Количество Writer
    private static final int WRITER_COUNT = 3;
    //Количество Reader
    private static final int READER_COUNT = 3;
    //Количество Updater
    private static final int UPDATER_COUNT = 1;

    private static Logger logger = LoggerFactory.getLogger(Service.class);

    public Service() {
        chat = new Chat();
        atomicInteger = new AtomicInteger(0);
    }

    public void startChat() {
        Task writerTask = new WriterTask(chat, atomicInteger);
        Task readerTask = new ReaderTask(chat);
        Task updaterTask = new UpdaterTask(chat);

        TaskExecutor writerTaskExecutor = new WriterTaskExecutor(writerTask, 2, 6);
        TaskExecutor readerTaskExecutor = new ReaderTaskExecutor(readerTask, 3, 5);
        TaskExecutor updaterTaskExecutor = new UpdaterTaskExecutor(updaterTask, 4);

        ExecutorService executorService = Executors.newFixedThreadPool(8);
        for (int i = 0; i < WRITER_COUNT; i++) {
            executorService.execute(writerTaskExecutor);
        }
        for (int i = 0; i < READER_COUNT; i++) {
            executorService.execute(readerTaskExecutor);
        }
        for (int i = 0; i < UPDATER_COUNT; i++) {
            executorService.execute(updaterTaskExecutor);
        }

    }
}