package homework.phonebook2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Abonent, ArrayList<String>> phoneBook = new HashMap<>();
        ArrayList<String> ab1 = new ArrayList<>();
        ab1.add("89686655");
        ab1.add("89686677");
        ArrayList<String> ab2 = new ArrayList<>();
        ab2.add("89677755");
        ab2.add("89681111");
        ArrayList<String> ab3 = new ArrayList<>();
        ab3.add("89444655");
        ab3.add("89656677");


        phoneBook.put(new Abonent("Abonent1"), ab1);
        phoneBook.put(new Abonent("Abonent2"), ab2);
        phoneBook.put(new Abonent("Abonent3"), ab3);

        boolean isOver = false;

        while (!isOver) {
            System.out.println("\n");
            System.out.println("Выберите действие :");
            System.out.println("1.Вывести все номера абонента по его имени");
            System.out.println("2.Добавить номер абоненту");
            System.out.println("3.Удалить номер у абонента");
            System.out.println("4.Добавить нового абонента и номер");
            System.out.println("5.Вывести всех абонентов (без номеров)");
            System.out.println("6.Вывести всех абонентов и их номера");
            System.out.println("7.Выход");
            int userInput = Integer.parseInt(reader.readLine());
            switch (userInput) {
                case 1: {
                    System.out.println("Введите имя абонента");
                    String abonent1 = reader.readLine();

                    Abonent ab = new Abonent(abonent1);
                    if (phoneBook.containsKey(ab)) {
                        System.out.println(phoneBook.get(ab));
                    }

                }
                break;

                case 2: {
                    System.out.println("Введите имя абонента");
                    String abonent = reader.readLine();
                    Set<Abonent> keys1 = phoneBook.keySet();
                    Abonent ab = new Abonent(abonent);
                    if (phoneBook.containsKey(ab)) {
                        System.out.println("Введите номер абонента");
                        String number = reader.readLine();
                        phoneBook.get(ab).add(number);
                    }
                }
                break;

                case 3: {
                    System.out.println("Введите имя абонента");
                    String abonent = reader.readLine();
                    Abonent ab = new Abonent(abonent);

                    if (phoneBook.containsKey(ab)) {
                        System.out.println("Введите удаляемый номер");
                        String numberForRemove = reader.readLine();
                        phoneBook.get(ab).remove(numberForRemove);
                    }
                }
                break;

                case 4:
                    System.out.println("Введите имя нового абонента");
                    String newAbonentName = reader.readLine();
                    System.out.println("Введите номер нового абонента");
                    String newAbonentNumber = reader.readLine();
                    phoneBook.put(new Abonent(newAbonentName), new ArrayList<String>());
                    Abonent ab = new Abonent(newAbonentName);

                    if (phoneBook.containsKey(ab)) {
                        phoneBook.get(ab).add(newAbonentNumber);
                    }
                    System.out.println("Новый абонент добавлен");
                    break;

                case 5:
                    Set<Abonent> keys4 = phoneBook.keySet();
                    for (Abonent element : keys4) {
                        System.out.println(element.getName() + " ");
                    }
                    break;

                case 6:
                    Set<Map.Entry<Abonent, ArrayList<String>>> values = phoneBook.entrySet();
                    for (Map.Entry<Abonent, ArrayList<String>> val : values) {
                        System.out.println(val.getKey().getName() + " " + val.getValue());
                    }
                    break;

                case 7:
                    isOver = true;
                    break;
            }
        }
    }
}
