package homework.optional.ex2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
Создать класс Message с полем текст сообщения.
Создать класс MessageGenerator с одним методом
public String generateMessage() - возвращает сообщение с любым текстом, в том числе и null.

Создать класс MessageBuffer с полем ArrayDeque<Optional<Message>> - коллекция входящих сообщений в виде очереди,
создать метод readMessage, который читает сообщения в порядке очередности из коллекции.

В мейне запустить  генерацию n сообщений и их чтение.  Обработку null сообщений делать, используя средства Optional.
 Если сообщение null, то просто выводить на консоль текст "Пустое сообщение".
Для вывода на консоль успешных сообщений использовать уровень логера info.
Для null сообщений использовать уровень warn, а также дублировать их вывод в файл с указанием даты события.
         */
        MessageBuffer messageBuffer = new MessageBuffer();
        Message message = new Message();
        Random random = new Random();
        int randomInt = random.nextInt(10);
        for (int i = 0; i < randomInt; i++) {
            messageBuffer.add(message.generateMessage());
        }
        messageBuffer.readMessage(messageBuffer.getOptionals());


    }
}
