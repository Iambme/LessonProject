package homework.shapes;

public class Rectangle extends Shape implements IRectangle{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(double side){
        this(side, side);
    }
    public Rectangle(){}

    @Override
    public double sqr() {
        return width*height;
    }

    @Override
    public double perimetr() {
        return width+height;
    }
}
