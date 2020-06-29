package lesson.annotation;

@TovarType(typeName = "BMW")
public class Car {
    int price;
    String name;

    public Car(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
