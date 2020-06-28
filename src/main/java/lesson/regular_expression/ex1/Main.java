package lesson.regular_expression.ex1;

public class Main {
    public static void main(String[] args) {
        //1. Проверить, что пользователь ввел exit, где exit Может быть как с большой, так и с маленькой буквы
//        String userInput = "Exit";
//        if(userInput.matches("[eE]xit")){
//            System.out.println("Завершение работы");
//        }

        //2. Проверить, что строка содержит только числа
//        String userInput = "123123";
//        boolean res = userInput.matches("[0-9]{1,}"); //задает диапазон от 1 до бесконечности
//        System.out.println(res);


        //3. Проверить, что строка содержит только симолы или пробелы
//        String userInput = "hello Java";
//        boolean res = userInput.matches("[a-zA-Z ]{1,}");
//        System.out.println(res);


        //4. Проверить, что строка содержит только симолы или пробелы
//        String userInput = "hello Java";
//        boolean res = userInput.matches("[a-zA-Z ]+"); //+ Заменяет {1,}
//        System.out.println(res);


        //5. Пользователь вводит денежную сумму, после которой он может указать руб., а может и не указывать
        String userInput = "5 руб.";
        //boolean res = userInput.matches("[0-9]+[а-я .]*"); //* Заменяет диапазоне {0,}
        String regex = "[0-9]+[ ]*(руб)*\\.*"; //* заменяет {0,}
        System.out.println("5 руб.".matches(regex)); //true
        System.out.println("5 руб".matches(regex)); //true
        System.out.println("5 ".matches(regex)); //true
        System.out.println("5".matches(regex)); //true
        System.out.println("5 ру"); //false


    }
}
