package lesson.patterns.decorator;

public interface DataSource {
    void write(String text);
    void read();
}
