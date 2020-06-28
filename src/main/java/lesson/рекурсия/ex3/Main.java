package lesson.рекурсия.ex3;

public class Main {
    public static void main(String[] args) {
        //Найти факториал числа
        int val = 0;
        int fact = 1;
        //1 * 2 * 3 * 4 * 5
        for (int i = 1; i <= val && val>0; i++) {
            fact*=i;
        }
        System.out.println(fact);

        System.out.println();

        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
    }


    public static int factorial(int val){
        if(val>0) {
            return val * factorial(--val);
        }
        return 1;
    }

}
