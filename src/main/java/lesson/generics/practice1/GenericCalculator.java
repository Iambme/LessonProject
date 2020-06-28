package lesson.generics.practice1;

public class GenericCalculator<T extends Number> {
    private T a;
    private T b;

    public GenericCalculator(T a, T b) {
        this.a = a;
        this.b = b;
    }
    public T sum(){
       double a1= a.doubleValue();
       double b1= b.doubleValue();
       Double res = (a1+b1);
       //Object res1 = (Object)res;

       return (T)res;
    }
    public T minus(){
        double a1 = a.doubleValue();
        double b1 = b.doubleValue();
        Double res = (a1-b1);
        return  (T)res;
    }
}
