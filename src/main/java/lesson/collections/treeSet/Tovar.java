package lesson.collections.treeSet;

import java.util.Objects;

public class Tovar implements Comparable<Tovar> {
    String name;
    int order;

    public Tovar(String name, int order) {
        this.name = name;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }

    @Override
    public int compareTo(Tovar o) {
        int nameDiff = name.compareTo(o.name);
        if(nameDiff==0){
            return 0;
        }else{
            return order - o.order;
        }

    }


    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
