package homework.concurrency.ex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        /*
        3. Создать программу для мойки тарелок. Тарелки моются по принципу последний вошел - первый вышел.
         То есть последняя тарелка, находящаяся вверху стопки грязных тарелок,
         будет помыта первой, а первая тарелка, находящаася внизу, будет помыта последней.
        При этом в раковину могут добавляться новые тарелки.

Создать класс Plate(тарелка) с private полем
номер тарелки
Переопределить метод toString
Остальную структкру класса Plate дополнить по необходимости.

Создать класс DishWasher (мойщик посуды) с private полем в виде стэка
Создать метод startWash() - запускает мытье тарелок, добавленных в стек по принципу последний вошел - первый вышел.
Остальную структкру класса DishWasher дополнить по необходимости.

В мейне сгенерировать число m - начальное количество грязных тарелок и заполнить стэк гразными тарелками.
 Номера у тарелок должны быть в порядке их добавления в стопку.
Программа должна запустить процесс мойки тарелок в виде вывода текста на консоль "Тарелка № N помыта".
Также должна быть предусмотрена возможность добавления новых грязных тарелок в стэк
за счет ввода с консоли в процессе мойки (параллельно процессу мойки).
Новые добавленные тарелки должны быть помыты первыми за счет принципа последний вошел - первый вышел.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int random = ThreadLocalRandom.current().nextInt(2, 8);
        System.out.println(random);

        DishWasher dishWasher = new DishWasher();
        while (random > 0) {
            dishWasher.addPlate(new Plate());
            random--;
        }


        Thread thread = new Thread(() -> {
            try {
                while (!dishWasher.endWash()) {
                    System.out.println("Введите количество тарелок");
                    int countOfPlates = Integer.parseInt(reader.readLine());
                    while (countOfPlates > 0) {
                        dishWasher.addPlate(new Plate());
                        countOfPlates--;

                    }
                    System.out.println("Тарелки добавлены ");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        thread.start();
        dishWasher.startWash();

        thread.interrupt();
    }
}
