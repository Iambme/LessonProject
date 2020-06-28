package homework.library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        Library<Film> filmLibrary = new Library<>();
        Library<Book> bookLibrary = new Library<>();

        bookLibrary.add(new Book("Aaa","xbbb"));
        bookLibrary.add(new Book("lla","vffb"));
        bookLibrary.add(new Book("zza","a3nnx"));

        filmLibrary.add(new Film("AAa", 1999));
        filmLibrary.add(new Film("bbb", 1956));
        filmLibrary.add(new Film("yyy", 2012));
        filmLibrary.add(new Film("xxx", 2020));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isOver = false;

        while (!isOver) {
            System.out.println("\n");
            System.out.println("Выберите действие :");
            System.out.println("1.Добавить фильм в библиотеку фильмов");
            System.out.println("2.Добавить книгу в библиотеку книг");
            System.out.println("3.Вывести книги в алфавитном порядке по названию книги");
            System.out.println("4.Вывести книги в алфавитном порядке по фамилии автора");
            System.out.println("5.Вывести фильмы в от самого нового к самому старому");
            System.out.println("6.Вывести фильмы от самого старого к самому новому");
            System.out.println("7.Выход");
            int userInput = Integer.parseInt(reader.readLine());
            switch (userInput) {
                case 1:
                    System.out.println("Введите название фильма");
                    String filmName = reader.readLine();
                    System.out.println("Введите год выпуска");
                    int year = Integer.parseInt(reader.readLine());
                    filmLibrary.add(new Film(filmName,year));
                    System.out.println("Фильм добавлен");
                    break;
                case 2:
                    System.out.println("Введите название книги");
                    String bookName = reader.readLine();
                    System.out.println("Введите имя автора");
                    String author = reader.readLine();
                    bookLibrary.add(new Book(bookName,author));
                    System.out.println("Книга добавлена");
                    break;
                case 3:
                    Collections.sort(bookLibrary.arr);
                    System.out.println(bookLibrary.arr);

                    break;

                case 4:
                    Comparator<Book> sortByAuthor = new Comparator<Book>() {
                        @Override
                        public int compare(Book o1, Book o2) {
                            return o1.getAuthor().compareTo(o2.getAuthor());
                        }
                    };
                    bookLibrary.arr.sort(sortByAuthor);
                    System.out.println(bookLibrary.arr);

                    break;

                case 5:
                    Comparator<Film> sortByNew = new Comparator<Film>() {
                        @Override
                        public int compare(Film o1, Film o2) {

                            return Integer.compare(o2.getYear(), o1.getYear());

                        }
                    };
                    filmLibrary.arr.sort(sortByNew);
                    System.out.println(filmLibrary.arr);
                    break;
                case 6:
                    Comparator<Film> sortByOld = new Comparator<Film>() {
                        @Override
                        public int compare(Film o1, Film o2) {

                            return Integer.compare(o1.getYear(), o2.getYear());

                        }
                    };
                    filmLibrary.arr.sort(sortByOld);
                    System.out.println(filmLibrary.arr);
                    break;
                case 7: isOver = true;
                    break;
            }
        }
    }
}
