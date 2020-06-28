package homework.TV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Tv tv = new Tv();
        Control control = new Control();

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
                case 1:
                    control.power(tv);
                    break;
                case 2:
                    System.out.println("Выберите канал от 1 до 10");
                    int ui = Integer.parseInt(reader.readLine());
                    try {
                        control.setChannel(tv, ui);
                    }
                    catch (IndexOutOfBoundsException e){
                        e.printStackTrace();

                    }
                    break;
                case 3:
                    control.switchPrevChannel(tv);
                    break;

                case 4:
                    control.switchNextChannel(tv);
                    break;

                case 5: isOver = true;
                break;
            }
        }
    }
}
