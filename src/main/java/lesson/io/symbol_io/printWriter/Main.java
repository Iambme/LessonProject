package lesson.io.symbol_io.printWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        String path = "src\\lesson\\io\\file.txt";
//        PrintWriter printWriter = null;
//        try {
//            printWriter = new PrintWriter(path);
//            printWriter.println("one");
//            printWriter.println("two three");
//            printWriter.println("four");
//            throw new FileNotFoundException("test");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            System.out.println(1/0);
//
//        }finally {
//            if(printWriter!=null) {
//                printWriter.close();
//            }
//        }
//finally срабатывает даже, если произойдет аварианое необработанное исключение


        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(path);
            printWriter.println("five");


        } catch (FileNotFoundException e) {
            e.printStackTrace();


        }finally {
            if(printWriter!=null) {
                printWriter.close();
            }
        }






    }
}
