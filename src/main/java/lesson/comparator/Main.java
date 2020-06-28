package lesson.comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Comparator - интерфейс для указания дополнительного варианта сортировки
        //1. Сделать сортировку списка товаров по алфавиту по возрастанию и убыванию в алфавитном порядке
        List<Tovar> list = new ArrayList<>();
        list.add(new Tovar("apple"));
        list.add(new Tovar("orange"));
        list.add(new Tovar("blackberry"));
        list.add(new Tovar("banana"));
        Collections.sort(list);

        //Comparable здесь реализует сортировку по алфавиту
        for(Tovar t : list){
            System.out.println(t);
        }

        //Для обратной сортировки нужно реализовать Comparator
        Comparator<Tovar> comparator = new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                return o2.compareTo(o1);
            }
        };

        list.sort(comparator);
        System.out.println();
        for(Tovar t : list){
            System.out.println(t);
        }


    }
}
