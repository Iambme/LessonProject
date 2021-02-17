package lesson.stream.ex5_max_min_average.practice2.ex2;

import lesson.stream.ex1.Tovar;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Создать метод, который принимает список товаров и возвращает самый дорогой в типе Optional
        //Вывести товар на консоль, если он не null
        List<Tovar> list = Arrays.asList(new Tovar("Tovar1", 100),
                new Tovar("Tovar2", 300), new Tovar("Tovar3", 150));
        Optional<Tovar> op = getMaxTovar(list);
        op.ifPresent(System.out::println);
    }

    public static Optional<Tovar> getMaxTovar(List<Tovar> list) {
        Optional<Tovar> maxT = list.stream().max((tov1, tov2) -> tov1.price - tov2.price);
        return maxT;
    }
}
