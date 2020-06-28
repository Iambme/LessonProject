package homework.Phone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhoneMenu {
    public static void main(String[] args) throws IOException {

        ArrayList<Phone> phoneList = new ArrayList<Phone>();

        Phone phone1 = new Phone("Samsung Galaxy", 16, 10, 699);
        Phone phone2 = new Phone("Samsung Galaxy", 16, 10, 699);
        Phone phone3 = new Phone("Iphone 6", 32, 12, 899);
        Phone phone4 = new Phone("Honor 10",50,18,599);

        phoneList.add(phone1);
        phoneList.add(phone2);
        phoneList.add(phone3);
        phoneList.add(phone4);

        System.out.println(phone1.equals(phone2));
        System.out.println(phone1.equals(phone3));
        System.out.println(phone1.toString());



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isOver = false;

        while (!isOver){

            System.out.println("\n  1. Добавить телефон\n 2. Удалить телефон\n 3. Проверить есть ли модель на складе \n 4. Вывести список телефонов \n 5. Отсортировать по цене\n 6. Выход ");
            String s = reader.readLine();
            int userInput = Integer.parseInt(s);
        switch (userInput) {

            case 1:
                System.out.println("Введите название модели, объем памяти, количество мегапикселей в камере и цену");

                String newName = reader.readLine();
                int newMemory = Integer.parseInt(reader.readLine());
                int newCamera = Integer.parseInt(reader.readLine());
                int newPrice = Integer.parseInt(reader.readLine());
                phoneList.add(new Phone(newName, newMemory, newCamera, newPrice));
                System.out.println("Телефон успешно добавлен в список");

                break;

            case 2:
                System.out.println("Введите название модели, объем памяти, количество мегапикселей в камере и цену");
                String delName = reader.readLine();

                int delMemory = Integer.parseInt(reader.readLine());
                int delCamera = Integer.parseInt(reader.readLine());
                int delPrice = Integer.parseInt(reader.readLine());
                removePhone(phoneList, delName, delMemory, delCamera, delPrice);
                break;

            case 3:
                Scanner scanner = new Scanner(System.in);
                String nameInput = scanner.nextLine();
                //phoneList.remove(new Phone())
                //phoneList.contains()
                doWeHaveIt(phoneList, nameInput);
                scanner.close();
                break;

            case 4:
                showPhoneList(phoneList);
                break;

            case 5:

                sortPhoneList(phoneList);
                showPhoneList(phoneList);
                break;

            case 6:
                isOver = true;
                break;
        }
        }
    }

    public static void showPhoneList(ArrayList<Phone> phoneArrayList) {
        for (Phone phone : phoneArrayList) {
            System.out.println(phone.toString());
        }
    }

    public static void doWeHaveIt(ArrayList<Phone> phoneArrayList, String name) {
        int count = 0;

        for (int i = 0; i < phoneArrayList.size(); i++) {
            if (phoneArrayList.get(i).getName().equals(name)) {
                count++;

            }
        }
        System.out.println("по вашему запросу найдено телефонов - " + count);

    }



    public static void removePhone(ArrayList<Phone> phoneArrayList, String name, int memory, double camera, double price) {

        for (int i = 0; i < phoneArrayList.size(); i++) {
            if (phoneArrayList.get(i).getName().equals(name) && phoneArrayList.get(i).getMemory() == memory && phoneArrayList.get(i).getCamera() == camera && phoneArrayList.get(i).getPrice() == price) {
                phoneArrayList.remove(i);
                System.out.println("Телефон успешно удалён из списка");
            }
        }
    }

    public static void sortPhoneList(ArrayList<Phone> phoneArrayList){
        Collections.sort(phoneArrayList);
    }
}
