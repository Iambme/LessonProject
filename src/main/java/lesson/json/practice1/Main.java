package lesson.json.practice1;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("src\\main\\java\\lesson\\json\\practice1\\sklad.json"));
        JSONObject jsonObject = (JSONObject)object;
        String str = (String) jsonObject.get("adress");
        System.out.println(str);
        JSONArray jsonArray = (JSONArray) jsonObject.get("tovars");
        for (Object e: jsonArray) {
            JSONObject jsonObject1 = (JSONObject)e;
            String string = (String)jsonObject1.get("name");
            String string1 = (String)jsonObject1.get("price");
            System.out.println(string+ " " + string1);
        }

    }
}
