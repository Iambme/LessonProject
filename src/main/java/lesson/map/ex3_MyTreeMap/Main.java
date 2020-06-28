package lesson.map.ex3_MyTreeMap;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> myTreeMap = new MyTreeMap<>();
        myTreeMap.put(13, "hello");
        myTreeMap.put(8, "hello world");
        myTreeMap.put(17, "hello java");
        myTreeMap.put(1, "hello java");
        myTreeMap.put(11, "hello java");
        myTreeMap.put(6, "hello java");


//        System.out.println(myTreeMap.get(2));
//        System.out.println(myTreeMap.get(3));
//        System.out.println(myTreeMap.get(4));


        System.out.println(myTreeMap.keySet());


        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(4, "123");
        treeMap.put(2, "123");
        treeMap.put(3, "123");

        System.out.println(treeMap.keySet());


    }
}
