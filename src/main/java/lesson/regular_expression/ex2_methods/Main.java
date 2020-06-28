package lesson.regular_expression.ex2_methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //1. Начало строки ^
        System.out.println(1);
        String re = "^[Ff]ruit.*";
        System.out.println("Fruit".matches(re)); //true
        System.out.println("fruit is tasty".matches(re)); //true
        System.out.println("my fruit is tasty".matches(re)); //false

        //2. Конец строки $
        System.out.println(2);
        re = ".*[Ff]ruit";
        System.out.println("Fruit".matches(re)); //true
        System.out.println("fruit is tasty".matches(re)); //false
        System.out.println("my fruit is tasty".matches(re)); //false
        System.out.println("my fruit".matches(re)); //false


        //3. Слово на границе других слов \b
        System.out.println(3);
        re = ".*\\b[Ff]ruit\\b.*";
        System.out.println("Fruit".matches(re)); //true
        System.out.println("fruit is tasty".matches(re)); //true
        System.out.println("fruitty".matches(re)); //false

        //4. Слово не на гринце \B
        System.out.println(4);
        re = ".*\\b[Ff]ruit\\B.*";
        System.out.println("Fruit".matches(re)); //false
        System.out.println("fruit is tasty".matches(re)); //false
        System.out.println("fruitty".matches(re)); //true



        //Pattern
        System.out.println(5);
        re = " ";
        Pattern pattern = Pattern.compile(re);
        String[] arr = pattern.split("hello java and python");
        for(String val: arr){
            System.out.println(val);
        }


        //Есть строка с предложениями. Разделить строку на отдельные предложения по символу .
        System.out.println(6);
        String text = "Hello java. Java is a program language.";
        re = "\\. ";
        Pattern pattern1 = Pattern.compile(re);
        String [] arr1 = pattern1.split(text);
        for (String val: arr1) {
            System.out.println(val);
        }


        //Лимиты
        System.out.println(7);
        text = "Hello java. Java is a program language. Java is compiled language";
        re = "\\. ";
        pattern1 = Pattern.compile(re);
        arr1 = pattern1.split(text, 2);
        for (String val: arr1) {
            System.out.println(val);
        }

        //Find, Group
        //Найти все числа в строке
        System.out.println(8);
        text = "Дохдо компании А 100 млн руб. Доход компании Б 200 млн руб.";
        pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            String str = matcher.group();
            System.out.println(str);
        }

        //ФЛАГИ
        System.out.println(9);
        pattern = Pattern.compile(".*\\bdog\\b.*", Pattern.CASE_INSENSITIVE);
        System.out.println(pattern.matcher("I have a Dog").matches());
        System.out.println(pattern.matcher("I have a dog").matches());
        System.out.println(pattern.matcher("I have a DOG").matches());






    }
}
