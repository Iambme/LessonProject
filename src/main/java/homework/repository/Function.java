package homework.repository;

public interface Function<T>  {
    void add(T t);
    void remove(T t);
    void remove(int index);
    T clone(int index) throws CloneNotSupportedException;
}
