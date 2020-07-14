package homework.streamAPI.ex1;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        1. Сгенерировать коллекцию из 10 случайных чисел в диапазоне от 2 до 12. Вывести его на консоль через stream
        После вывести на консоль из массива только числа, которые больше 5 через stream и filter
        2. Сгенерировать массив из 10 случайных чисел в диапазоне от 2 до 12.
        Вывести его на консоль через stream. Найти сумму всех элементов через stream
        3. Сгенерировать массив из 10 случайных чисел в диапазоне от 2 до 12.
        Вывести его на консоль через stream и найти сумму всех элементов, который больше 5
        4. Сгенерировать коллекцию из 10 случайных чисел в диапазоне от 2 до 10. Вывести ее на консоль.
        Сформировать из чисел, которые меньше 8 новую коллекцию и также вывести ее на консоль.
        5. Создать класс Tovar с полями название, цена, категория. Создать коллекцию товаров, вывести ее на консоль через stream.
        Посчитать количество товаров категории "Электротехника" ценой не выше 1000. Вывести это количество на консоль.
         */

        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(11) + 2);
        }
        System.out.println(arrayList);//числа больше 5
        arrayList.stream()
                .filter(integer -> integer > 5)
                .forEach(System.out::println);

        System.out.println("*********");

        int[] array = new int[10]; //вывести все элементы, вывести сумму всех элементов
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11) + 2;
            //array[i] = (int)(Math.random()*11)+2;
        }
        Arrays.stream(array)
                .forEach(System.out::println);

        int sum = Arrays.stream(array)
                .sum();
        System.out.println(sum);

        System.out.println("*********");

        int sum1 = Arrays.stream(array)
                .filter(i -> i > 5)
                .sum();
        System.out.println(sum1);

        List<Integer> list = arrayList.stream()
                .filter(i -> i < 8)
                .collect(Collectors.toList());

        list.forEach(System.out::println);

        List<Tovar> tovarList = new ArrayList<>();
        tovarList.add(new Tovar("TV", 1100, "electronic"));
        tovarList.add(new Tovar("Chair", 300, "furniture"));
        tovarList.add(new Tovar("Sofa", 1200, "furniture"));
        tovarList.add(new Tovar("Vacuum", 600, "electronic"));
        tovarList.add(new Tovar("PS4", 1300, "electronic"));
        tovarList.forEach(System.out::println);
        System.out.println("***********************");

        tovarList.stream()
                .filter(tovar -> tovar.getPrice() > 1000 && tovar.getCategory().equals("electronic"))
                .forEach(System.out::println);
    }
}
