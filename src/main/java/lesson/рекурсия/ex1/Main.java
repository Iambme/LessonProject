package lesson.рекурсия.ex1;

public class Main {
    public static void main(String[] args) {
        //Рекурсия - когда метод вызывает сам себя

        //Вывести числа от 0 до 10 через рекурсию
        for (int i = 0; i< 10; i++) {
            System.out.println(i);
        }
        System.out.println();
        printDigits(0);
    }

    public static void printDigits(int digit){
        if(digit<10) {
            System.out.println(digit);
            printDigits(digit + 1);
        }
    }

}
