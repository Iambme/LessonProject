package lesson.stream.ex6_flatMap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Вывести на консоль двумерный массив типа int
        int[][] arr  = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = (int)(Math.random()*10)+1;
            }
        }

        //Stream<Stream<Stream<String>>> -> Stream<Stream<String>>
        //Stream<Stream<String>> -> Stream<String>
        //Stream<String> -> String





        Arrays.stream(arr)
                .map(array -> Arrays.stream(array)) //Stream<int[]>->Stream<IntStream>
                .flatMapToInt(intStream->intStream)
                .forEach(System.out::println);

        System.out.println();
        Arrays.stream(arr)
                .flatMapToInt(array -> Arrays.stream(array)) //Stream<int[]>->IntStream
                .forEach(System.out::println);




    }
}
