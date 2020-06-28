package lesson.generics.ex4;

public class Main {
    public static void main(String[] args) {
        //Написать репозиторий с методами

        GenericFigure<Figure> fig = new GenericFigure<>();

        fig.add(new Rectangle(12,3));
        fig.add(new Circle(10));

        Figure maxFigure = fig.max();

        System.out.println(maxFigure.getType()+" "+maxFigure);

//        String name = "Ivan";
//        String surname = "Ivanov";
//        String secondName = "Ivanovich";

//        String str = String.format("Имя: %s, Фамилия: %s, Отчество: %s", name, surname, secondName);
//        System.out.println(str);
//
//        System.out.printf("Имя: %s, Фамилия: %s, Отчество: %s", name, surname, secondName);

    }
}
