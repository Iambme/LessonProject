package lesson.enums.ex1;

public class Main {
    public static void main(String[] args) {
        //1. Пользователь вводит с консоли номер дня недели, вывести его название
        int userInput = 3;
        String str = "MON";
        System.out.println(str.equals(Week.MON.name()));
        switch (userInput){
            case 1:
                System.out.println(Week.MON.getDayName());
                break;
            case 2:
                System.out.println(Week.THU.getDayName());
                break;
            case 3:
                System.out.println(Week.WEND.getDayName());
                break;
            case 4:
                System.out.println(Week.THU);
                break;
            case 5:
                System.out.println(Week.SAN);
                break;
            case 6:
                System.out.println(Week.SUN);
                break;
            default:
                System.out.println("Error");

        }


    }
}
