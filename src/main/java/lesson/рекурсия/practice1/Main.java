package lesson.рекурсия.practice1;

public class Main {
    public static void main(String[] args) {
        //Вывести элементы массива через рекурсию
        int[] arr = {12,4,1,5};
        printArray(arr,0);
        System.out.println("end");

    }

    public static void printArray(int[] arr, int i){
        if(i<arr.length) {
            System.out.println(arr[i]);
            //12 4 1 5
            printArray(arr, ++i);

        }
    }
}
