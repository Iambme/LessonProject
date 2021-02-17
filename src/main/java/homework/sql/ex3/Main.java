package homework.sql.ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static Connection connection;
    public static void main(String[] args) throws SQLException {
    /*
    1. Создать в бд две таблицы книга и автора и реализовать отношение многие ко многим.
Извлечь с помощью оператора inner join всех авторов и их книги
С помощью left join извлечь всех авторов даже тех, у кого нет книг. Если у автора есть книги, они должны быть выведены.
С помощью right join вывести все книги и их авторов. Если у книги нет автора, она также должна быть выведена.
     */
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lesson?serverTimezone=UTC", "root", "BEtlF0G23780");
        String innerJoin = "select b.title, a.name from lesson.books b join lesson.books_authors ba on b.id = ba.book_id join lesson.authors a on a.id = ba.author_id";
        String leftJoin = "select b.title, a.name from lesson.books b right join lesson.books_authors ba on b.id = ba.book_id right join lesson.authors a on a.id = ba.author_id";
        String rightJoin = "select b.title, a.name from lesson.books b left join lesson.books_authors ba on b.id = ba.book_id left join lesson.authors a on a.id = ba.author_id";

        ResultSet rs = connection.createStatement().executeQuery(innerJoin);

        while (rs.next()){
            System.out.println(rs.getString(1) + " " + rs.getString(2));
        }
        System.out.println("*************");
        rs = connection.createStatement().executeQuery(leftJoin);
        while (rs.next()){
            System.out.println(rs.getString(1) + " " + rs.getString(2));
        }
        System.out.println("*************");
        rs = connection.createStatement().executeQuery(rightJoin);
        while (rs.next()){
            System.out.println(rs.getString(1) + " " + rs.getString(2));
        }
    }
}