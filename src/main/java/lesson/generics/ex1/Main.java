package lesson.generics.ex1;

public class Main {
    public static void main(String[] args) {
        GenericContainer<Integer> container = new GenericContainer<>();
        container.setVal(10);
        int res1 = container.getVal() + 10;
        System.out.println(container.getVal());
        container.setVal(20);
        System.out.println(container.getVal());


        GenericContainer<String> container2 = new GenericContainer<>();
        container2.setVal("hello");
        System.out.println(container2.getVal());
        container2.setVal("world");
        System.out.println(container2.getVal());


        GenericContainer genericContainer = new GenericContainer();
        genericContainer.setVal(10);
        System.out.println(genericContainer.getVal());
        int res = (Integer)genericContainer.getVal() + 20;
        genericContainer.setVal("hello");
        System.out.println(genericContainer.getVal());
        genericContainer.setVal(true);
        System.out.println(genericContainer.getVal());
        genericContainer.setVal(new GenericContainer<>());
        System.out.println(genericContainer.getVal());






    }
}
