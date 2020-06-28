package homework.regular_expressions.ex5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

//        String regex = "((?<=[.!?]\\s)|\\A)[^.!?]*\\bJava\\b[^.!?]*([.!?]|\\Z)";
        String regex1 = "([.!?]|[^.!?]*)Java[^.!?]*[.!?]";
        Pattern pattern1 = Pattern.compile(regex1,Pattern.CASE_INSENSITIVE);
//        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        String text = "Java - язык программирования. На языке Java пишутся приложения от desktop до web. Вам нравится этот язык? Мне нравится Java.";
//        Matcher matcher = pattern.matcher(text);
//        while(matcher.find()){
//            String str = matcher.group();
//            System.out.println(str);
//        }
//        System.out.println();
        Matcher matcher1 = pattern1.matcher(text);
        while(matcher1.find()){
            String str = matcher1.group();
            System.out.println(str);
        }
    }
}
