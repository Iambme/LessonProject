package lesson.patterns.decorator;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Tovar implements Cloneable{
    List<Point> list = new ArrayList<>();

    String name;
    int price;

    public Tovar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Tovar(Tovar tovar){
        name = tovar.name;
        price = tovar.price;
        for (int i = 0; i < tovar.list.size(); i++) {
            try {
                list.add(list.get(i).clone());
            }catch(Exception e){

            }
        }

    }

    @Override
    protected Tovar clone() throws CloneNotSupportedException {
        Tovar tovarClone = new Tovar(name, price);
        for (int i = 0; i < list.size(); i++) {
            tovarClone.list.add(list.get(i).clone());
        }
        return tovarClone;
    }


    @Override
    public String toString() {
        return "Tovar{" +
                "list=" + list +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
