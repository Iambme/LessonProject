package lesson.generics.practice2;

public class GenericCalculator {


    public static <T extends Number> T sum(T a, T b){
       double a1= a.doubleValue();
       double b1= b.doubleValue();
       Double res = (a1+b1);
       //Object res1 = (Object)res;

       return (T)res;
    }
    public static <T extends Number> T minus(T a ,T b){
        double a1 = a.doubleValue();
        double b1 = b.doubleValue();
        Double res = (a1-b1);
        return  (T)res;
    }
}
