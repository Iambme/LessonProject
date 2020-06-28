package homework.shapes;

public class Circle extends Shape implements ICircle{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double sqr() {
        return Math.PI*radius*radius;
    }

    @Override
    public double circumference() {
        return 2*Math.PI*radius;
    }
}
