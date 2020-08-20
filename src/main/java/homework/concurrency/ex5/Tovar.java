package homework.concurrency.ex5;

public class Tovar {
    private int id;
    static int count;

    public Tovar() {
        this.id = ++count;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "id=" + id +
                '}';
    }
}
