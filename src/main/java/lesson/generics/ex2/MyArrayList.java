package lesson.generics.ex2;

import java.util.Arrays;

//
public class MyArrayList<T> {
    private Object[] arr = new Object[10];
    private int currentIndex;

    public void add(T val) {
        if (currentIndex >= arr.length) {
            increaseArray();
        }
        arr[currentIndex++] = val;
    }

    private void increaseArray() {
        Object[] newArr = new Object[arr.length * 2];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    public T get(int index) {
        return (T) arr[index];
    }

    public int size() {
        return currentIndex;
    }

    private void swapElementToLeft(int index) {
        Object[] newArr = new Object[arr.length - 1];
        int newIndex = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (i != index) {
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }
        arr = newArr;
    }


    public void remove(int index) {
        if (index < size()) {
            Object val = arr[index];
            swapElementToLeft(index);
            currentIndex--;
        }
        throw new IndexOutOfBoundsException(index + " находится вне граниз массива");
    }

//    public T sum(){
//        T val1 = (T)arr[0];
//        T val2 = (T)arr[1];
//        double a = val1.doubleValue();
//        double b = val2.doubleValue();
//        Object res = (a+b);
//        return (T)res;
//    }


}
