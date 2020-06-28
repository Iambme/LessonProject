package lesson.collections.linkedList.ex3;

import lesson.collections.arrayList.MyArrayList.MyArrayList;
import lesson.collections.linkedList.ex1.MyOneLinkedList;
import lesson.collections.linkedList.ex2.MyTwoLinkedList;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Сравнение производительности
        MyOneLinkedList myOneLinkedList = new MyOneLinkedList();
        MyTwoLinkedList myTwoLinkedList = new MyTwoLinkedList();
        MyArrayList myArrayList = new MyArrayList();

        for (int i = 0; i < 10_000_000; i++) {
            myOneLinkedList.add(i);
            myTwoLinkedList.add(i);
            myArrayList.add(i);
        }


//        System.out.println(myOneLinkedList.get(20));
//        myOneLinkedList.printOperationCount();
//        System.out.println(myTwoLinkedList.get(20));
//        myTwoLinkedList.printOperationCount();



        //Получение
//        printDate();
//        System.out.println(myTwoLinkedList.get(9_990_000));
//        myTwoLinkedList.printOperationCount();
//        printDate();
//        System.out.println("##############################");
//        printDate();
//        System.out.println(myOneLinkedList.get(9_990_000));
//        myOneLinkedList.printOperationCount();
//        printDate();
//        System.out.println("##############################");
//        printDate();
//        System.out.println(myArrayList.get(9_990_000));
//        printDate();


        //Удаление

//        printDate();
//        myTwoLinkedList.remove(myTwoLinkedList.getSize()/2);
//        myTwoLinkedList.printOperationCount();
//        printDate();
//        System.out.println("##############################");
//        printDate();
//        myOneLinkedList.remove(myTwoLinkedList.getSize()/2);
//        myOneLinkedList.printOperationCount();
//        printDate();

//        System.out.println("##############################");
//        printDate();
//        myArrayList.remove(myArrayList.size()/2);
//        myArrayList.printOperCount();
//        printDate();

        //two: 146 73
        //arr: 65 7

        LinkedList<Integer> linkeList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            linkeList.add(i);
            arrayList.add(i);
        }
        printDate();
        linkeList.remove(linkeList.size()/2);
        printDate();
        System.out.println("##############################");
//        printDate();
//        myOneLinkedList.remove(myTwoLinkedList.getSize()/2);
//        myOneLinkedList.printOperationCount();
//        printDate();

        System.out.println("##############################");
        printDate();
        arrayList.remove(arrayList.size()/2);
        printDate();

        arrayList.clear();
        System.out.println("##############################");
        printDate();
        arrayList.add(1);
        printDate();



    }

    public static void printDate(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ss:SS");
        System.out.println(sdf.format(date));
    }
}
