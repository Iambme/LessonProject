package homework.lambdaCalculator;

import java.util.Scanner;

public class CalcService {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        setA(scanner.nextDouble());
        System.out.println("Введите число b");
        setB(scanner.nextDouble());
    }

    public double calc(CalcConsumer cc){
        return cc.accept(getA(),getB());
    }
}
