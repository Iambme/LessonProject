package lesson.лямбда_выражения.ex2;

import lesson.лямбда_выражения.ex2.ICalc;

public class Main {
    public static void main(String[] args) {
        ICalc calcSum = new ICalc() {
            @Override
            public double calc(double a, double b) {
                return a+b;
            }
        };

        ICalc calcSum2 = (a,b)-> a+b; //краткая форма
        //расширенная форма
//        ICalc calcSum2 = (double a,double b)-> {
//            return a + b;
//        };

        ICalc calcSumByModul = (a,b)->Math.abs(a)+Math.abs(b);

        ICalc calcDivision = (a,b)->{
            if(b!=0){
                return a/b;
            }
            throw new ArithmeticException("b = 0");
        };


        System.out.println(calcSum.calc(2, 3));
        System.out.println(calcSum2.calc(2, 3));
    }
}


