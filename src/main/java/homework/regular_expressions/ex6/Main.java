package homework.regular_expressions.ex6;

public class Main {
    public static void main(String[] args) {
        long n1 = 89991234567L;
        long n2 = 79991234567L;
        String s1 = "+79991234567";
        String s2 = "89991234567";
    Service.checkNumbers(n1,n2);
    Service.checkNumbers(s1,s2);
    Service.checkNumbers(n1,s2);
    Service.checkNumbers(s1,n2);
    }


}
