package lesson.лямбда_выражения.ex1;

import lesson.лямбда_выражения.ex1.IPrint;

public class Main {
    public static void main(String[] args) {
        IPrint print = text -> System.out.println(text);

    }
}
