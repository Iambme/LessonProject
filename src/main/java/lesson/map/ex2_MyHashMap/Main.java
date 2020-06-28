package lesson.map.ex2_MyHashMap;

import java.util.List;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
//        myHashMap.put(1, "Ivan");
//        myHashMap.put(1, "Petr");
//        myHashMap.put(2, "Semen");
//
//        System.out.println(myHashMap.get(1));
//        System.out.println(myHashMap.get(2));


        MyHashMap<Passport, String> myHashMap2 = new MyHashMap<>();
        Passport p1 = new Passport("12", "23");
        Passport p2 = new Passport("22", "33");
        Passport p3 = new Passport("22", "34");

        myHashMap2.put(p1, "Ivan, address1, age2");
        myHashMap2.put(p2, "Petr, address1, age2");
        myHashMap2.put(p3, "Semen, address1, age2");



//        System.out.println(myHashMap2.get(p1));
//        System.out.println(myHashMap2.get(p2));
//        System.out.println(myHashMap2.get(p3));


        List<Passport> keys = myHashMap2.keySet();
        for(Passport passport : keys){
            System.out.println(passport+" "+myHashMap2.get(passport));
        }
    }
}
