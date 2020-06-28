package homework.json.ex1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
     Создать класс Library с полями адрес библиотеки и список книг. Создать класс Book с полями имя автора, название книги и список страниц.
    Создать класс Page с полями номер страницы и текст на странице.
В мейне создать объект библиотеки, заполнить его несколькими книгами со страницами.
Сохранить этот объект библиотеки в json формате, а затем считать обратно.
- сначалать сделать все вручную без использования сторонних библиотек
- сделать через стороннюю библиотеку
- не забываем соблюдать базовые правила: все поля должны быть private, работа с полями типа списка должна осуществляться через методы,
а не просто через получение их через геттер, разбиваем методы по соответствующим классам ( не складываем все в кучу, если этого можно избежать)
         */

        Library library = new Library("Lenina street");
        Book book1 = new Book("Stephen King", "IT");
        Book book2 = new Book("Oscar Wild", "Dorian Grey");
        Page page1 = new Page(1, "random text from book1");
        Page page2 = new Page(2, "random text1 from book1");
        Page page3 = new Page(1, "random text from book2");
        Page page4 = new Page(2, "random text1 from book2");
        library.add(book1);
        library.add(book2);
        book1.add(page1);
        book1.add(page2);
        book2.add(page3);
        book2.add(page4);

        JSONObject jsonLibrary = new JSONObject();
        jsonLibrary.put("address", library.getAddress());

        JSONArray jsonPages1Array = new JSONArray();
        jsonPages1Array.add(convertPageToJSONObject(page1));
        jsonPages1Array.add(convertPageToJSONObject(page2));
        JSONObject jsonObjectBook1 = convertBookToJSONObject(book1);
        jsonObjectBook1.put("pages", jsonPages1Array);

        JSONArray jsonPages2Array = new JSONArray();
        jsonPages2Array.add(convertPageToJSONObject(page3));
        jsonPages2Array.add(convertPageToJSONObject(page4));
        JSONObject jsonObjectBook2 = convertBookToJSONObject(book2);
        jsonObjectBook2.put("pages", jsonPages2Array);


        JSONArray jsonBooksArray = new JSONArray();
        jsonBooksArray.add(jsonObjectBook1);
        jsonBooksArray.add(jsonObjectBook2);

        jsonLibrary.put("books", jsonBooksArray);
        String str = jsonLibrary.toJSONString();
        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.info(str);
        logger.warn("test");


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        StringWriter stringEmp = new StringWriter();
        objectMapper.writeValue(stringEmp, jsonLibrary);

        File file = new File("src\\main\\java\\homework\\json\\ex1\\Example.json");
        FileOutputStream fos = new FileOutputStream(file);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fos));
//        bufferedWriter.write(str);
        bufferedWriter.write(String.valueOf(stringEmp));
        bufferedWriter.close();

    }

    public static JSONObject convertBookToJSONObject(Book book) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("author", book.getAuthor());
        jsonObject.put("title", book.getTitle());

        return jsonObject;
    }

    public static JSONObject convertPageToJSONObject(Page page) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("number", String.valueOf(page.getNumber()));
        jsonObject.put("text", page.getText());

        return jsonObject;
    }
}
