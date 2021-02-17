package homework.optional.ex2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayDeque;
import java.util.Optional;

public class MessageBuffer {
    private ArrayDeque<Optional<Message>> optionals;

    public MessageBuffer() {
        optionals = new ArrayDeque<>();
    }

    public void add(Message message) {
        Optional<Message> messageOptional = Optional.ofNullable(message);
        optionals.add(messageOptional);
    }

    public ArrayDeque<Optional<Message>> getOptionals() {
        return optionals;
    }

    public void readMessage(ArrayDeque<Optional<Message>> optionals) {
        Logger logger = LoggerFactory.getLogger(MessageBuffer.class);
//        while (!optionals.isEmpty()) {
//            Optional<Message> messageOptional = optionals.pop();
//            messageOptional.ifPresentOrElse(message -> logger.info(message.getText()), () -> logger.warn("Message is null"));
//        }

        optionals.stream().forEach(op->op.ifPresentOrElse(message -> logger.info(message.getText()), () -> logger.warn("Message is null")));


    }
}
