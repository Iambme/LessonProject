package lesson.lombock;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", 20);
        Person person2 = new Person();

        System.out.println(person1);
        System.out.println(person2);

        person2.setAge(20);
        person2.setName("Semen");
        System.out.println(person2);


    }
}
