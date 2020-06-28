package homework.arrays;

import java.util.Random;
import java.util.Scanner;

public class WorkWithArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Введите размер массива");
        int size = scanner.nextInt();

        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(51);

        }


        for (int x : array
        ) {
            System.out.print(x + " ");
        }

        System.out.println();
        swapMinAndMax(array);
        System.out.println();
        sumBeforeMax(array);
        System.out.println();
        multiplyBeforeMin(array);
        System.out.println();

        int[] ocenki = new int[]{3,4,5,3,3,5,4};
        sredniyBal(ocenki);


    }

    public static void swapMinAndMax(int[] array) {
        int max = array[0];
        int min = array[0];
        int imax = 0;
        int imin = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                imax = i;
            }
        }


        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                imin = i;
            }

        }


        System.out.println("Минимальное значение : " + min);
        System.out.println("Максимальное значение : " + max);

        array[imax] = min;
        array[imin] = max;
        for (int x : array
        ) {
            System.out.print(x + " ");
        }
    }

    public static void sumBeforeMax(int[] array) {
        int max = array[0];

        int imax = 0;

        int sum = 0;


        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                imax = i;
            }
        }

        for (int i = 0; i < imax; i++) {
            sum += array[i];

        }
        System.out.println("Сумма элементов до максимального значения : " + sum);


    }

    public static void multiplyBeforeMin(int[] array) {
        int min = array[0];

        int imin = 0;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                imin = i;
            }

        }

        for (int i = 0; i < imin; i++) {
            array[i] = array[i] * 2;
        }
        System.out.print("Увеличиваем элементы до минимального значения вдвое :");
        for (int x : array
        ) {
            System.out.print( x + " ");
        }
    }

    public static void sredniyBal(int[] array){
        double sum = 0;

        for (int i = 0; i <array.length ; i++) {
            sum += array[i] ;
        }
        System.out.println("Средний бал : "+sum/array.length);

    }
}

