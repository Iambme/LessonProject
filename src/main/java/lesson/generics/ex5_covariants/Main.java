package lesson.generics.ex5_covariants;

import lesson.generics.ex5_invariants.Animal;
import lesson.generics.ex5_invariants.Cat;

public class Main {
    public static void main(String[] args) {
        //КОвариантность - свойство, позволяющее объекты подклассов записывать в тип суперкласса
        Cat[] arrCat = {new Cat("cat1"), new Cat("cat2")};
        Animal[] arrAnimal = arrCat;
        arrAnimal[0] = new Cat("cat3");

        System.out.println(arrAnimal[0]);

        //При такой записи возможны ошибки с типами объектов:
//        arrAnimal[0] = new Dog("dog1"); //error так как Dog не является Cat
//        System.out.println(arrAnimal[0]);

        printAnyArray(arrCat);
        System.out.println();
        printAnyArray(arrAnimal);

        printAnyArray(new Integer[]{1,2,3});
    }

    public static void printAnyArray(Object[] arr){
        for(Object ob : arr){
            System.out.println(ob);
        }
    }
}
