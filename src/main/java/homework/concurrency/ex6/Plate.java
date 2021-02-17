package homework.concurrency.ex6;

public class Plate {
    private int number;
    private static int count;

    public Plate() {
        this.number = ++count;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Тарелка " +
                "number= " + number +
                ' ';
    }
}
