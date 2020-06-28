package lesson.junit;

public class Calculator {
    public double sum(double a, double b){
        return a+b;
    }

    public double divide(double a, double b){
        if(b!=0) {
            return a / b;
        }
        return 0;
    }
}
