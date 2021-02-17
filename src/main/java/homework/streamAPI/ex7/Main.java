package homework.streamAPI.ex7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*
        4. Создать список из строк: "29a", "12", "94", "abc", "a9c5".
С помощью одного stream подсчитать количество строк, внутри которых сумма чисел будет больше 10.
Ответ должен получиться 3.
Подсказка.
У строк есть методы chars(), который возвращает IntStream поток по символам из строки в типе int.
Проверку символа на то, является ли он числом или нет, можно сделать через Character.isDigit.
 Данный метод принимает символ как в типе char, так и в типе int.
Преобразовать символ из типа char в String можно через Character.toString(ваш_символ)
         */

        String[][] arr = {
                {"2", "1ы", "8"}, //11
                {"2d", "1", "3ass"}, //6
                {"9f", "10", "5"} //24
        };
        long count = Arrays.stream(arr)
                .map(array -> Arrays.stream(array).mapToInt(x -> Integer.parseInt(x.replaceAll("[^0-9]", ""))).sum()) //Stream<Integer>
                .filter(val -> val > 10)
                .count();
        System.out.println(count);

        System.out.println("*********");



            String[] strings = {"29a", "12", "94", "abc", "a9c5"};

            long result = Stream.of(strings)
                    .mapToInt(s -> s.chars().filter(Character::isDigit).map(Character::getNumericValue).sum())
                    .filter(i -> i > 10).count();

            System.out.println(result);

        System.out.println("******");

        List<String> list = new ArrayList<>();
        list.add("29a");
        list.add("12");
        list.add("94");
        list.add("abc");
        list.add("a9c5");
        long a = list.stream()
                .map(s -> s.replaceAll("[a-zа-яё]+", ""))
                .filter(s1 -> !s1.equals(""))
                //.map(x -> Arrays.stream(x.split("")).mapToInt(Integer::valueOf).reduce(0, Integer::sum))
                .map(x -> Arrays.stream(x.split("")).mapToInt(Integer::valueOf).sum())
                .filter(n -> n > 10)
                .count();
        System.out.println(a);


/*
chars возвращает IntStream

то есть коды символов из таблицы кодировки

"hello".chars - сделает поток типа 60, 70, 58, 101, 102 (числа условные, могут не совпадать)

короче говоря, запусти этот код и станет понятно
//"hello".chars().forEach(System.out::println);
//         */
//        Arrays.stream(arr)
//                .map(array -> Arrays.stream(array)
//                        .flatMapToInt(String::chars)
//                        .filter(value -> value>10)
//                        .count()
    }
}
