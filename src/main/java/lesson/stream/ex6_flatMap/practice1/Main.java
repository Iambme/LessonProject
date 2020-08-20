package lesson.stream.ex6_flatMap.practice1;

import homework.library.Book;
import homework.library.Library;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        //Создать массив библиотек, в каждой из которых есть массив книг. Вывести название каждой книги.
        ArrayList<Library<Book>> libraries = new ArrayList<>();

        Library<Book> library2 = new Library<>();


        libraries.add(new Library<>() {
            {
                add(new Book("Book1", "Author1"));
                add(new Book("Book2", "Author2"));
                add(new Book("Book3", "Author3"));
            }
        });
        library2.add(new Book("Book4", "Author4"));
        library2.add(new Book("Book5", "Author5"));
        library2.add(new Book("Book6", "Author6"));

        libraries.add(library2);

        libraries.stream() //Stream<Library>
                .map(bookLibrary -> bookLibrary.arr) //Stream<Library> -> Stream<ArrayList<Book>>
                .flatMap(Collection::stream) //Stream<ArrayList<Book>> -> Stream<Book>
                .forEach(x -> System.out.println(x.getName()));



//ЭКЗЕМПЛЯРНЫЙ И СТАТИЧЕСКИЙ БЛОК
//        System.out.println(Phone.firm);
//        Phone phone = new Phone();
//        Phone phone1 = new Phone();
        //использование экземплярного блока в анонимном объекте
//        Phone phone1 = new Phone(){
//            {
//                System.out.println("anonim ex block");
//                name = "Iphone X";
//            }
//        };
//        System.out.println(phone1.name);

    }

}


class Phone {
    String name;
    static String firm;

    public Phone() {

    }

    public Phone(String name) {
        System.out.println("constr");
        this.name = name;
    }

    //экземплярный блок
    {
        System.out.println("ex block");
        name = "Empty";
    }

    //статический блок
    static {
        firm = "Apple";
        System.out.println("static block");
    }
}