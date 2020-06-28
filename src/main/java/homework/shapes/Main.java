package homework.shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IRectangle> rectangles = new ArrayList<>();
        List<ICircle> circles = new ArrayList<>();
        ShapeService ss = new ShapeService();

        rectangles.add(new Rectangle(10, 8));
        rectangles.add(new Rectangle(25.5, 17));
        rectangles.add(new Square(10));
        rectangles.add(new Square(7));

        circles.add(new Circle(7));
        circles.add(new Circle(9));
        circles.add(new Circle(12));
        circles.add(new Circle(15));

        System.out.println(ss.calcCircleCircumference(circles));
        System.out.println(ss.calcCircleSquare(circles));
        System.out.println(ss.calcRecPerimetr(rectangles));
        System.out.println(ss.calcRecSquare(rectangles));


        List<Square> list = new ArrayList<>();
        list.add(new Line(10));
        ss.calcRecSquare(list);

    }
}
