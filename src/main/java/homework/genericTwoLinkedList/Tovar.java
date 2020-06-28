package homework.genericTwoLinkedList;

public class Tovar {
    private String name;
    private double price;

    public Tovar(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public boolean equals(Object ob){
        Tovar t = (Tovar)ob;
        return name.equals(t.name);
    }
}
