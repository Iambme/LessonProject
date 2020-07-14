package homework.annotation.ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<TovarDataBase> clazz = TovarDataBase.class;
        TovarDataBase tovarDataBase = clazz.getDeclaredConstructor().newInstance();

        String path = clazz.getAnnotation(DBPath.class).path();

        FileReader fileReader = new FileReader(path);
//        ArrayList<String> arrayList = new ArrayList<>();
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//        while (bufferedReader.ready()) {
//            arrayList.add(bufferedReader.readLine());
//        }

        Path pathNio = Paths.get(path);
        List<String> arrayList = Files.readAllLines(pathNio);

        for (String s : arrayList) {
            String[] tovarFields = s.split(", ");
            String name = tovarFields[0].replaceFirst("Name ", "");
            int price = Integer.parseInt(tovarFields[1].replaceFirst("price ", "").replace(";", ""));
            tovarDataBase.add(new Tovar(name, price));

        }
        System.out.println(tovarDataBase.toString());



    }
}
