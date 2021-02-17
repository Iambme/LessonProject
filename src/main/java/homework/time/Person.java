package homework.time;

import java.time.LocalDate;
import java.util.Comparator;

public class Person implements Comparator<Person> {
    private String name;
    private LocalDate dateOfBirth;

    public Person(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.dateOfBirth.compareTo(o2.dateOfBirth);
    }
}
