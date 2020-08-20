package homework.concurrency.ex4;

import java.util.*;
import java.util.concurrent.*;

public class Main {
    volatile static int i = 0;
    public static void main(String[] args) {
        /*
        2. Создать список на 40 элементов, заполнить его числами в диапазоне от -20 до 20.
Создать три потока, которые одновременно будут удалять из списка элементы, которые меньше 0.
После завершения работы потоков в списке должны остаться только положительные элементы.
         */

        ArrayList<Integer> arrayList = new ArrayList<>();


        for (int i = 0; i <40 ; i++) {

            arrayList.add(ThreadLocalRandom.current().nextInt(-20, 20 + 1));
        }
        System.out.println(arrayList.toString());

        Thread thread1 = new Thread(() -> {
                for (int i = 0; i < arrayList.size(); i++) {
                    synchronized (Main.class) {
                        if (i<arrayList.size() && arrayList.get(i) < 0) {
                            arrayList.remove(i);
                            i--;
                        }
                    }
                }



        });
        Thread thread2 = new Thread(() -> {
                for (int i = 0; i < arrayList.size(); i++) {
                    synchronized (Main.class) {
                        if (i<arrayList.size() && arrayList.get(i) < 0) {

                            arrayList.remove(i);
                            i--;
                        }
                    }
                }



        });
        Thread thread3 = new Thread(() -> {
                for (int i = 0; i < arrayList.size(); i++) {
                    synchronized (Main.class) {
                        if (i<arrayList.size() && arrayList.get(i) < 0) {
                            arrayList.remove(i);
                            i--;
                        }
                    }
                }



        });
        thread1.start();
        thread2.start();
        thread3.start();
        arrayList.forEach(System.out::println);


    }



}
