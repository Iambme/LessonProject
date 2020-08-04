package lesson.optional.ex2;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Создать переменную Tovar tovar. Вызывать у объекта метод print, если tovar не null. Сделать проверку через ifPresent
        Optional<Tovar> tovar = Optional.ofNullable(new Tovar("tovar1"));
        tovar.ifPresent(Tovar::print);

        //Создать переменную Tovar tovar. Вызывать у объекта метод print, если tovar не null,
        // иначе вывести на консоль текст "Объект не может быть null". Сделать с помощью ifPresent и ifPresentOrElse
        tovar.ifPresentOrElse(Tovar::print,()-> System.out.println("Объект не может быть null"));
    }
}


class Tovar{
    String name;

    public Tovar(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println(name);
    }
}