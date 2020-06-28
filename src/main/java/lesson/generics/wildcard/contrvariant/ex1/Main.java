package lesson.generics.wildcard.contrvariant.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1. Написать метод, фильтрующий целые числа ниже 0 и замеющий эти числа на целое число 100
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, -1, 30));
        filterInteger(list);
        print(list);

        //коллекция суперкласса
        List<Number> listNum = new ArrayList<>();
        listNum.addAll(Arrays.asList(10, 20, -1, 30));
        filterInteger(listNum);
        print(listNum);

        //Object
        List listObj = new ArrayList<>();
        listObj.addAll(Arrays.asList(10, 20, -1, 30));
        filterInteger(listObj);
        print(listObj);


        //Некорректные значения в Object
        List listObj2 = new ArrayList<>();
        listObj2.addAll(Arrays.asList("10", "20", "-1", "30"));
        filterInteger(listObj2); //error
        print(listObj2);


//        List<Double> listDoub=null; //error
//        filterInteger(listDoub);

    }




    public static void filterInteger(List<? super Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if( list.get(i) instanceof Number) {
                Integer val = (Integer) list.get(i);
                if (val < 0) {
                    list.set(i, 100);
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


