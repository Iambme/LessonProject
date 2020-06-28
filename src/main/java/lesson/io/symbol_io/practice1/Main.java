package lesson.io.symbol_io.practice1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "src\\lesson\\io\\tovar.csv";
        //Запись данных в файл
        List<Tovar> list = new ArrayList<>();
//        list.addAll(Arrays.asList(new Tovar("TOvar1", 100),
//                new Tovar("Tovar2", 200),
//                new Tovar("Tovar3", 300)));
//

//        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
//        bw.write("Наименование");
//        bw.write(";");
//        bw.write("Цена");
//        bw.newLine();
//        for(Tovar t : list){
//            bw.write(t.name);
//            bw.write(";");
//            bw.write(String.valueOf(t.price));
//            bw.newLine();
//        }
//        bw.close();


        //Чтение из файла
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();
        line = br.readLine();
        while(line!=null){
            String[] arr = line.split(";");
            Tovar tovar = new Tovar(arr[0], Integer.parseInt(arr[1]));
            list.add(tovar);
            line = br.readLine();
        }
        br.close();
        System.out.println(list);


    }
}
