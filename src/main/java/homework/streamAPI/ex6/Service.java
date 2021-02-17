package homework.streamAPI.ex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class Service {
    public static void go(Library library) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isOver = false;

        while (!isOver) {
            System.out.println("\n");
            System.out.println("Выберите действие :");
            System.out.println("1.Вывести все книги из библиотеки (выводится полная информация)");
            System.out.println("2.Вывести все книги одного автора (пользователь вводит автора с консоли)");
            System.out.println("3.Найти самую дорогую книгу и вывести информацию о ней на консоль");
            System.out.println("4. Вывести книги, чья цена не дороже 100");
            System.out.println("5.Выход");
            int userInput = Integer.parseInt(reader.readLine());
            switch (userInput) {
                case 1: {
                    library.getBooks()
                            .forEach(System.out::println);
                }
                break;
                case 2: {
                    System.out.println("Введите автора");
                    String us = reader.readLine();
                    library.getBooks().stream()
                            .filter(x -> x.getAuthor().equals(us))
                            .forEach(System.out::println);
                }
                break;
                case 3: {
                    Optional<Book> op = library.getBooks().stream()
                            .max(Comparator.comparingInt(Book::getPrice));
                    op.ifPresent(System.out::println);
                }
                break;

                case 4: {

                    library.getBooks().stream()
                            .filter(x -> x.getPrice()<100)
                            .forEach(System.out::println);
                }
                break;

                case 5: {
                    isOver = true;
                }
                break;
            }
        }
    }
}
