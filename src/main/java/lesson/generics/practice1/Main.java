package lesson.generics.practice1;

public class Main {
    public static void main(String[] args) {
        //Написать дженерик калькулятор с методами sum и minus, который возвращают результат операции со своими
        //параметрами
        GenericCalculator<Integer> calc = new GenericCalculator<>(2,3);
        System.out.println(calc.minus());
        GenericCalculator<Double> calc2 = new GenericCalculator<>(2.4,3.0);
        System.out.println(calc2.minus());


    }
}
