package lesson.map.ex1_HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //HashMap - карта, хранящая элементы в виде пары ключ-значение
        /*
        class Entry<K,V>{
            K key;
            V value;
        }
         */
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(-10, "Ivan");
        hashMap.put(10, "Petr");
        hashMap.put(20, "Semen");

//        System.out.println(hashMap.get(-10));
//        System.out.println(hashMap.get(10));



//        Set<Integer> keys = hashMap.keySet();
//        for(Integer key:keys){
//            System.out.println(key+" "+hashMap.get(key));
//        }

        Set<Map.Entry<Integer, String>> values = hashMap.entrySet();
        for(Map.Entry<Integer, String> val : values){
            System.out.println(val.getKey()+" "+val.getValue());
        }




    }
}
