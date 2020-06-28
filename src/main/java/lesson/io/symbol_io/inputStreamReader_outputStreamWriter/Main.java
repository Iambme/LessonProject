package lesson.io.symbol_io.inputStreamReader_outputStreamWriter;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String path = "src\\lesson\\io\\file.txt";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));

        InputStreamReader oow = new InputStreamReader(bis);
        BufferedReader br = new BufferedReader(oow);
        String str = br.readLine();
        while(str!=null){
            System.out.println(str);
            str = br.readLine();
        }




    }
}
