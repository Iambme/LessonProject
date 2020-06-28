package homework.regular_expressions.ex6;

import lesson.loging.ex1.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Service {
    private static Logger logger = LoggerFactory.getLogger(Main.class);
    private static String regex = "^\\+7|^7|^8";
    public static void log(boolean b) {
        logger.info("{}", b);
    }

    public static void checkNumbers(long num1,long num2){
        checkNumbers(String.valueOf(num1), String.valueOf(num2));
    }
    public static void checkNumbers(String num1,String num2){
        String s1 = num1.replaceFirst(regex,"");
        String s2 = num2.replaceFirst(regex,"");
        log(s1.equals(s2));
    }
    public static void checkNumbers(String num1,long num2){
        checkNumbers(num1, String.valueOf(num2));
    }
    public static void checkNumbers(long num1,String num2){
        checkNumbers(String.valueOf(num1), num2);
    }

//    public static void checkNumbers(long num1,long num2){
//
//        String s1 = num1+"";
//        String s2 = num2+"";
//        String s3 = s1.replaceFirst(regex,"");
//        String s4 = s2.replaceFirst(regex,"");
//        log(s3.equals(s4));
//    }
//    public static void checkNumbers(String num1,String num2){
//        String s1 = num1.replaceFirst(regex,"");
//        String s2 = num2.replaceFirst(regex,"");
//        log(s1.equals(s2));
//    }
//    public static void checkNumbers(String num1,long num2){
//        String s2 = num2+"";
//        String s1 = num1.replaceFirst(regex,"");
//        String s4 = s2.replaceFirst(regex,"");
//        log(s1.equals(s4));
//    }
//    public static void checkNumbers(long num1,String num2){
//        String s1 = num1+"";
//        String s3 = s1.replaceFirst(regex,"");
//        String s4 = num2.replaceFirst(regex,"");
//        log(s3.equals(s4));
//    }
}
