package lesson.generics.ex5_invariants;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //ИНвариантность - отсутствие свойств ковариантности и контрвариантности
        Animal animal = new Cat("cat");
        List<Cat> listCat = new ArrayList<>();
        //List<Animal> listAnimal = listCat; //коллекции инварианты по умолчанию (нельзя приравнивать коллекции разных типов)




    }


}





