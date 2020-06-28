package lesson.collections.iterator.practice1;

import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {
    private Object[] table = new Object[20];
    int size;

    public void add(T val) {
        table[size] = val;
        size++;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator() ;
    }

    private class MyIterator implements Iterator<T>{
        int currentIndex = 0;
        @Override
        public boolean hasNext() {
            return currentIndex<size;
        }

        @Override
        public T next() {
            return (T)table[currentIndex++];
        }
    }
}
