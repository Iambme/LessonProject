package homework.myHashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        MyHashSet<String> set = new MyHashSet<>();

        set.add("Один");
        set.add("Два");
        set.add("Три");
        set.add("Четыре");
        set.add("Пять");
        set.add("Шесть");
        set.add("Семь");
        set.add("Восемь");
        set.add("Девять");
        set.add("Девять");
        set.add("Девять");
        set.add("десять");
        set.add("одиннадцать");
        set.add("двенадцать");
        set.print();
        System.out.println();
        System.out.println();
        System.out.println();

        set.remove(0);
        set.print();

        System.out.println(set.contains("Восемь"));

        set.remove("Восемь");
        System.out.println();
        System.out.println();
        System.out.println();
        set.print();
        System.out.println(set.contains("Восемь"));

        HashSet<Integer> set1 = new HashSet<>();


    }
}
