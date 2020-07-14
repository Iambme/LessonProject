package lesson.stream.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //String[] arr = {"one", "two"};
//        Stream<String> stream = Arrays.stream(arr);
//        Consumer consumer = val-> System.out.println(val);
//        stream.forEach(consumer);
//        Arrays.stream(arr).forEach(System.out::println);



        //Вывести элементы из коллекции (те, что больше 0)
//        List<Integer> list = Arrays.asList(10,-2,6,-15);
//        list.stream()
//                .filter(val->val>0)
//                .forEach(System.out::println);
//
//
//
//
//        //Вывести строки с большой буквы
//        List<String> list2 = Arrays.asList("One", "two", "Three");
//        list2.stream()
//                .filter(s -> s.matches("[A-ZА-Я].*"))
//                .forEach(System.out::println);


        /*
        Создать массив товаров и вывести только те товары, чья цена меньше 500
         */

//        Tovar[] arr = {new Tovar("Tovar1", 550),new Tovar("Tovar2", 150),new Tovar("Tovar2", 650) };
//        Arrays.stream(arr)
//                .filter(t->t.price>500)
//                .forEach(System.out::println);


//        Сохранить все товары ценой меньше 500 в список
//        Tovar[] arr = {new Tovar("Tovar1", 550),new Tovar("Tovar2", 150),new Tovar("Tovar2", 650) };
//        List<Tovar> resList = Arrays.stream(arr)
//                .filter(t->t.price>500)
//                .collect(Collectors.toList());
//
//        resList.forEach(System.out::println);


        //Найти сумму элементов, которые больше нуля


        int[] arr = {1,-2,6,-10,5};
        int sum = Arrays.stream(arr)
                .filter(val->val > 0)
                .sum();
        System.out.println(sum);

        //Посчитать, сколько чисел меньше 0
        double count = Arrays.stream(arr)
                .filter(val->val<0)
                .count();
        System.out.println(count);


    }
}
