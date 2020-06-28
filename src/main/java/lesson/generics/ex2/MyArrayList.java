package lesson.generics.ex2;

//
public class MyArrayList<T> {
    private Object[] arr = new Object[10];
    private int currentIndex;
    public void add(T val){
        arr[currentIndex++]=val;
    }

    public T get(int index){
        return (T)arr[index];
    }

    public int size(){
        return currentIndex;
    }

//    public T sum(){
//        T val1 = (T)arr[0];
//        T val2 = (T)arr[1];
//        double a = val1.doubleValue();
//        double b = val2.doubleValue();
//        Object res = (a+b);
//        return (T)res;
//    }


}
