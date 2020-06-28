package lesson.лямбда_выражения.ex3_глобальные_переменные;

import homework.tourism.TourType;

public class Main {
    static int b = 2;
    public static void main(String[] args) {
        //Написать через лямбду метод, который выводит значение глобальной переменной
        int a = 2;
        Calc calc = ()-> System.out.println(a);
        calc.consume();
        //То есть внутри лябды можно использовать глоабльные переменный относительно лямбды


        //Написать через лямбду метод, который увеличивает значение глобальной переменной в 2 раза и выводит ее на консоль
        //(то есть меняет значение глобальной переменной)
//        Calc calc2 = ()-> {
//            a = a * 2; //error В лямбде нельзя менять значение глобальных относительно лямбды перменных, если они не являются полем
//            System.out.println(a);
//        };
//        calc.consume();
//        a = a + 2; //тоже error по той же причине

        //переменная b является полем, поэтому ошибки нет
        Calc calc2 = ()-> {
            b = b * 2; //успешно изменится
            System.out.println(b);
        };
        calc2.consume();



        //Изменение полей глобального объекта в лямде, который создан внутри мейна (метода)
        Tovar t = new Tovar("tovar1", 100);
        Calc calc3 = ()-> {
            t.name = "tovar10"; //Успешно
            //t = new Tovar("t3", 29); //error, так как здесь попытка изменить объект, не являющийся полем класса
            System.out.println(t);
        };
        calc3.consume();

    }
}

interface Calc{
    void consume();
}

class Tovar{
    String name;
    int price;

    public Tovar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}