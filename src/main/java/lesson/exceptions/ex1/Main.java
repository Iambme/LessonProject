package lesson.exceptions.ex1;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileWriter fw = null;
        try {
            //возможны две ошибки:
            fw = new FileWriter("");
            System.out.println(1/0);
        }catch(IOException e){
            //System.out.println(e.toString());
            System.out.println("Файл не найден");
        }catch (ArithmeticException e){
            System.out.println("Деление на ноль");
        }
        finally {
            if(fw!=null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
