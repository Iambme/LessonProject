package lesson.generics.ex4;

public class Circle implements Figure {
    double r;
    private final String type = "Круг";

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getSquare() {
        return r*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", type='" + type + '\'' +
                '}';
    }
}
