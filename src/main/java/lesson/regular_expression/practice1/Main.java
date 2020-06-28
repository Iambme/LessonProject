package lesson.regular_expression.practice1;

public class Main {
    public static void main(String[] args) {
        //Проверить, что пользователь ввел свое имя, где первая буква должна быть заглавной
//        String userInput = "Name";
//        if(userInput.matches("[A-Z][a-z]{1,}")){
//            System.out.println("Correct");
//        }
//        else {
//            System.out.println("Incorrect");
//        }

        //2. Проверить, что пользователь ввел сумму в долларах, где после целой части может быть
        //дробная часть не более 2-х чисел после запятой, после которой идет знак доллара$
        String regex = "[0-9]+\\.[0-9]{1,2}\\$";
        System.out.println("12.12$".matches(regex));//true
        System.out.println("12.1$".matches(regex));//true
        System.out.println("12234.1$".matches(regex));//true
        System.out.println("12234.1".matches(regex));//false
        System.out.println("12234".matches(regex));//false
        System.out.println("12234$".matches(regex));//false

    }
}
