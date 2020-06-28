package lesson.generics.ex1;

//Универсальный контейнер
public class GenericContainer<T> {
    private T val;

    public void setVal(T val){
        this.val = val;
    }

    public T getVal(){
        return val;
    }
}
