package lesson.json.practice2;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.databind.SerializationFeature;
import lesson.json.Sklad;
import lesson.json.Tovar;

import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

//        byte[] jsonData = Files.readAllBytes(Paths.get("src\\main\\java\\lesson\\json\\practice1\\sklad.json"));
//
//        //create ObjectMapper instance
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        //convert json string to object
//        Sklad sklad = objectMapper.readValue(jsonData, Sklad.class);
//        System.out.println(sklad);

        Sklad sklad1 = new Sklad();
        sklad1.adress = "Address1";
        //configure Object mapper for pretty print
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        //writing to console, can write to any output stream such as file
        StringWriter stringEmp = new StringWriter();
        objectMapper.writeValue(stringEmp, sklad1);
        System.out.println("Sklad JSON is\n" + stringEmp);


        Class clazz = Class.forName(Sklad.class.getName());


        Sklad sklad2 = (Sklad) clazz.getDeclaredConstructor(String.class, ArrayList.class).newInstance("Address2", new ArrayList<>());
        System.out.println(sklad2.adress);
        for (Constructor constructor : clazz.getConstructors()) {
            System.out.println(constructor);
        }

    }
}
