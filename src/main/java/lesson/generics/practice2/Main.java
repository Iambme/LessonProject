package lesson.generics.practice2;

public class Main {
    public static void main(String[] args) {
        //изменить класс Calculator на не дженерик, но сделать два параметизированных метода суммы и разницы
        System.out.println(GenericCalculator.sum(2, 3));
        System.out.println(GenericCalculator.minus(2.5, 3));
    }
}
