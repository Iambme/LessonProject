package lesson.hash_tables.ex3;

import java.util.Objects;

public class Tovar {
    String name;
    int price;

    public Tovar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                '}';
    }

    public int hashCode(){
        return Objects.hash(name, price);
    }

    public boolean equals(Object ob){
        Tovar t = (Tovar)ob;
        return name.equals(t.name);
    }
}
