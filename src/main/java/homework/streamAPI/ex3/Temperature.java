package homework.streamAPI.ex3;

import java.util.Objects;

public class Temperature {
    private double t ;

    public Temperature(double t) {
        this.t = t;
    }

    public double getT() {
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(that.t, t) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(t);
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "t=" + t +
                '}';
    }
}
