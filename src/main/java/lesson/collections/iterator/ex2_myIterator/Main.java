package lesson.collections.iterator.ex2_myIterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        TovarDataBase tovars = new TovarDataBase();
        tovars.add(new Tovar("tovar1", 10));
        tovars.add(new Tovar("tovar3", 30));
        tovars.add(new Tovar("tovar2", 20));

//        Iterator<Tovar> iterator = tovars.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        Iterator<Tovar> iteratorSort = tovars.itertorSortByPrice();
        while(iteratorSort.hasNext()){
            System.out.println(iteratorSort.next());
        }
    }
}
