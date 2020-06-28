package lesson.json.ex1;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        JSONParser jsonParser = new JSONParser();
        Object object = jsonParser.parse(new FileReader("src\\main\\java\\lesson\\json\\ex1\\jsonFile.json"));
        JSONObject jsonObj = (JSONObject)object;
        String name = (String)jsonObj.get("name");
        long price = (Long)jsonObj.get("price");
        String count = (String)jsonObj.get("count");

        System.out.println(name+" "+price+" "+count);

    }
}
