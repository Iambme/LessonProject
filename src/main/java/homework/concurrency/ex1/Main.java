package homework.concurrency.ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. Создать массив в мейне, далее создать два паралелльных потока.
        В одном из них сделать заполнение массивы любыми значениями.
        Заполнение значениями должно длиться не менее 3-х секунд (Thread.sleep(3)).
        Во втором дождаться заполнения и сделать поиск суммы его элементов, вывести сумму на консоль.
        Оба паралельных потока должны быть начаты одновременно.
         */
 ArrayList<Integer> arrayList  = new ArrayList<>();


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
                for (int i = 0; i <10 ; i++) {
                    arrayList.add(i*2);
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
                int sum = 0;
                for (Integer i: arrayList) {
                    sum+=i;
                }
                System.out.println(sum);
            }
        });

            thread1.start();
            thread1.join();
            thread2.start();


        System.out.println("e");
    }
}
