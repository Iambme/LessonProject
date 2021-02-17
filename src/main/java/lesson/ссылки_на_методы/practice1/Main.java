package lesson.ссылки_на_методы.practice1;

public class Main {
    public static void main(String[] args) {
        //Создать объект на оснвое Consumer и реализовать:
        //Вычисление квадратного корня
        //Вычисления модуля числа

        Consumer sqr = Math::sqrt;
        System.out.println(sqr.consume(16));
        System.out.println(sqr.consume(-1));

        Consumer module = Math::abs;
        System.out.println(module.consume(-2));

    }
}


