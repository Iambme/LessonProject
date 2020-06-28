package lesson.nio2.ex1_read;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src\\lesson\\nio2\\file.txt");

        //Способ 1
//        BufferedReader br = Files.newBufferedReader(path);
//        String line = br.readLine();
//        while(line!=null){
//            System.out.println(line);
//            line = br.readLine();
//        }
//        br.close();


        //Способ 2
        List<String> lines = Files.readAllLines(path);
        System.out.println(lines);


    }
}
