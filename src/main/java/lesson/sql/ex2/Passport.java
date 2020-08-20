package lesson.sql.ex2;

public class Passport {
    private int id;
    private int seria;
    private int number;

    public Passport(int id, int seria, int number) {
        this.id = id;
        this.seria = seria;
        this.number = number;
    }

    public Passport() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeria() {
        return seria;
    }

    public void setSeria(int seria) {
        this.seria = seria;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", seria=" + seria +
                ", number=" + number +
                '}';
    }
}
