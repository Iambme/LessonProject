package lesson.collections.queue.ex2;

import java.util.Comparator;
import java.util.Objects;

public class Tovar implements Comparable<Tovar> {
    String name;
    int order;

    public Tovar(String name, int order) {
        this.name = name;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }

    @Override
    public int compareTo(Tovar o) {
        return order - o.order;
    }


}
