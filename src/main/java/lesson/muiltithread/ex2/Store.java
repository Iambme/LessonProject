package lesson.muiltithread.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Store {
    List<Tovar> storeList = new ArrayList<>();

    public void add(Tovar tovar){
        storeList.add(tovar);
    }
    public synchronized void remove(){
        if(storeList.size()>0) {
            int index = new Random().nextInt(storeList.size());
            System.out.println("Удаляем товар "+Thread.currentThread().getName()+" " + storeList.get(index));
            storeList.remove(index);
        }

    }
    public  void remove(int index){
        storeList.remove(index);

    }
}
