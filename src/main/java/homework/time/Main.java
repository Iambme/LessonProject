package homework.time;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
       6. Получить текущую дату.
       Определить, сколько дней осталось до нового года.
7. Написать калькулятор возвраста.
Пользователь вводит дату своего рождения, программа выводит возраст пользователя.
8. Создать класс Person с полями имя и дата рождения.
В мейне содать список объектов класса Person и отсортировать его по дате рождения в порядке возрастания.
         */
        LocalDate now = LocalDate.now();
        LocalDate newYear = LocalDate.of(2021, 1, 1);

        long days = ChronoUnit.DAYS.between(now, newYear);
        System.out.println(days);

        LocalDate dateOfBirth = LocalDate.of(1992, 9, 13);
        calcAge(dateOfBirth);

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ivan", LocalDate.of(1990, 9, 22)));
        persons.add(new Person("Oleg", LocalDate.of(1992, 4, 2)));
        persons.add(new Person("Maria", LocalDate.of(1991, 5, 26)));
        persons.add(new Person("Anna", LocalDate.of(1987, 7, 12)));
        persons.add(new Person("Victoria", LocalDate.of(1994, 2, 9)));

        Comparator<Person> comparatorByDate = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
            }
        };
        persons.sort(comparatorByDate);
        persons.forEach(System.out::println);
    }
    public static void calcAge(LocalDate dateOfBirth) {
        LocalDate now = LocalDate.now();
        long years = ChronoUnit.YEARS.between(dateOfBirth, now);
        System.out.println("Вам " + years + " лет");
    }
}
