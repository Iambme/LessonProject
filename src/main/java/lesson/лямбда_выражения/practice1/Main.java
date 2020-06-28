package lesson.лямбда_выражения.practice1;

public class Main {
    public static void main(String[] args) {
        //Создать функциональный интерфейс, который принимает объект Rectangle и что-то делает,
        // то есть тип возвращаемого значения void
//НАписать лямбду, выводящую стороны и лямбду, выводящую площадь
        Rectangle rectangle = new Rectangle(2,3);
        Rectangle rectangle2 = new Rectangle(2,4);

        RectangleConsumer rectangleConsumer = (rec)-> System.out.println(rec.a+ " "+rec.b);
        rectangleConsumer.consume(rectangle);

        RectangleConsumer rectangleConsumer1= rec -> System.out.println(rec.a*rec.b);
        rectangleConsumer1.consume(rectangle);


        //Создать функ. интерфейс с методом, принимающий два объекта класса Rectange и возвращающий наибольший из ни по площади
        RectangleConsumer2 rectangleConsumer2 = (rec1, rec2) -> rec1.a*rec1.b>rec2.a*rec2.b? rec1 : rec2;

        System.out.println(rectangleConsumer2.consume(rectangle, rectangle2));


        //Создать функ. интерфейс с методом, принимающий два объекта класса Rectange и
        // возвращающий наибольший из них по площади или выбрасывающий исключение RectangleEqualException, если они равны
        RectangleConsumer2 rectangleConsumer3 = (rec1, rec2)-> {
            int sqr1 = rec1.a*rec1.b;
            int sqr2 = rec2.a*rec2.b;
            if(sqr1==sqr2){
              throw new RectangleEqualException("Площади равны");
            }


            return sqr1>sqr2?rec1:rec2;
        };
        rectangleConsumer3.consume(rectangle,rectangle2);

        //Эта же лямбда, но через метод
        //RectangleConsumer2 rectangleConsumer4 = (rec1, rec2)-> getMaxRec(rec1, rec2);
        //эта же лямбда, но переданная через параметр в метод
        consumeLyambda((rec1, rec2)-> getMaxRec(rec1, rec2), rectangle, rectangle2);

    }

    public static Rectangle getMaxRec(Rectangle rec1, Rectangle rec2){
        int sqr1 = rec1.a*rec1.b;
        int sqr2 = rec2.a*rec2.b;
        if(sqr1==sqr2){
            throw new RectangleEqualException("Площади равны");
        }


        return sqr1>sqr2?rec1:rec2;
    }

    public static void consumeLyambda(RectangleConsumer2 rectangleConsumer2, Rectangle rec1, Rectangle rec2){
        System.out.println(rectangleConsumer2.consume(rec1, rec2));
    }
}
