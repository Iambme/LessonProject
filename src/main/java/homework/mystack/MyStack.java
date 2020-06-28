package homework.mystack;

import java.util.Collection;

public class MyStack {
    private int[] arr = new int[2];
    private int currentIndex;

    public int size() {
        return currentIndex;
    }

    public boolean add(Integer integer) {
        if (currentIndex >= arr.length) {
            increaseArray();
        }
        arr[currentIndex++] = integer;
        return true;

    }

    private void increaseArray() {
        int[] newArr = new int[arr.length * 2];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    private void swapElementToLeft(int index) {
        int[] newArr = new int[arr.length - 1];
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }
        arr = newArr;
    }

    public Integer pop() {

        int val = arr[currentIndex-1];
        swapElementToLeft(currentIndex-1);
        currentIndex--;
        return val;

    }
    public Integer remove(int index) {
        if(index<size()) {
            int val = arr[index];
            swapElementToLeft(index);
            currentIndex--;
            return val;
        }
        throw new IndexOutOfBoundsException(index +" находится вне границ массива");
    }

    public boolean addAll(Collection<? extends Integer> c) {
        if (c != null) {
            for (Integer t : c) {
                add(t);
            }
            return true;
        }
        return false;
    }

}
