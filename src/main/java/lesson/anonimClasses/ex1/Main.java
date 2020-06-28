package lesson.anonimClasses.ex1;

public class Main {
    public static void main(String[] args) {
        //Анонимные классы позволяют создать объект на основе Интерфейсов, Абстрактных классов, Обычный классов
        ICalc sum = new ICalc() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        };
        AbstractCalc minus = new AbstractCalc() {
            @Override
            int calc(int a, int b) {
                return a-b;
            }
        };

        Student anStudent = new Student(){
            @Override
            public double getAverage() {
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i]>3){
                        sum+=arr[i];
                    }
                }
                return sum;
            }
        };

        double av = anStudent.getAverage();

        System.out.println(sum.calc(2, 3));


    }
}

class Student2 extends Student{
    @Override
    public double getAverage() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>3){
                sum+=arr[i];
            }
        }
        return sum;
    }
}
//
//class Minus implements ICalc{
//    @Override
//    public int calc(int a, int b) {
//        return a - b;
//    }
//}
//
//class Sum implements ICalc{
//
//    @Override
//    public int calc(int a, int b) {
//        return a+b;
//    }
//}





