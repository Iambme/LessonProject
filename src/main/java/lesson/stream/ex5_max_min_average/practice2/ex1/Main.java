package lesson.stream.ex5_max_min_average.practice2.ex1;



import lesson.stream.ex1.Tovar;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Найти товар с наибольше ценой
        List<Tovar> list = Arrays.asList(new Tovar("Tovar1", 100),
                new Tovar("Tovar2", 300), new Tovar("Tovar3", 150));

        Optional<Tovar> maxT = list.stream().max((tov1,tov2)->tov1.price-tov2.price);
        System.out.println(maxT.get());
    }
}
