package homework.optional.ex1;

public class Bill {
    private int id;
    private int sum;
    private String name;
    private static int count;

    public Bill(int sum, String name) {
        this.sum = sum;
        this.name = name;
        this.id = ++count;
    }

    public int getId() {
        return id;
    }


    public int getSum() {
        return sum;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", sum=" + sum +
                ", name='" + name + '\'' +
                '}';
    }

}
