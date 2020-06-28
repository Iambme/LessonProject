package homework.regular_expressions.ex3;

public class Main {
    public static void main(String[] args) {
        String regex = ".*-*\\d+.*";
        String test = "asdasd -5asda";
        System.out.println(test.matches(regex));

//        String regex1 = "[0-9]+\\.[0-9]{2} (руб)\\.|[0-9]+\\.[0-9]{2} \\$";
        String regex1 = "[0-9]+\\.[0-9]{2} ((руб\\.)|\\$)";
        String test1 = "23.00 руб.";
        System.out.println(test1.matches(regex1));
    }
}
