package lesson.optional.ex1;

import homework.library.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Optional - обертка для того, чтобы убрать проверки на null (сократить код) и избежать NPE (NullPointerException)
        Optional<Book> book = getBook(new ArrayList<>(), 100);
        //Вместо такой проверки:
//        if(book!=null) {
//            System.out.println(book.getName());
//        }else{
//            System.out.println("Книга не найдена");
//        }
        //станет такая:
        book.ifPresentOrElse(b-> System.out.println(b.getName()), ()-> System.out.println("Книга не найдена"));


    }

    public static Optional<Book> getBook(List<Book> books, int maxPrice){
        //может оказаться такое, что книги в списке books, цена которой меньше maxPrice, может не быть
        //что тогда возвращатЬ? Null?
        //Вместо null возвращаем обертку Optional, даже если книги нет. Если есть, то все равно Optional
        boolean isExist = false;
        if(isExist){
            return Optional.of(books.get(0));
        }
        return Optional.empty();
    }
}
