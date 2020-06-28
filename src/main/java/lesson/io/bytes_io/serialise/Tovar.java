package lesson.io.bytes_io.serialise;

import java.io.Serializable;

public class Tovar implements Serializable {
    String name;
    int price;
    private static final int serialVersionUID = 1;


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
