package lesson.stringBuilder;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //StringBuilder

        /*
        Пользователь вводит с консоли n чисел, программа должна вывести их через StringBuilder в виде
        n1 - перове число
        n2
        n3
        n4 - четвертое число...
        ...

         */

        Scanner scn = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(4)+2; //от 2 до 5 включительно
        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i <n ; i++) {
            int userInput = scn.nextInt();
            sb1.append(userInput).append("\n");
        }

        System.out.println(sb1);


    }
}
