package lesson.stream.ex2;

import lesson.stream.ex1.Tovar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Создать массив чисел в типе String.
        //Преобразовать с помощью map числа из типа String в тип int и собрать их в коллекцию типа Integer

        String[] arr = {"10", "20", "30"};
        List<Integer> list = Arrays.stream(arr)
                .map(val->Integer.parseInt(val))
                .collect(Collectors.toList());

        list.forEach(System.out::println);

        //Создать массив товаров и получить на их основе список наименований товаров, чья цена меньше 500.
        Tovar[] arrTovar = {new Tovar("Tovar1", 100), new Tovar("Tovar2", 300), new Tovar("Tovar3", 600)};
        List<String> resList = Arrays.stream(arrTovar)
                .filter(tovar->tovar.price < 500)
                .map(tovar->tovar.name)
                .collect(Collectors.toList());
        resList.forEach(System.out::println);



    }
}
