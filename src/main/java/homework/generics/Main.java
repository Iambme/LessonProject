package homework.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    /*
    1. Создать иерархию классов Fruit->Citrus->Orange. От класса Orangle наследуются BigOrange и SmallOrange.
Создать метод public int findSum(здесь ваша коллекция), который принимает коллекцию
с любым типом из иерархии Fruit и возвращает суммарный вес фруктов в коллекции.
Создать глобальную коллекцию List<? super Orange> globalList = new ArrayList();

Создать метод public void add(ваша коллекция здесь), который принимает коллекцию фруктов с типом не выше Orange и добавляет их всех в globalList.
 После добавления всех элементов найти их суммарный вес из коллекции globalList в этом же методе.

     */
        List<? super Orange> globalList = new ArrayList<>();
        List<Orange> lst = Arrays.asList(new Orange(2), new BigOrange(3), new SmallOrange(1));
        add(lst,globalList);

    }

    public static int findSum(List<? extends Fruit> list) {
        return list.stream().mapToInt(Fruit::getWeight).sum();
    }

    public static void add(List<? extends Orange> list, List<? super Orange> global) {
        global.addAll(list);
        int sum = findSum((List<? extends Fruit>) global);
        System.out.println(sum);
    }
}
