package lesson.io.symbol_io.bufferedReader;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "src\\lesson\\io\\file.txt";
//        BufferedReader br = new BufferedReader(new FileReader(path));
//        String str = br.readLine();
//        while(str!=null){
//            System.out.println(str);
//            str = br.readLine();
//        }

        Scanner scn = new Scanner(new BufferedReader(new FileReader(path)));
        while(scn.hasNextLine()){
            System.out.println(scn.nextLine());
        }
    }
}
