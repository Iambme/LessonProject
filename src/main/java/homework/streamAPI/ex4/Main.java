package homework.streamAPI.ex4;

import lesson.stream.ex1.Tovar;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        /*
        . Создать класс Book с полями название книги и цена.
В мейне создать массив или список книг и заполнить его значениями.
С помощью одного stream найти самую дорогую книгу с помощью метода max и сохранить ее в переменную.
После нахождения вывести информацию о ней на консоль из переменной.
         */


        List<Book> list = Arrays.asList(new Book("Book1", 100),
                new Book("Book2", 300), new Book("Book3", 150));
        Optional<Book> op = list.stream().max(Comparator.comparingInt(Book::getPrice));
        op.ifPresent(System.out::println);
    }

}
