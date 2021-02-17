package lesson.sql.ex2;

public class Owner {
    private int id;
    private String name;
    private Car car;
    private Passport passport;


    public Owner(int id, String name, Car car, Passport passport) {
        this.id = id;
        this.name = name;
        this.car = car;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", car=" + car +
                ", passport=" + passport +
                '}';
    }
}
