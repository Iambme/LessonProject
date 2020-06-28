package lesson.anonimClasses.practice1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    //У нас есть игра, в которой у персонажей есть разные виду атак. Сделать класс атаки в виде интерфейса Attack и создать 3 вида атаки
    //для трех отдельных персонажей
    public static void main(String[] args) {
        Person mage = new Person("mage");
        Person warrior = new Person("wrrior");
        Person cliric = new Person("cliric");

        mage.attack = new Attack() {
            @Override
            public int makeAttack() {
                return (int)Math.random()*10+10;
            }
        };
        warrior.attack = new Attack() {
            @Override
            public int makeAttack() {
                System.out.println("Введите атаку воина");
                return new Scanner(System.in).nextInt();
            }
        };
        cliric.attack = new Attack() {
            @Override
            public int makeAttack() {
                return -15;
            }
        };

        mage.makeAttack(warrior);
        warrior.makeAttack(mage);
        cliric.makeAttack(mage);
        cliric.makeAttack(warrior);


    }


}
