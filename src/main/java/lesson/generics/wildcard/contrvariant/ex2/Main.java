package lesson.generics.wildcard.contrvariant.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1. Написать метод, фильтрующий дробные числа ниже 0.5 и замеющий эти числа на целое число 100
//        List<Integer> list = new ArrayList<>();
//        list.addAll(Arrays.asList(10, 20, -1, 30));
//        filterInteger(list); //error
//        print(list);

        //коллекция суперкласса

//        Number n = 2.3;
//        System.out.println(n instanceof Number);
//        System.out.println(n instanceof Double);

        List<Number> listNum = new ArrayList<>();
        listNum.addAll(Arrays.asList(10d, 20d, -1d, 30d));
        filterInteger(listNum);
        print(listNum);

        //Object
        List listObj = new ArrayList<>();
        listObj.addAll(Arrays.asList(10d, 20d, -1d, 30d));
        filterInteger(listObj);
        print(listObj);


        //Некорректные значения в Object
        List listObj2 = new ArrayList<>();
        listObj2.addAll(Arrays.asList("10", "20", "-1", "30"));
        filterInteger(listObj2); //error
        print(listObj2);


        List<Double> listDoub=new ArrayList<>();
        listDoub.addAll(Arrays.asList(10d, 20d, 0.4d, 0.9d));
        filterInteger(listDoub);
        print(listDoub);

    }




    public static void filterInteger(List<? super Double> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Number && list.get(i) instanceof Double) {
                Double val = (Double) list.get(i);
                if (val < 0.5) {
                    list.set(i, 100d);
                }
            }
        }
    }

    public static void print(List<?> list){
        for(Object ob : list){
            System.out.print(ob+" ");
        }
        System.out.println();
    }
}
