package lesson.generics.ex4;

public class Rectangle implements Figure {
    double a;
    double b;
    private final String type = "Прямоугольник";

    public Rectangle(double a, double b) {

        this.a = a;
        this.b = b;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getSquare() {
        return a*b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", type='" + type + '\'' +
                '}';
    }
}
