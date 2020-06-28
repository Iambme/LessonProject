package lesson.io.bytes_io.practice2;

import java.io.Serializable;

public class Subject implements Serializable {
    String name;
    int mark;

    public Subject(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
