package lesson.exceptions.ex2;

import javax.imageio.IIOException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StudentDataBase studentDataBase = new StudentDataBase();
        try {
            studentDataBase.readStudentsFromFile("");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            int val = studentDataBase.get(0);
        }catch(Exception e){
            e.printStackTrace();
        }

        //исключения позволяет не писать длинных условий:
        //псевдокод:
//        StudentDataBase studentDataBase = new StudentDataBase();
//        studentDataBase.readStudentsFromFile("");
//        if(studentDataBase.getSize()!=0){
//            Object val = studentDataBase.get(0);
//            if(val!=null){
//                System.out.println(val);
//            }
//        }




        System.out.println("end programm");


    }
}
