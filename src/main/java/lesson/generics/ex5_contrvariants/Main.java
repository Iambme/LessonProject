package lesson.generics.ex5_contrvariants;

public class Main {
    public static void main(String[] args) {
        //Контрвариантность - свойство, позволяющее объект в типе суперкласса записать в переменную подкласса
        Animal animal = new Cat("cat");
        Cat cat2 = (Cat) animal; //контрвариантность

//        List<Animal> listAnimal = new ArrayList<>();
//        listAnimal.addAll(Arrays.asList(new Animal("cat1"), new Animal("cat2")));
//
//        //List<Cat> listCat = listAnimal; //коллекции не контрварианты по умолчанию
//
//        Animal[] arrAnimal = {new Cat("cat1")};
//        Cat[] arrCat = (Cat[])arrAnimal; //массивы также не контрварианты
//        System.out.println(arrCat[0]);

    }
}

