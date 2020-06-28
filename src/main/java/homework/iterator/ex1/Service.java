package homework.iterator.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Service {
    public void service() throws IOException {
        Facebook facebook = new Facebook();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isOver = false;

        while (!isOver) {
            System.out.println("\n");
            System.out.println("Выберите действие :");
            System.out.println("1.Добавить контакт");
            System.out.println("2.Вывести все контакты");
            System.out.println("3.Удалить контакт");
            System.out.println("4.Редактировать контакт");
            System.out.println("5.Выход");
            int userInput = Integer.parseInt(reader.readLine());
            switch (userInput) {
                case 1: {
                    System.out.println("Введите имя");
                    String name = reader.readLine();
                    System.out.println("Введите email");
                    String mail = reader.readLine();
                    facebook.add(new Contact(name, mail));
                    System.out.println("Контакт добавлен");
                }
                break;
                case 2:
                    System.out.println(facebook.getList());
                    break;
                case 3: {
                    System.out.println("Введите имя");
                    String name = reader.readLine();
                    System.out.println("Введите email");
                    String mail = reader.readLine();
                    facebook.remove(new Contact(name, mail));

                }
                break;

                case 4: {
                    System.out.println("Индекс контакта для редактирования");
                    int index = Integer.parseInt(reader.readLine());
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Введите новое имя");
                    String name = scanner.nextLine();

                    System.out.println("Введите новый email");
                    String email = scanner.nextLine();
                    facebook.edit(index, new Contact(name, email));
                }

                break;

                case 5:
                    isOver = true;
                    break;
            }
        }
    }
}
