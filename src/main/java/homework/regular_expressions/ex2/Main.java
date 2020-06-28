package homework.regular_expressions.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<User> list = new ArrayList<>();


        boolean isOver = false;

        while (!isOver) {

            System.out.println("\n  1.Сохранить пользователя \n 2.Вывести всех пользователей \n 3.Выход");
            int userInput = Integer.parseInt(reader.readLine());
            switch (userInput) {

                case 1: {
                    System.out.println("Введите имя ");
                    String userInputName = reader.readLine();
                    System.out.println("Введите возраст ");
                    String userInputAge = reader.readLine();
                    System.out.println("Введите дату рождения ");
                    String userInputBirth = reader.readLine();
                    String regexName = "[A-ZА-Я][a-zа-я]*";
                    String regexAge = "[0-9]|[1-9][0-9]|1[0-3][0-9]";
                    String regexBirth = "(0[1-9]|[1-2][0-9]|3[0-1])\\.(0[1-9]|1[0-2])\\.(19[0-9][0-9]|20[0-1][0-9]|2020)";
                    if (userInputName.matches(regexName)&&userInputAge.matches(regexAge)&&userInputBirth.matches(regexBirth)) {
                        list.add(new User(userInputName,Integer.parseInt(userInputAge),userInputBirth));
                    }
                    break;
                }
                case 2: {
                    if (!list.isEmpty()) {
                        System.out.println(list.toString());
                    }
                }
                break;
                case 3: {
                    isOver = true;
                }
            }
        }
    }
}
