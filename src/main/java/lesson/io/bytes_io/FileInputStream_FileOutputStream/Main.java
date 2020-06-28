package lesson.io.bytes_io.FileInputStream_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "src\\lesson\\io\\file.txt";
        FileInputStream fis = new FileInputStream(path);
        //"cp1251" "windows1251"
        //"utf8"
        byte[] arr = new byte[2];
//        fis.read(arr);
//        String str = new String(arr);
//        System.out.println(str);
        System.out.println((char)fis.read());


        fis.close();
        FileReader fr = new FileReader(path);
        System.out.println((char)fr.read());
        fr.close();


    }
}
