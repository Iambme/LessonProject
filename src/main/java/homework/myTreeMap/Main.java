package homework.myTreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> myTreeMap = new MyTreeMap<>();
        myTreeMap.put(13, "hello");
        myTreeMap.put(8, "hello world");
        myTreeMap.put(17, "hello java");
        myTreeMap.put(1, "hello java");
        myTreeMap.put(11, "hello java");
        myTreeMap.put(6, "hello java");

        System.out.println(myTreeMap.size());
        System.out.println(myTreeMap.entrySet());
        System.out.println(myTreeMap.values());
        System.out.println(myTreeMap.get(1));

        System.out.println(myTreeMap.containsKey(6));
        System.out.println("*************");

        MyTreeMap<Abonent, String> myTreeMap1 = new MyTreeMap<>();
        Abonent abonent2 = new Abonent("ab2");
        Abonent abonent3 = new Abonent("ab3");
        Abonent abonent = new Abonent("ab");
        Abonent abonent1 = new Abonent("ab1");


        Abonent abonent4 = new Abonent("ab4");
        myTreeMap1.put(abonent2, "89227778822");
        myTreeMap1.put(abonent3, "89447283749");
        myTreeMap1.put(abonent, "89991234567");
        myTreeMap1.put(abonent1, "+74958982323");

        System.out.println(myTreeMap1.size());
        System.out.println(myTreeMap1.containsKey(abonent2));
        System.out.println(myTreeMap1.containsValue("89447283749"));
        System.out.println("***********");

        System.out.println(myTreeMap1.entrySet());
        System.out.println(myTreeMap1.keySet());

    }
}
