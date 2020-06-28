package lesson.generics.ex4;

import java.util.ArrayList;
import java.util.List;

public class GenericFigure<T extends Figure> {
    List<T> figures = new ArrayList<>();

    public void add(T t){
        figures.add(t);
    }

    public T get(int index){
        return figures.get(index);
    }
    public T max(){
        T maxFigure = figures.get(0);
        for (int i = 0; i <figures.size() ; i++) {
            if(maxFigure.getSquare()<figures.get(i).getSquare()){
                maxFigure= figures.get(i);
            }

        }
        return maxFigure;
    }

}
