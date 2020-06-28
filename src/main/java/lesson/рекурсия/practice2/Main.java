package lesson.рекурсия.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Есть проданные твоары в списке, найти выручку
        List<Tovar> list = new ArrayList<>();
        list.addAll(Arrays.asList(new Tovar(1), new Tovar(2), new Tovar(3)));
        System.out.println(priceSum(list,0));
    }

    public static int priceSum(List<Tovar> list,int index){
        if(index>=list.size()) {
            return 0;
        }
        return list.get(index).price + priceSum(list, ++index);

    }
}
