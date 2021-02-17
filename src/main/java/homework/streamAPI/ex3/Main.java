package homework.streamAPI.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        3.  Создать класс Tempreture с полем в виде средней температурой за месяц (double).
        В мейне создать массив или список объектов класса Temperature.
        Найти с помощью stream сумму температур в массиве в типе double.
         После нахождения поделить ее на количество месяцев и вывести на консоль.
         */

        List<Temperature> temperatures = Arrays.asList(new Temperature(12.3), new Temperature(17.1), new Temperature(15.1),
                new Temperature(20.2), new Temperature(18.4), new Temperature(14.2));

        OptionalDouble average = temperatures.stream().mapToDouble(Temperature::getT).average();
        average.ifPresent(System.out::println);

        /*
        4. Сгенерировать через stream список из 10 случайных чисел в диапазоне от 2 до 12.
        Вывести его на консоль в одну строку.
        После вывести на консоль из массива только числа, которые больше 5
        5. Сгенерировать через stream массив типа int из 10 случайных чисел в диапазоне от 2 до 12.
        Вывести его на консоль в одну строку.
        После вывести на консоль количество элементов меньше 5 (понадобится count)
         */

        int[] arr = new Random()
                .ints(10, 2, 12)
                .toArray();

        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));

        System.out.println();

        Arrays.stream(arr)
                .filter(x -> x > 5)
                .forEach(x -> System.out.print(x + " "));

        System.out.println();

        double count = Arrays.stream(arr)
                .filter(x -> x < 5)
                .count();
        System.out.println(count);

    }
}
