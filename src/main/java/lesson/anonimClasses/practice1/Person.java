package lesson.anonimClasses.practice1;

public class Person {
    int health;
    Attack attack;
    String type;

    public Person(String type) {
        this.type = type;
    }

    public void makeAttack(Person person){
        int damage = attack.makeAttack();
        person.health -= damage;
        System.out.println(person.type+" получил урон "+(-damage));
        System.out.println("Осталось здоровья: "+person.health);

    }
}
