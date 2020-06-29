package lesson.annotation;

public class Brick {
    int price;
    String name;

    public Brick(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Brick{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
