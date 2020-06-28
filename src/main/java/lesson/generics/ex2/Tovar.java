package lesson.generics.ex2;

public class Tovar {
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
}
