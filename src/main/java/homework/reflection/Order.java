package homework.reflection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    private List<Dish> dished = new ArrayList<>();

    public void add(Dish dish) {
        dished.add(dish);
    }
    public void add(Dish... dish) {
        //dished.add(dish);
    }

    public int orderSum() {
        int sum = 0;
        for (Dish d : dished) {
            sum += d.getPrice();
        }
        return sum;
    }

    public List<Dish> getDished() {
        return dished;
    }

    @Override
    public String toString() {
        return "Order{" +
                "dished=" + dished +
                '}';
    }
}
