package homework.myHashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer,String> map = new MyHashMap<>();
        //map.put(1,"Lol");
        map.put(2,"Lal");
        map.put(3,"Lil");
        map.put(4,"kak");
        //map.put(5,"pop");
        //map.put(6,"joj");
        //map.put(8,"mnm");
        //map.put(9,"mnm");
        //map.put(10,"mnm");
        map.put(12,"mnm");
        map.put(13,"mnm");
        map.put(14,"mnm");
        //map.put(2,"qqq");
        map.put(22,"tri");
        map.put(32,"4");
        map.put(42,"5");

//        System.out.println(map.size());
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Lal"));
        System.out.println(map.keySet());
        System.out.println();
        System.out.println(map.entrySet());
        map.remove(2);
//     map.remove(11);
        System.out.println("*********************");
        System.out.println(map.entrySet());


        HashMap<Integer,String>map1 = new HashMap<>();
        map1.put(1,"sf");
        map1.remove(1);
    }
}
