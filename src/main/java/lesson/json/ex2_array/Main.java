package lesson.json.ex2_array;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        JSONParser jsonParser = new JSONParser();
        Object object = jsonParser.parse(new FileReader("src\\main\\java\\lesson\\json\\ex2_array\\jsonFile.json"));
        JSONArray jsonArray = (JSONArray)object;
        for(Object obj : jsonArray){
            JSONObject jsonObj = (JSONObject)obj;
            String name = (String)jsonObj.get("name");
            System.out.println(name);
        }


    }
}
