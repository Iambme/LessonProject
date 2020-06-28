package lesson.collections.iterator.ex2_myIterator;

public class Tovar implements Comparable<Tovar>{
    String name;
    int price;

    public Tovar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Tovar o) {
        return price-o.price;
    }
}
