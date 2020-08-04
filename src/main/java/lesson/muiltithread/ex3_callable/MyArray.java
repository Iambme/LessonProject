package lesson.muiltithread.ex3_callable;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class MyArray implements Callable<Integer> {
    int[] arr;

    public MyArray(int[] arr) {
        this.arr = arr;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        return Arrays.stream(arr).sum();
    }
}
