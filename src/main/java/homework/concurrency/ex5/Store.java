package homework.concurrency.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Store implements Callable<Tovar> {
    private List<Tovar> tovars;

    public Store() {
        tovars = new ArrayList<>();
    }

    public List<Tovar> getTovars() {
        return tovars;
    }
    public void add(Tovar tovar){
        tovars.add(tovar);
    }

    @Override
    public Tovar call() {
        if(tovars.size()>0){
            return tovars.remove(0);

        }
        return null ;
    }
}
