package homework.repository;

import java.util.ArrayList;
import java.util.List;

public class DataRepository<T extends Data> implements Function<T> {
    ArrayList<T> arr = new ArrayList<>();


    @Override
    public void add(T t) {
        arr.add(t);
    }

    @Override
    public void remove(T t) {
        arr.remove(t);
    }

    @Override
    public void remove(int index) {
        arr.remove(index);
    }

    @Override
    public T clone(int index) throws CloneNotSupportedException{
        T t = arr.get(index);
        return (T)t.clone();


    }
}
