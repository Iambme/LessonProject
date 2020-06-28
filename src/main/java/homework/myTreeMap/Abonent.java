package homework.myTreeMap;

import java.util.Objects;

public class Abonent implements Comparable<Abonent>{
    private String name;

    public Abonent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abonent abonent = (Abonent) o;
        return Objects.equals(name, abonent.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Abonent{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Abonent o) {
        return name.compareTo(o.name);
    }
}
