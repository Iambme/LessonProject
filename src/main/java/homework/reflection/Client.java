package homework.reflection;

import java.util.Objects;

public class Client {
    private String name;
    private int number;
    private static int ID;

    public Client(String name) {
        this.name = name;
        this.number = ++ID;
    }

    public String getName() {
        return name;
    }


    public int getNumber() {
        return number;
    }


    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
