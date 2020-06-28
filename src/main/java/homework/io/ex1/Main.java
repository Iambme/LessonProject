package homework.io.ex1;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


    String path = "src\\homework\\io\\ex1\\file.txt";
    FileWriter fileWriter = null;
        try {
        fileWriter = new FileWriter(path);
            for (int i = 0; i <10 ; i++) {
                int rand = (int)(Math.random()*10);
                fileWriter.write(rand+"\n");
            }

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
