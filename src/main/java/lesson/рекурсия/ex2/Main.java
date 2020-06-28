package lesson.рекурсия.ex2;

public class Main {
    public static void main(String[] args) {
        //рекрусивный метод с возвращаемым значением
        //Найти сумму элементов массива и вернуть в качестве результата
        int[] arr = {1,2,5};
        System.out.println(findSum(arr, 0));
    }

    public static int findSum(int[] arr, int i){
        if(i<arr.length) {
            return arr[i] + findSum(arr, ++i);
        }
        return 0;
    }
}
