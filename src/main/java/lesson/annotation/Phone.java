package lesson.annotation;

@TovarType(typeName = "Iphone")
public class Phone {
    int price;
    String name;

    public Phone(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
