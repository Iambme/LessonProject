package lesson.stream.ex2;

public class Human {
    private Passport passport;
    private String name;

    public Human(Passport passport, String name) {
        this.passport = passport;
        this.name = name;
    }

    public Passport getPassport() {
        return passport;
    }

    public String getName() {
        return name;
    }
}
