package lesson.generics.wildcard.covariant;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //wildcard или символ подстановки ? позволяет сделать коллекцию ковариантной или контрвариантной

        //1. Написать метод, принимающий любую коллекцию чисел (Integer, Double, Float, Byte)
        List<Integer> listInt = new ArrayList<>();
        List<Double> listDoub = new ArrayList<>();
        listInt.addAll(Arrays.asList(10,20,30));
        listDoub.addAll(Arrays.asList(10.5,20.0,30.1));

        printAnyDigitCollection(listInt);
        printAnyDigitCollection(listDoub);
        System.out.println();
        //можно создать ковариантную коллецию в виде обычной переменной (не всегда ее обязательно делать в виде параметра)
        //List<? extends Number> list = listDoub;


        //2. Создать коварниантную коллекцию для любых типов
        List<String> listStr = new ArrayList<>();
        listStr.addAll(Arrays.asList("one", "two"));
        printAnyCollection(listDoub);
        printAnyCollection(listStr);

    }

    public static void printAnyDigitCollection(List<? extends Number> list){
        for(Number number : list){
            System.out.println(number);
        }
    }

    public static void printAnyCollection(List<?> list){
        for(Object ob : list){
            System.out.println(ob);
        }
    }
}
