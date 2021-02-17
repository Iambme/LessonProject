package lesson.muiltithread.ex2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
        Создать многопоточную программу, имитирующую поставку и отправление товаров со склада. Поставлять товары на склад могут одновременно два грузовика.
Также забирать товары со склада могут одновременно два грузовика. (Грузовик - абстрактное понятие, под котором подразумевается поток, добавляющий или удаляющий товар из общего списка товаров).

Создать класс склад со список товаров. В мейне произвести начальное наполнение списка товарами.
Класс, который будет представлять поток, забирающий товары со склада назвать Consumer (потребитель), а класс, который будет представлять поток, поставляющий товары на склад, назвать Producer (поставщик)
Consumer выбирает товар, который будет забирать со склада, на основе случайного индекса в диапазоне от 0 до количества товаров на складе.

Таким образом в программе должно работать два потока класса Consumer и 2 потока класса Producer.
Consumer будет брать товары из коллекции склада, а для Producer нужно создать отдельную коллекцию товаров, из который Producer будет брать товары и поставлять их на склад.

ПРограмма должна работать до тех пор, пока на складе есть хотя бы один товар.
Проверить работу потоков путем вывода на консоль всех поставленных и отгруженных товаров с склада. Они не должны повторяться.
Продумать синхронизацию методов поставки и отгрузки товаров со склада. Должы ли они быть взаимно синхронизированными? Или же они должны работать свободно друг от друга?
         */

        Store store = new Store();
        List<Tovar> listForProducer = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listForProducer.add(new Tovar("tovar"+i));
        }


        new Thread(new Producer(listForProducer,store)).start();
        Thread.sleep(10);
//        new Thread( new Consumer(store)).start();
//        new Thread(new Consumer(store)).start();

        Consumer consumer = new Consumer(store);
        new Thread(consumer).start();
        new Thread(consumer).start();



    }
}