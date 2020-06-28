package lesson.collections.queue.ex2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        //Создать PriorityQueue на основе товаров на поставку
        //Для использования данной очереди класс Tovar должен реализовывать интерфейс Comparable или мы должны передатьв очередь
        //Comparator

        //1. Через Comparable
//        PriorityQueue<Tovar> priorityQueue = new PriorityQueue<>();
//        priorityQueue.add(new Tovar("tovar1", 2));
//        priorityQueue.add(new Tovar("tovar2", 0));
//        priorityQueue.add(new Tovar("tovar3", 1));
//
//        while(priorityQueue.size()>0){
//            System.out.println(priorityQueue.poll());
//        }

        //2. Через Comparator
        Comparator<Tovar2> comparator = new Comparator<Tovar2>() {
            @Override
            public int compare(Tovar2 o1, Tovar2 o2) {
                return o1.order-o2.order;
            }
        };
        PriorityQueue<Tovar2> priorityQueue = new PriorityQueue<>(comparator);
        priorityQueue.add(new Tovar2("tovar1", 2));
        priorityQueue.add(new Tovar2("tovar2", 0));
        priorityQueue.add(new Tovar2("tovar3", 1));
        priorityQueue.add(new Tovar2("tovar3", 4));

        while(priorityQueue.size()>0){
            System.out.println(priorityQueue.poll());
        }
    }
}
