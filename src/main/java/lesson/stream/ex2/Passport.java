package lesson.stream.ex2;

public class Passport {
    private long serial;
    private long number;
    private String country;

    public Passport(long serial, String country, long number) {
        this.serial = serial;
        this.country = country;
        this.number = number;
    }

    public long getSerial() {
        return serial;
    }

    public String getCountry() {
        return country;
    }

    public long getNumber() {
        return number;
    }
}
