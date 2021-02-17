package homework.concurrency.ex9.task;

import homework.concurrency.ex9.data.Chat;

public class UpdaterTask extends Task {

    public UpdaterTask(Chat chat) {
        super(chat);
    }

    @Override
    public String call() throws Exception {
        return chat.updateSms();
    }
}