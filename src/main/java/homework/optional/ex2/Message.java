package homework.optional.ex2;

import java.util.Random;

public class Message implements MessageGenerator {
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public Message() {
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                '}';
    }

    @Override
    public Message generateMessage() {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int randomInt = random.nextInt(10);
        if (randomInt > 5 && randomInt < 8) {
            return null;
        }
        for (int i = 0; i < random.nextInt(10); i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }

        return new Message(sb.toString());
    }
}
