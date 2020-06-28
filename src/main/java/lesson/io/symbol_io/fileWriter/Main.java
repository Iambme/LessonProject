package lesson.io.symbol_io.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "src\\lesson\\io\\file.txt";
        FileWriter fileWriter = null;
        try {
            //если поставить true, то старые данные удаляться не будут
            fileWriter = new FileWriter(path, true);
            fileWriter.write("one\n");
            fileWriter.write("two three\n");
            fileWriter.write("four\n");
        } catch (Exception e) {
            e.printStackTrace();

        }finally {
            if(fileWriter!=null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
