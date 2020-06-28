package homework.myArrayList;

import java.util.*;

public class MyArrayList implements List<String> {
    private String arr[] = new String[2];
    private int currentIndex;

    @Override
    public int size() {
        return currentIndex;
    }

    @Override
    public boolean isEmpty() {
        return currentIndex == 0;
    }

    @Override
    public boolean contains(Object anObject) {

        for (int i = 0; i <currentIndex ; i++) {
            if (arr[i].equals(anObject)) {

                return true;
            }
        }

        return false;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(String s) {
        if (currentIndex >= arr.length) {
            increaseArray();
        }
        arr[currentIndex++] = s;
        return true;

    }

    private void increaseArray() {
        String[] newArr = new String[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }


    @Override
    public boolean remove(Object o) {
        for (int i = 0; i <currentIndex ; i++) {
            if (arr[i].equals(o)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        if (c != null) {
            for (String t : c) {
                add(t);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
//        for (int i = 0; i <currentIndex ; i++) {
//            remove(i);
//        }
//        remove(0);

        arr = new String[2];

        currentIndex = 0;
    }

    @Override
    public boolean equals(Object o) {

        return false;
    }

    @Override
    public String get(int index) {
        if (index < size()) {
            return arr[index];
        }
        throw new IndexOutOfBoundsException(index + " находится вне границ массива");
    }


    @Override
    public String set(int index, String element) {
        if(index>currentIndex || index<0){
            throw new IndexOutOfBoundsException("Выход за пределы массива");

        }
        arr[index] = element;
        return element;
    }

    @Override
    public void add(int index, String element) {

    }

    @Override
    public String remove(int index) {
        if (index < size()) {
            String val = arr[index];
            swapElementToLeft(index);
            currentIndex--;
            return val;
        }
        throw new IndexOutOfBoundsException(index + " находится вне границ массива");
    }

    private void swapElementToLeft(int index) {
        String[] newArr = new String[arr.length - 1];
        //System.arrayCopy???
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }
        arr = newArr;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<String> listIterator() {
        return null;
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return null;
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return null;
    }
}