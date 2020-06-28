package lesson.collections.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //TreeSet = хранит уникальные значения в порядке сортировки, при этом для сравнения элементов на равенство используется compareTo, а не
        //equals
        //1. Сохранить товары в порядке поставки
        TreeSet<Tovar> treeSet = new TreeSet<>();

        treeSet.add(new Tovar("Tovar1",1));
        treeSet.add(new Tovar("Tovar2",3));
        treeSet.add(new Tovar("Tovar3",2));
        treeSet.add(new Tovar("Tovar3",4));

        for (Tovar t:treeSet) {
            System.out.println(t);
        }
        System.out.println();

        //2. В обратном порядке поставки

        Comparator<Tovar> comparator = new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                int nameDiff = o1.name.compareTo(o2.name);
                if(nameDiff==0){
                    return 0;
                }else{
                    return o2.order - o1.order;
                }
            }
        };

        TreeSet<Tovar> treeSet1 = new TreeSet<>(comparator);
        treeSet1.addAll(treeSet);
        //treeSet1.add(new Tovar("Tovar3",4)); //не добавится

        for (Tovar t:treeSet1) {
            System.out.println(t);
        }


    }
}
