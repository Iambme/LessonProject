package lesson.nio2.ex2_write;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src\\lesson\\nio2\\file.txt");
        //Способ 1
//        BufferedWriter bw = Files.newBufferedWriter(path, StandardOpenOption.CREATE);
//        bw.write("hello java");
//        bw.close();

        //Способ 2
//        List<String> lines = new ArrayList<>();
//        lines.add("hello");
//        lines.add("java");
//
//        Files.write(path, lines, StandardOpenOption.CREATE);
    }
}
