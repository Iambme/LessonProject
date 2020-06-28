package lesson.collections.queue.ex2;

public class Tovar2 {
    String name;
    int order;

    public Tovar2(String name, int order) {
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

}
