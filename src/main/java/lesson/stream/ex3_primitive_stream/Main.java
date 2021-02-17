package lesson.stream.ex3_primitive_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Создать int массив и найти сумму элементов
        int[] arr = {10,20,30};

        int sum = Arrays.stream(arr).sum();


        //Создать int список и найти сумму элементов путем конвертации Stream<Integer> в IntStream с помощью метода mapToInt
        List<Integer> list = Arrays.asList(10,20,30);
        sum = list.stream()
                .mapToInt(val->val) //Stream<Integer> -> IntStream
                .sum();
        System.out.println(sum);



    }
}
