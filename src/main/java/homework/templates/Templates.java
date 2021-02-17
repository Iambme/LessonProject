package homework.templates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Templates {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isOver = false;

        while (!isOver) {
            System.out.println("\n");
            System.out.println("Выберите действие :");
            System.out.println("1.Включить/Выключить телевизор.");
            System.out.println("2.Выбрать канал");
            System.out.println("3.Предыдущий канал");
            System.out.println("4.Следующий канал");
            System.out.println("5.Выход");
            int userInput = Integer.parseInt(reader.readLine());
            switch (userInput) {
                case 1: {
                }
                break;
                case 2: {


                }
                break;
                case 3: {

                }
                break;

                case 4: {
                }
                break;

                case 5: {
                    isOver = true;
                }
                break;
            }
        }
    }
}
