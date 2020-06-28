package lesson.io.bytes_io.serialise;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "src\\lesson\\io\\file.txt";

//        List<Tovar> list = new ArrayList<>();
//        list.addAll(Arrays.asList(new Tovar("TOvar1", 100),
//                new Tovar("Tovar2", 200),
//                new Tovar("Tovar3", 300)));
//
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path)); //сериализация
//        oos.writeObject(list);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path)); //десериализация
        List<Tovar> list = (List<Tovar>)ois.readObject();
        ois.close();
        System.out.println(list);
    }
}
