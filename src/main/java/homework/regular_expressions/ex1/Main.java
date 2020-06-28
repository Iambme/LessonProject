package homework.regular_expressions.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();



        boolean isOver = false;

        while (!isOver) {

            System.out.println("\n  1.Сохранить приветствие \n 2.Вывести все приветствия \n 3.Выход");
            int userInput = Integer.parseInt(reader.readLine());
            switch (userInput) {

                case 1:{
                    System.out.println("Введите приветствие ");
                    String str = reader.readLine();
                    String regex = "Hello, [A-ZА-Я][a-zа-я]+!";
                    if(str.matches(regex)){
                        list.add(str);
                    }
                    break;
                }
                case 2:{
                    if(!list.isEmpty()){
                        System.out.println(list);
                    }
                }
                break;
                case 3:{
                    isOver = true;
                }
            }

        }

    }
}
