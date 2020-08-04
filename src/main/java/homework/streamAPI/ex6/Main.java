package homework.streamAPI.ex6;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        3. Создать класс Book с полями цена, название, автор.
Создать класс Library со списком книг.
Заполнить список значениями.

В мейне создать консольное меню:
1. Вывести все книги из библиотеки (выводится полная информация)
2. Вывести все книги одного автора (пользователь вводит автора с консоли)
3. Найти самую дорогую книгу и вывести информацию о ней на консоль
4. Вывести книги, чья цена не дороже 100
5. Выход

Все пункты меню должны выполняться с использованием stream.
         */

        Library library = new Library();
        library.getBooks().add(new Book("IT","Stephen King",120));
        library.getBooks().add(new Book("SomeBook","SomeAuthor",90));
        library.getBooks().add(new Book("Dumb","Dostoevsky",110));
        library.getBooks().add(new Book("Dorian Gray","Oscar Wild",99));
        library.getBooks().add(new Book("LOTR","Tolkien",150));

        Service.go(library);
    }
}
