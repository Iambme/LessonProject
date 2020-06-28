package lesson.json.ex3_write;

import lesson.json.Sklad;
import lesson.json.Tovar;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Main {
    public static void main(String[] args) {
        Sklad sklad = new Sklad();
        sklad.adress = "Address1";
        JSONObject jsonSklad = new JSONObject();
        jsonSklad.put("address", sklad.adress);
        JSONArray jsonArray = new JSONArray();

        jsonArray.add(convertToJSONObject(sklad.tovars.get(0)));
        jsonArray.add(convertToJSONObject(sklad.tovars.get(1)));
        jsonSklad.put("tovars", jsonArray);
        String str = jsonSklad.toJSONString();
        System.out.println(str);

    }

    public static JSONObject convertToJSONObject(Tovar tovar){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", tovar.name);
        jsonObject.put("price", String.valueOf(tovar.price));
        return jsonObject;
    }
}

