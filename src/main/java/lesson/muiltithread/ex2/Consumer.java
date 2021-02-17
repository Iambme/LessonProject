package lesson.muiltithread.ex2;

import java.util.Random;

public class Consumer implements Runnable{
    Store store;


    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {

        while (store.storeList.size()>0){

            //synchronized (store) {

//                if(store.storeList.size()>0) {
//                    int index = new Random().nextInt(store.storeList.size());
//                    System.out.println("Удаляем товар "+Thread.currentThread().getName()+" " + store.storeList.get(index));
//                    store.storeList.remove(index);
//                }
            //}
            //store.remove();
            remove();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //Синхронизация здесь не будет работать, если в мейне у потоков будут разные объекты класса Consumer
    private synchronized void remove(){
        if(store.storeList.size()>0) {
            int index = new Random().nextInt(store.storeList.size());
            System.out.println("Удаляем товар "+Thread.currentThread().getName()+" " + store.storeList.get(index));
            store.remove(index);
        }
    }
}
