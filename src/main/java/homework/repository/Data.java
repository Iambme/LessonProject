package homework.repository;

public abstract class Data implements Cloneable{
    @Override
    public abstract Data clone() throws CloneNotSupportedException;
}
