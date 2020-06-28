package homework.phonebook;

import org.w3c.dom.ls.LSOutput;

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
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        ArrayList<String> ab1 = new ArrayList<>();
        ab1.add("89686655");
        ab1.add("89686677");
        ArrayList<String> ab2 = new ArrayList<>();
        ab2.add("89677755");
        ab2.add("89681111");
        ArrayList<String> ab3 = new ArrayList<>();
        ab3.add("89444655");
        ab3.add("89656677");


        phoneBook.put("Abonent1", ab1);
        phoneBook.put("Abonent2", ab2);
        phoneBook.put("Abonent3", ab3);

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
                    if (phoneBook.containsKey(abonent1)) {
                        System.out.println(phoneBook.get(abonent1));
                    } else {
                        System.out.println("Указанный абонент не найден в справочнике");
                    }

                    break;
                }
                case 2:
                    System.out.println("Введите имя абонента");
                    String abonent2 = reader.readLine();
                    if (phoneBook.containsKey(abonent2)) {
                        System.out.println("Введите номер абонента");
                        String number = reader.readLine();
                        phoneBook.get(abonent2).add(number);
                        System.out.println("Номер добавлен");
                    } else {
                        System.out.println("Указанный абонент не найден в справочнике");
                    }

                    break;
                case 3:
                    System.out.println("Введите имя абонента");
                    String abonent3 = reader.readLine();
                    if (phoneBook.containsKey(abonent3)) {
                        System.out.println("Введите индекс номера для удаления от 0 до" + (phoneBook.get(abonent3).size() -1));
                        int deleteNumber = Integer.parseInt(reader.readLine());
                        phoneBook.get(abonent3).remove(deleteNumber);
                    }
                    else {
                        System.out.println("Указанный абонент не найден в справочнике");
                    }
                    break;

                case 4:
                    System.out.println("Введите имя нового абонента");
                    String newAbonentName = reader.readLine();
                    System.out.println("Введите номер нового абонента");
                    String newAbonentNumber = reader.readLine();
                    phoneBook.put(newAbonentName,new ArrayList<String>());
                    phoneBook.get(newAbonentName).add(newAbonentNumber);
                    System.out.println("Новый абонент добавлен");
                    break;

                case 5:
                    Set<String> keys = phoneBook.keySet();
                    for (String element: keys) {
                        System.out.println(element + " " );
                    }
                    break;
                case 6:
                    Set<Map.Entry<String,ArrayList<String>>> values = phoneBook.entrySet();
                    for(Map.Entry<String, ArrayList<String>> val : values){
                        System.out.println(val.getKey()+" "+val.getValue());
                    }
                    break;
                case 7:
                    isOver = true;
                    break;
            }
        }
    }
}
