package lesson.collections.iterator.ex2_myIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TovarDataBase implements Iterable<Tovar> {
    private List<Tovar> list = new ArrayList();

    public void add(Tovar t){
        list.add(t);
    }



    @Override
    public Iterator<Tovar> iterator() {
        return new MyIterator();
    }

    public Iterator<Tovar> itertorSortByPrice(){
        return new MyIteratorSortByPrice();
    }


    private class MyIteratorSortByPrice implements Iterator<Tovar>{
        int currentIndex = 0;
        {
            Collections.sort(list);
        }
        @Override
        public boolean hasNext() {
            return currentIndex<list.size();
        }

        @Override
        public Tovar next() {
            return list.get(currentIndex++);
        }
    }

    private class MyIterator implements Iterator<Tovar>{
        int currentIndex = 0;
        @Override
        public boolean hasNext() {
            return currentIndex<list.size();
        }

        @Override
        public Tovar next() {
            return list.get(currentIndex++);
        }
    }
}
