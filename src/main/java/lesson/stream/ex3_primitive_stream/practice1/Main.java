package lesson.stream.ex3_primitive_stream.practice1;

import lesson.stream.ex1.Tovar;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Предположим, есть корзина товаров в интернет-магазине. Создать список товаров и найти сумму добавленных туда элементов.
        List<Tovar> tovars = new ArrayList<>();
        tovars.add(new Tovar("TV",300));
        tovars.add(new Tovar("PS4",600));
        tovars.add(new Tovar("XBox",800));
        tovars.add(new Tovar("Vacuum",200));

        int sum =tovars.stream()
                .mapToInt(tovar->tovar.price)
                .sum();
        System.out.println(sum);


        //Создать список типа double и найти сумму его элементов
        List<Double> arr = Arrays.asList(12.3,34.4,44d);
        double sum1 = arr.stream() //Stream<Double>
                    .mapToDouble(i->i)
                .sum();
        System.out.println(sum1);

    }
}
