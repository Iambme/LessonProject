package homework.streamAPI.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        1. Создать класс Book с полями имя автора и название книги.
        В мейне создать список или массив книг.
        Пользователь вводит с консоли имя автора, программа должна с помощью stream получить список его книг.
        После получения списка вывести его на консоль.
         */
        List<Book> books = Arrays.asList(new Book("Oscar Wild", "Dorian Grey"), new Book("Stephen King", "IT"), new Book("Stephen King", "11/23/79"));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userString = reader.readLine();

        List<Book> singleAuthorBooks = books.stream()
                .filter(book -> book.getAuthor().equals(userString))
                .collect(Collectors.toList());

        singleAuthorBooks.forEach(System.out::println);

        // 2. Создать список чисел в типе String. Найти сумму его элементов
        String[] arr = {"10", "20", "30"};
        int sum = Arrays.stream(arr)
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println(sum);
    }
}
