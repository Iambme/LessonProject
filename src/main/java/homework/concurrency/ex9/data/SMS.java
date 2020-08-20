package homework.concurrency.ex9.data;

public class SMS {
    private String text;

    public SMS(String text) {
        this.text = text;
    }

    public SMS() {
    }

    public synchronized String getText() {
        return text;
    }

    public synchronized void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                '}';
    }
}
