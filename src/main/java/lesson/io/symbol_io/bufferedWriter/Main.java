package lesson.io.symbol_io.bufferedWriter;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "src\\lesson\\io\\file.txt";
        File file = new File(path);
        BufferedWriter bw = new BufferedWriter(new PrintWriter(path));
        bw.write("hello java");
        bw.newLine();
        bw.write("hello world");
        bw.newLine();
        bw.close();
    }
}
