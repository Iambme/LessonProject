package lesson.stream.ex5_max_min_average.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //В списке строк найти самую длинную строку
        List<String> list = Arrays.asList("one", "two", "three", "four");
        Optional<String> largestString = list.stream()
                .max((str1, str2)->str1.length()-str2.length());

        System.out.println(largestString.get());


    }
}
