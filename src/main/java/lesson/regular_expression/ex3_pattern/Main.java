package lesson.regular_expression.ex3_pattern;

import java.util.Collection;
import java.util.HashMap;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //Проверка, что строка является числом
        //\d - [0-9]
        String re = "[0-9]+";
        System.out.println("123".matches(re));

        re = "\\d+";
        System.out.println("123".matches(re));

        //Проверить, что наша строка содержит только текстые символы
        re = "\\w+";
        System.out.println("hello123".matches(re));

    }
}
