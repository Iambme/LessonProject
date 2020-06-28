package lesson.вложенные_классы.nested_class.hashMap;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<MyHashMap.Entry<String, Integer>> entryList;
        MyHashMap.Entry<String, Integer> entry = new MyHashMap.Entry<>();
        entry.setKey("test");
        System.out.println(entry.getKey());
        int val = MyHashMap.x;



    }
}
