package lesson.comparator;

public class Tovar implements Comparable<Tovar>{
    String name;

    public Tovar(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Tovar o) {
        return name.compareTo(o.name);
    }
}
