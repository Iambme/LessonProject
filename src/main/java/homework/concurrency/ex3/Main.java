package homework.concurrency.ex3;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
         Написать программу, где 3 параллельных потока будут имитировать пультр управления роботом,
         с каждого из которых одновременно посылаются разные команды: идти вперед, идти влево, идти вправо.

Создать класс Robot.
В классе создать методы
void goForward(int steps)
void goLeft(int steps)
void goRight(int steps)
steps - количество шагов в соответствующую сторону в виде случайного числа в диапазоне от 1 до 5

Каждый поток вызывает каждый раз только свой метод по 3 раза.
Каждое движение робота в ту или иную сторону занимает 1 секунду на каждый шаг, перед вызовом метода sleep нужно выводить "Робот идет в [вперед/влево/вправо]...".
 Также нужно выводить сколько шагов прошел робот. (пример ниже)

Вызвать все три потока в мейне. Правильным результатом работы программы будет вызов методов движения по очередно в любом порядке. То есть пока робот не закончит идти вперед, он не может начать идти в другую сторону.

Подсказка: у всех потоков общим ресурсом будет только объект класса Robot.

         */
        Robot robot = new Robot();

        Thread thread1 = new Thread(() -> {
            Random random = new Random();

            try {
                int i = 0;
                while(i<3){
                    synchronized (robot) {
                        robot.goForward(random.nextInt(5) + 1);
                        i++;
                    }
                    Thread.sleep(1);
                }

//                synchronized (robot) {
//                    robot.goForward(random.nextInt(5) + 1);
//                }
//                Thread.sleep(100);
//                synchronized (robot) {
//                    robot.goForward(random.nextInt(5) + 1);
//                }
//                Thread.sleep(100);
//                synchronized (robot) {
//                    robot.goForward(random.nextInt(5) + 1);
//                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        });
        Thread thread2 = new Thread(() -> {
            Random random = new Random();

            try {
                int i = 0;
                while(i<3){
                    synchronized (robot) {
                        robot.goLeft(random.nextInt(5) + 1);
                        i++;
                    }
                    Thread.sleep(1);
                }
//                synchronized (robot) {
//                    robot.goLeft(random.nextInt(5) + 1);
//                }
//                Thread.sleep(100);
//                synchronized (robot) {
//                    robot.goLeft(random.nextInt(5) + 1);
//                }
//                Thread.sleep(100);
//                synchronized (robot) {
//                    robot.goLeft(random.nextInt(5) + 1);
//                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        });
        Thread thread3 = new Thread(() -> {
            Random random = new Random();

            try {
                int i = 0;
                while(i<3){
                    synchronized (robot) {
                        robot.goRight(random.nextInt(5) + 1);
                        i++;
                    }
                    Thread.sleep(1);
                }
//                synchronized (robot) {
//                    robot.goRight(random.nextInt(5) + 1);
//                }
//                Thread.sleep(100);
//                synchronized (robot) {
//                    robot.goRight(random.nextInt(5) + 1);
//                }
//                Thread.sleep(100);
//                synchronized (robot) {
//                    robot.goRight(random.nextInt(5) + 1);
//                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        });

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
