package homework.reflection;

import homework.io.ex3.MyReader;
import homework.io.ex3.MyReaderWriterService;
import homework.io.ex3.MyWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Service {
    /*
Создать методы:
создать заказ
добавить блюдо в клиентский заказ
посчитать стоимость клиентского заказа
выдать клиенту чек (выводит на консоль список заказанных блюд, их стоимость и общую сумму)

В мейне создать меню:
1. Создать заказ (пользователь вводит свое имя)
2. Добавить заказ клиенту (пользователь вводит свое имя и желаемое блюдо)
3. Расчитать клиента (выводится чек и заказ удаляется из системы)
4. Вывести всех нерасчитанных клиентов (выводятся имя и номер клиентов, которые еще не рассчитались)


В мейне все объекты классов создавать через reflection, методы этих объектов также вызывать через reflection.
Создать JUnit тесты для методов из класса Service: создание заказа, добавление блюда в заказ и подсчет стоимости заказа.
     */
    private Map<Client, Order> orderMap = new HashMap<>();


    public void go() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isOver = false;

        while (!isOver) {
            System.out.println("\n");
            System.out.println("Выберите действие :");
            System.out.println("1.Создать заказ");
            System.out.println("2.Добавить заказ клиенту");
            System.out.println("3.Расчитать клиента");
            System.out.println("4.Вывести всех нерасчитаных клиентов");
            System.out.println("5.Выход");
            int userInput = Integer.parseInt(reader.readLine());
            switch (userInput) {
                case 1: {
                    System.out.println("Введите имя");
                    String name = reader.readLine();
                    createClient(name);


                }
                break;
                case 2: {
                    System.out.println("Введите имя");
                    String name = reader.readLine();
                    createOrder(name);
                }

                break;
                case 3: {
                    System.out.println("Введите имя");
                    String name = reader.readLine();
                    check(new Client(name));
                }
                break;

                case 4: {
                    System.out.println("Ещё не расчитались");
                    for (Map.Entry<Client, Order> entry : orderMap.entrySet()) {
                        System.out.println(entry.getKey().getName() + " номер заказа " + entry.getKey().getNumber());//рефлексия
                    }
                }
                break;

                case 5:
                    isOver = true;
                    break;
            }
        }

    }

    private int sumOfPrice(Map<Client, Order> orderMap, Client client) {
        return orderMap.get(client).orderSum();
    }

    private void check(Client client) {
        System.out.println(sumOfPrice(orderMap, client));
        orderMap.remove(client);
        System.out.println(client.toString() + " рассчитан");

    }

    private void createClient(String name) throws Exception {//возвращает булеан
        Class<Client> clientClass = Client.class;
        Client client = (Client) clientClass.getDeclaredConstructor(String.class).newInstance(name);

        Class<Order> orderClass = Order.class;
        Order order = (Order) orderClass.getDeclaredConstructor().newInstance();
        orderMap.put(client, order);
        System.out.println("Заказ создан, ваш номер " + client.getNumber());
    }

    private Dish createDish(int arg) throws Exception {
        Class<Dish> dishClass = Dish.class;
        switch (arg) {
            case 1: {
                return (Dish) dishClass.getDeclaredConstructor(String.class, int.class).newInstance("Суп с фрикадельками", 50);

            }
            case 2: {
                return (Dish) dishClass.getDeclaredConstructor(String.class, int.class).newInstance("Котлетки с пюрешкой", 70);
            }
            case 3: {
                return (Dish) dishClass.getDeclaredConstructor(String.class, int.class).newInstance("Маффин", 20);
            }
        }
        throw new IllegalArgumentException("Данной позиции нет в меню");
    }

    private void createOrder(String name) throws Exception {//возвращает булеан
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Class<Client> clientClass = Client.class;
        Client client = (Client) clientClass.getDeclaredConstructor(String.class).newInstance(name);

        int userInput = 0;
        while (userInput != 4) {
            System.out.println("Выберите блюда");
            System.out.println("1.Суп с фрикадельками");
            System.out.println("2.Котлетки с пюрешкой");
            System.out.println("3.Маффин");
            System.out.println("4.Выход");
            userInput = Integer.parseInt(reader.readLine());
            if (userInput != 4) {
                orderMap.get(client).add(createDish(userInput));//рефлексия
                System.out.println("Блюдо добавлено");
            }
            System.out.println(orderMap.get(client));
            System.out.println(sumOfPrice(orderMap, client));


        }

    }

    @Override
    public String toString() {
        return "Service{" +
                "orderMap=" + orderMap +
                '}';
    }
}

