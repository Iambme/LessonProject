package lesson.stream.practice1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Создать любым способом двумерный массив из целых чисел, с помощью stream найти количество строк массива,
        в которых сумма их элементов больше 10
         */

//        int[][] arr = {
//                {2,1,8}, //11
//                {2,1,3}, //6
//                {9,10,5} //24
//        };
        //Должно получить 2
//        long count = Arrays.stream(arr)
//                .map(array -> Arrays.stream(array).sum())
//                .filter(val->val>10)
//                .count();
//        System.out.println(count);


        //тоже самое, только числа в типе String
        String[][] arr = {
                {"2", "1ы", "8"}, //11
                {"2d", "1", "3ass"}, //6
                {"9f", "10", "5"} //24
        };
        long count = Arrays.stream(arr)
                .map(array -> Arrays.stream(array).mapToInt(x -> Integer.parseInt(x.replaceAll("[^0-9]", ""))).sum()) //Stream<Integer>
                .filter(val -> val > 10)
                .count();
        System.out.println(count);
//
//        long count = Arrays.stream(arr)
//                .map(array -> Arrays.stream(array).mapToInt(Integer::parseInt).sum()) //Stream<Integer>
//                .filter(val->val>10)
//                .count();
//
//        System.out.println(count);
    }
}
