package lesson.junit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private List<Integer> marks = new ArrayList<>();

    public void add(int mark){
        marks.add(mark);
    }
    public void add(Integer ... mark){
        marks.addAll(Arrays.asList(mark));
    }

    public void clear(){
        marks.clear();
    }


    public int getMax(){
        int max = 5;
        for (Integer mark : marks){
            max = Math.max(max, mark);
        }
        return  max;
    }

    public double getAverage(){
        if(marks.size()==0){
            throw new IllegalArgumentException("Должны быть заполенны оценки");
        }
        double sum = 0;
        for(Integer mark : marks){
            sum+=mark;
        }
        return sum/marks.size();
    }




}
