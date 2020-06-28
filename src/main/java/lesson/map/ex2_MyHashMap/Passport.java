package lesson.map.ex2_MyHashMap;

import java.util.Objects;

public class Passport {
    String seria;
    String number;

    public Passport(String seria, String number) {
        this.seria = seria;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(seria, passport.seria) &&
                Objects.equals(number, passport.number);
    }

    @Override
    public int hashCode() {
        //return Objects.hash(seria, number);
        int first = seria.charAt(0);
        int last = number.charAt(0);
        return Objects.hash(first,last);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "seria='" + seria + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
