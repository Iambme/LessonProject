package lesson.io.bytes_io.practice2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws  Exception{
                String path = "src\\lesson\\io\\file.txt";
//        List<Student> studentList = new ArrayList<>();
//        studentList.addAll(Arrays.asList(
//                new Student("Ivan", new Subject("Math", 3), new Subject("Rus", 4)),
//                new Student("Petr", new Subject("Eng", 3), new Subject("Rus", 4), new Subject("Litra", 5)),
//                new Student("Semen", new Subject("Eng", 3))
//
//        ));
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path)); //поток вывода для сериализации
//        oos.writeObject(studentList);
//        oos.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path)); //поток ввода для десериализации
        List<Student> list = (List<Student>)ois.readObject();
        ois.close();
        for(Student st : list){
            System.out.println(st);
        }

    }
}
