package homework.concurrency.ex9.task;

import homework.concurrency.ex9.data.Chat;

import java.util.concurrent.atomic.AtomicInteger;

public class WriterTask extends Task {
    private AtomicInteger atomicInteger;

    public WriterTask(Chat chat, AtomicInteger atomicInteger) {
        super(chat);
        this.atomicInteger = atomicInteger;
    }

    @Override
    public String call() throws Exception {
        String text = "сообщение №"+ atomicInteger.incrementAndGet();
        return chat.addSMS(text);
//      logger.info("Добавлено: " + text);
    }
}