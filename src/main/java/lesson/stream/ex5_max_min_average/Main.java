package lesson.stream.ex5_max_min_average;

import lesson.stream.ex1.Tovar;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Найти макс, мин и сред арифм в массве
        int[] array = new Random().ints(5,0,10).toArray();
        Arrays.stream(array).forEach(val-> System.out.print(val+" "));
        System.out.println();
        OptionalInt op = Arrays.stream(array).max();
        System.out.println(op.getAsInt());

        OptionalInt op1 = Arrays.stream(array).min();
        System.out.println(op1.getAsInt());

        OptionalDouble average = Arrays.stream(array).average();
        System.out.println(average.getAsDouble());



//        Tovar tovar = null;
//        Optional<Tovar> op = Optional.of(tovar);
//        System.out.println(op.get());


//        Tovar maxTovar = getMaxTovar(null);
//        if(maxTovar!=null){
//            System.out.println(maxTovar);
//        }
        //вместо проверки на null:
//        Optional<Tovar> maxTovar = getMaxTovar(null);
//        maxTovar.ifPresent(System.out::println);

//        Tovar tovar = null;
//        Obertka<Tovar> ob = Obertka.of(tovar);
//        ob.ifPresentOrElse(new Tovar("None", 0));





    }



    public static Optional<Tovar> getMaxTovar(Tovar[] arr){
        if(arr!=null){
            Tovar maxTovar = arr[0];
            if(maxTovar!=null){
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i]!=null){
                        if(maxTovar.price < arr[i].price){
                            maxTovar = arr[i];
                        }
                    }
                }
            }
            return Optional.of(maxTovar);
        }
        return Optional.empty();
    }


}

class Obertka<T>{
    private T t;
    public Obertka(T t){
        this.t = t;
    }

    public static <T> Obertka<T> of(T val){
        return new Obertka<T>(val);
    }

    public void ifPresent(){
        if(t!=null) {
            System.out.println(t);
        }
    }

    public void ifPresentOrElse(T val){
        if(t!=null) {
            System.out.println(t);
        }else{
            System.out.println(val);
        }
    }
}


//class Obertka{
//
//
//    public <T> T of(T val){
//        return val;
//    }
//}