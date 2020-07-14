package lesson.stream.ex2.practice1;

import lesson.stream.ex2.Human;
import lesson.stream.ex2.Passport;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Создать класс Passport с полями серия, номер, страна. Создать класс Human с полемями имя, паспорт.
        // В мейне создать список Human и получить из него новый список людей, которые родились в одном городе.
        List<Human> humanList = new ArrayList<>();
        humanList.add(new Human(new Passport(12123,"Russia",34343),"Ivan"));
        humanList.add(new Human(new Passport(12123,"Moldavia",34343),"Petr"));
        humanList.add(new Human(new Passport(12123,"Russia",34343),"Maria"));

        List<Passport> passports = humanList.stream() //Stream<Human>
                .filter(human -> human.getPassport().getCountry().equals("Russia"))
                .map(human -> human.getPassport()) //Stream<Human> -> Stream<Passport>
                .collect(Collectors.toList());
        passports.forEach(System.out::println);
    }
}
