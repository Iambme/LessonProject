package lesson.collections.iterator.ex1;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("one");
        list.add("one");
        list.add("four");
        list.add("one");

        //start  10 20 30 40
        //^
        //                ^
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //Удалим элементы One
//        int count = 0;
//        for (int i = 0; i < list.size(); ) {
//            String val = list.get(i);
//            if(val.equals("one")){
//                count++;
//            }
//            if(count>1 && val.equals("one")){
//                list.remove(i);
//            }else{
//                i++;
//            }
//        }
//        System.out.println(list);

//        int count = 0;
//        for(String val : list){
//            if(val.equals("one")){
//                count++;
//            }
//            if(count>1 && val.equals("one")){
//                list.remove(val);
//            }
//        }


//        int count = 0;
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            String val = iterator.next();
//            if(val.equals("one")){
//                count++;
//            }
//            if(count>1 && val.equals("one")){
//                iterator.remove();
//            }
//        }
//
//        System.out.println(list);


        





    }
}
