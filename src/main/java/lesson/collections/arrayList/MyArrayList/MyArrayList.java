package lesson.collections.arrayList.MyArrayList;

import java.util.*;

public class MyArrayList implements List<Integer> {
    private int[] arr = new int[2];
    private int currentIndex;
    private int operCount;
    @Override
    public int size() {
        return currentIndex;
    }

    @Override
    public boolean isEmpty() {
        return currentIndex==0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
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
    public boolean add(Integer integer) {
        if(currentIndex>=arr.length){
            increaseArray();
        }
        arr[currentIndex++] = integer;
        return true;

    }

    private void increaseArray(){
        int[] newArr = new int[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }



    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
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

    }

    @Override
    public Integer get(int index) {
        if(index<size()){
            return arr[index];
        }
        throw new IndexOutOfBoundsException(index+" находится вне границ массива");
    }

    @Override
    public Integer set(int index, Integer element) {
        return null;
    }

    @Override
    public void add(int index, Integer element) {

    }

    public void printOperCount(){
        System.out.println("ArrayList operation Count = "+operCount);
    }
    //10 12 13 14
    //10 13 14
    //i = 4
    //newIndex = 3
    private void swapElementToLeft(int index){
        int[] newArr = new int[arr.length-1];
        int newIndex = 0;
        for (int i = 0; i <currentIndex; i++) {
            operCount++;
            if(i!=index){
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }
        arr = newArr;
    }
    @Override
    public Integer remove(int index) {
        if(index<size()) {
            int val = arr[index];
            swapElementToLeft(index);
            currentIndex--;
            return val;
        }
        throw new IndexOutOfBoundsException(index +" находится вне граниз массива");
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
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }



}
