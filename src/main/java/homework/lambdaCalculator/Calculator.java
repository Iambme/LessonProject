package homework.lambdaCalculator;

import java.util.Scanner;

public class Calculator {
    private double divide(double a, double b){
        if(b==0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return a / b;
    }
    public void calculate(){
        CalcConsumer calcSum = Double::sum;
        CalcConsumer calcMinus = (a, b) -> a - b;
        CalcConsumer calcMultiply = (a, b) -> a * b;
        CalcConsumer calcDivide = (a, b) -> divide(a,b);

        CalcService calcService = new CalcService();

        boolean isOver = false;
        while (!isOver) {
            calcService.start();
            System.out.println("Выберите действие:");
            System.out.println("1.Сложить");
            System.out.println("2.Вычесть");
            System.out.println("3.Умножить");
            System.out.println("4.Делить");
            System.out.println("5.Выход");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println(calcService.calc(calcSum));
                    break;
                case 2:
                    System.out.println(calcService.calc(calcMinus));
                    break;
                case 3:
                    System.out.println(calcService.calc(calcMultiply));
                    break;
                case 4:
                    try {
                        System.out.println(calcService.calc(calcDivide));
                    } catch (ArithmeticException e) {
                        System.out.println(e.toString());
                    }
                    break;
                case 5:
                    isOver = true;
                    break;
            }
        }
    }
}
