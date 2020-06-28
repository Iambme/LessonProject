package lesson.collections.iterator.practice1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //Создать свой ArrayList с итератором
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);

        Iterator<Integer> integerIterator = list.iterator();

        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }
}
