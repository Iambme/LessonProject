package homework.sql.ex1;

import com.mysql.cj.exceptions.ConnectionIsClosedException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Main {
    static Connection connection;

    public static void main(String[] args) throws SQLException, IOException {
        /*
        Создать таблицы user - соц профиль (один к одному)
создать таблицу pet (питомец) . Отношение user и питомец один ко многим.
В java реализовать меню:
1. Добавить юзера
2. Добавить юзеру питомца
3. Создать юезру профиль в соц сети
4. Вывести логин юзера (пользователь вводит имя юзера, программа выводит его логин в соц сети)
5. Вывести всех питомцев юзера
6. Выход
         */

        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lesson?serverTimezone=UTC", "root", "BEtlF0G23780");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int val;

        boolean isOver = false;

        while (!isOver) {
            System.out.println("Выберите действие :\n" +
                    "1. Добавить юзера\n" +
                    "2. Добавить юзеру питомца\n" +
                    "3. Создать юезру профиль в соц сети\n" +
                    "4. Вывести логин юзера (пользователь вводит имя юзера, программа выводит его логин в соц сети)\n" +
                    "5. Вывести всех питомцев юзера\n" +
                    "6. Выход");
            int userInput = Integer.parseInt(reader.readLine());
            switch (userInput) {
                case 1: {
                    String SQL = "INSERT INTO lesson.user (login, password) VALUES(?,?)";
                    PreparedStatement stmt = connection.prepareStatement(SQL);
                    System.out.println("Введите логин ");
                    stmt.setString(1, reader.readLine());
                    System.out.println("Введите пароль ");
                    stmt.setString(2, reader.readLine());
                    val = stmt.executeUpdate();
                    if (val == 1) {
                        System.out.println("User добавлен");
                    } else {
                        System.out.println("что-то пошло не так");
                    }
                }
                break;
                case 2: {
                    String SQL = "INSERT INTO lesson.pet (kind,name,user_id) VALUES (?,?,?)";
                    PreparedStatement stmt = connection.prepareStatement(SQL);

                    System.out.println("Введите вид питомца");
                    stmt.setString(1, reader.readLine());
                    System.out.println("Введите имя питомца");
                    stmt.setString(2, reader.readLine());
                    System.out.println("Введите id userа");
                    stmt.setInt(3, Integer.parseInt(reader.readLine()));
                    val = stmt.executeUpdate();
                    if (val == 1) {
                        System.out.println("у юзера появился новый питомец");
                    } else {
                        System.out.println("что-то пошло не так");
                    }

                }
                break;
                case 3: {
                    connection.setAutoCommit(false);
                    try {
                        String SQL = "INSERT INTO lesson.social_profile (name) VALUES (?)";
                        PreparedStatement stmt = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
                        System.out.println("Укажите id юзера которому будем создавать профиль в соцсети");
                        String userid = reader.readLine();
                        long profileId = -1;

                        System.out.println("Введите имя профиля соцсети");
                        stmt.setString(1, reader.readLine());
                        val = stmt.executeUpdate();
                        if (val == 1) {
                            System.out.println("профиль соцсети создан");
                            ResultSet generatedKeys = stmt.getGeneratedKeys();
                            if (generatedKeys.next()) {
                                profileId = generatedKeys.getLong(1);
                                System.out.println(profileId);
                            }
                        } else {
                            System.out.println("что-то пошло не так");
                        }
                        String SQL2 = "UPDATE lesson.user SET profile_id = " + profileId + " WHERE id = " + userid;
                        PreparedStatement statement = connection.prepareStatement(SQL2);
                        val = statement.executeUpdate();
                        if (val == 1) {
                            System.out.println("у юзера c id " + userid + "появилась соцсеть");
                        } else {
                            System.out.println("что-то пошло не так");
                        }
                        connection.commit();
                    } catch (Exception e) {
                        e.printStackTrace();
                        connection.rollback();
                    }
                    connection.setAutoCommit(true);
                }
                break;

                case 4: {
                    System.out.println("Введите логин юзера");
                    String SQL = "SELECT * FROM lesson.user WHERE login = ?";
                    PreparedStatement statement = connection.prepareStatement(SQL);
                    statement.setString(1, reader.readLine());
                    ResultSet rs = statement.executeQuery();
                    String SQL2 = "SELECT name FROM lesson.social_profile WHERE id = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(SQL2);
                    ResultSet resultSet;
                    int profile_id;
                    while (rs.next()) {
                        profile_id = rs.getInt("profile_id");
                        preparedStatement.setInt(1, profile_id);
                        resultSet = preparedStatement.executeQuery();
                        while (resultSet.next()) {
                            System.out.println(resultSet.getString("name"));
                        }
                    }

                }
                break;

                case 5: {
                    System.out.println("Введите id usera");
                    String SQL = "SELECT * FROM lesson.pet WHERE user_id = ?";
                    PreparedStatement statement = connection.prepareStatement(SQL);
                    statement.setInt(1, Integer.parseInt(reader.readLine()));
                    ResultSet rs = statement.executeQuery();
                    while (rs.next()) {
                        System.out.println(rs.getString("kind") + " " + rs.getString("name"));
                    }
                }
                break;
                case 6: {
                    isOver = true;
                }
                break;
            }
        }
    }
}
