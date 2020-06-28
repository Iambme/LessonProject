package lesson.hash_tables.ex3;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //Как хранить объекты в HashSet?
        //нужно перепределить equals и hashCode
//        HashSet<Integer> set  = new HashSet<>();
//        set.add(10);
//        set.add(20);
//        set.add(30);
//        set.add(40);
//        System.out.println(set);


        Tovar t1 = new Tovar("tovar1", 100);
        Tovar t2 = new Tovar("tovar1", 100);
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        HashSet<Tovar> set = new HashSet<>();
        set.add(t1);
        set.add(t2);
        System.out.println(set);


    }
}
