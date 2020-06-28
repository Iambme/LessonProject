package homework.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.info("Старт программы");

        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("src\\main\\java\\homework\\json\\JsonFile.json"));
        JSONArray jsonArray = (JSONArray) object;
        for (Object e : jsonArray) {
            JSONObject jsonObject = (JSONObject) e;
            String cardStatus = (String) jsonObject.get("cardStatus");
            if (cardStatus.equals("X") || cardStatus.equals("+")) {
                String cardNum = (String) jsonObject.get("cardNum");
                String maskedCardNum = cardNum.substring(0, 4) + "******" + cardNum.substring(12);
                String product = (String) jsonObject.get("product");
                logger.info(product);
                logger.info(maskedCardNum);
            }
        }

    }
}
