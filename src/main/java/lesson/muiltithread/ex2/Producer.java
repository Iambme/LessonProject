package lesson.muiltithread.ex2;

import java.util.List;

public class Producer implements Runnable {
    List<Tovar> list;
    Store store;
    public Producer(List<Tovar> tovarList,Store store) {
        list = tovarList;
        this.store = store;
    }

    @Override
    public void run() {
        while (list.size() > 0) {
            Tovar t = list.remove(0);
            System.out.println("Добавялем товар "+t);
            store.add(t);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
