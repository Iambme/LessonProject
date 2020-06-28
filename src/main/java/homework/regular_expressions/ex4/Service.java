package homework.regular_expressions.ex4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Service implements AutoCloseable{

    public void go() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите регулярное выражение");
        String regex = reader.readLine();
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        System.out.println("Введите строку");
        String userInput = reader.readLine();
        String[] arr = pattern.split(userInput);

        for (String s : arr) {
            System.out.println(s);
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("Method close");
    }
}
