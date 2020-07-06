package lesson.patterns.decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
//https://refactoring.guru/ru/design-patterns/decorator
        FileDataSource fileDataSource = new FileDataSource("file.txt");
        ConsoleDataSource consoleDataSource = new ConsoleDataSource();
//        DataSourceDecorator dataSourceDecorator = new DataSourceDecorator(fileDataSource);
//        dataSourceDecorator.write("hello world");
//
//        DataSourceDecorator dataSourceDecorator2 = new DataSourceDecorator(consoleDataSource);
//        dataSourceDecorator2.write("hello world");


        DataSourceEncryptDecorator dataSourceEncryptDecorator = new DataSourceEncryptDecorator(consoleDataSource);
        dataSourceEncryptDecorator.write("hello world");


//        Path path = Paths.get("");
//        BufferedReader = br =  Files.newBufferedReader(path);
//
//        List<String> Files.readAllLines(path)

//        FileInputStream fis = new FileInputStream("src\\main\\java\\lesson\\patterns\\decorator\\file.txt");
//        char ch = (char)fis.read();
//        System.out.println(ch);
//        ch = (char)fis.read();
//        System.out.println(ch);
//        ch = (char)fis.read();
//        System.out.println(ch);
//        ch = (char)fis.read();
//        System.out.println(ch);


        File file = new File("src\\main\\java\\lesson\\patterns\\decorator\\dir");
        file.delete();

        Tovar tovar =  new Tovar("Tovar1", 199);
        tovar.list.add(new Point("Point1"));
        tovar.list.add(new Point("point2"));

        Tovar tovar2 = tovar.clone();

        System.out.println(tovar2);

        tovar2.price = 1;
        tovar2.name = "1";
        tovar2.list.clear();
        tovar2.list.add(new Point("new point"));

        System.out.println();
        System.out.println(tovar);
        System.out.println(tovar2);





    }
}
