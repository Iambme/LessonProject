package lesson.stream.ex4_random;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Сгенерировать массив из 5-и случайных чисел типа int в диапазоне от -10 до 10(метод ints)
        int[] arr = new Random()
                .ints(5, -10, 10)
                .toArray();

        Arrays.stream(arr).forEach(System.out::println);

        //Сгенерировать коллекцию из 5-и случайных чисел в типе int в диапазоне от -10 до 10
        List<Integer> list = new Random()
                .ints(5, -10, 10)
                .mapToObj(val->val) //IntStream -> Stream<Integer>
                .collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
