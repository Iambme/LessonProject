package lesson.collections.queue.ex1;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //Очередь - реализует принцип живой очереди или первый вошел - первый вышел
        //ArrayDeque - Обычная очередь
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(20);
        q.add(10);
        q.add(30);
        q.add(40);

        while(q.size()>0){
            System.out.println(q.poll());
        }


        System.out.println();
        //PriorityQueue - очередь с сортировкой
        PriorityQueue<Integer> q2 = new PriorityQueue<>();
        q2.add(20);
        q2.add(10);
        q2.add(30);
        q2.add(40);

        while(q2.size()>0)
        {
            System.out.println(q2.poll());
        }






    }
}
