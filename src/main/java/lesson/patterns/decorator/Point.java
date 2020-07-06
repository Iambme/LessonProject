package lesson.patterns.decorator;

public class Point implements Cloneable {
    String name;

    public Point(String name) {
        this.name = name;
    }

    @Override
    protected Point clone() throws CloneNotSupportedException {
        return (Point)super.clone();
    }

    @Override
    public String toString() {
        return name;
    }
}
