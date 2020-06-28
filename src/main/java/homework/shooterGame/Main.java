package homework.shooterGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        int userInput=0;
        boolean incorrectInput = true;

        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount());

//        do {
//            while (true) {
//                userInput = scanner.nextInt();
//                if (userInput == -1) {
//                    System.out.println("Game Over!");
//                    incorrectInput = false;
//                    break;
//                } else {
//
//                    try {
//
//                        player.shotWithWeapon(userInput);
//                        incorrectInput = false;
//                    } catch (ArrayIndexOutOfBoundsException e) {
//                        System.out.println("Указан недопустимый слот");
//                    }
//                }
//            }
//        }
//        while (incorrectInput);
        while (userInput != -1) {
            userInput = scanner.nextInt();
            if (userInput == -1) {
                System.out.println("Game Over!");
            } else {
                try {
                    player.shotWithWeapon(userInput);
                } catch (Exception e) {
                    System.out.println(e);
                    //System.out.println("Указан недопустимый слот");
                }
            }
        }
        scanner.close();
    }

}


/*
Реализовать игру-шутер. У игрока должна быть возможность использовать разные виды оружия, в будущем в игру могут быть добавлены новые. Необходимо спроектировать иерархию классов, а также систему слотов для оружия у игрока.

Функционал программы
Создание объекта Player и добавление ему оружия;
Возможность выбора оружия для выстрела.
Процесс реализации
Создадим класс игрока и функцию main.
Класс Player содержит список оружия и метод "выстрелить"
class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
            // TODO заполнить слоты оружием
            // new BigGun(),
            // new WaterPistol()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // выбросить IllegalArgumentException,
        // если значение slot некорректно

        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }
}
Метод main
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
            + " введите номер, чтобы выстрелить,"
            + " -1 чтобы выйти%n",
            player.getSlotsCount()
        );
        int slot;

        // TODO главный цикл игры:
        // запрашивать номер с клавиатуры
        // с помощью scanner.nextInt(),
        // пока не будет введено -1

        System.out.println("Game over!");
}
Создадим классы для некоторых видов оружия.
Базовый класс для всех видов оружия
class Weapon {
    public void shot() {
        // TODO override me!
    }
}
Как "заставить" дочерний класс переопределить поведение некоторых методов базового класса, мы узнаем на следующей лекции.

Создадим дочерние классы:

Пистолет;
Автомат;
РПГ;
Рогатка;
Водный пистолет.
В каждом из дочерних классов переопределите метод shot(), чтобы он изменил поведение оружия в соответствии с его типом. Например, чтобы оно выводило в консоль соответствующие выстрелу звуки: Пив-Пав!.

Теперь можно вернуться к классу Player и создать по экземпляру каждого оружия.
Не забудьте разграничить классы по типу с помощью пакетов, например, все классы с оружием можно вынести в package weapon.


На следующем занятии разберем односвязный/двусвязный список и очередь
 */