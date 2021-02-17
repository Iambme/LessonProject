package lesson.ссылки_на_методы.ex1;

public class Main {
    public static void main(String[] args) {
        //Consumer consumer = (a,b)->a-b;
        Consumer consumer = (a,b)->Calculator.minus(a,b);
        System.out.println(consumer.consume(2, 3));


        Consumer consumer1 = Calculator::minus;
        System.out.println(consumer1.consume(2, 3));
    }
}

class Calculator{
    int a,b;

    public static double sum(double a, double b){
        return a+b;
    }

    public static double minus(double a, double b){
        return a-b;
    }
}


interface Consumer{
    double consume(double a, double b);
}

