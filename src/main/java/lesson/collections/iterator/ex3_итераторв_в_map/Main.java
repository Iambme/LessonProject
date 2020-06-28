package lesson.collections.iterator.ex3_итераторв_в_map;

import lesson.вложенные_классы.nested_class.hashMap.MyHashMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Set<Integer> keys = map.keySet();
        Iterator<Integer> iterKey = keys.iterator();

        Collection<String> values = map.values();
        Iterator<String> iterValues = values.iterator();

        Collection<Map.Entry<Integer,String>> entries = map.entrySet();

        Iterator<Map.Entry<Integer,String>> entryIterator = entries.iterator();
    }
}
