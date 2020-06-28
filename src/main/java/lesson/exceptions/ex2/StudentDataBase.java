package lesson.exceptions.ex2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentDataBase {
    private ArrayList<Integer> list = new ArrayList();

    public void add(int val){
        list.add(val);
    }

    public int getSize(){
        return list.size();
    }

    //в случае отсутствия индекса метод выбросит исключение вместо return
    public int get(int index){
        if(index < list.size()) {
            return list.get(index);
        }
        throw new IndexOutOfBoundsException("Индекс "+index+" находится вне границ массива");
    }

    //метод выбрасывает исключение для того, чтобы обработать его в мейне
    public void readStudentsFromFile(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
    }
}
