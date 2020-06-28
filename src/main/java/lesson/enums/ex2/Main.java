package lesson.enums.ex2;

public class Main {
    public static void main(String[] args) {
        //Вывести тренировку на текущий день в каждом зале, день недели пользователь вводит с консоли
        TrainGold trainGold = new TrainGold();
        TrainGym trainGym = new TrainGym();
        int userInput = 3;
        String str = "MON";
        System.out.println(str.equals(lesson.enums.ex1.Week.MON.name()));
        switch (userInput){
            case 1:
                trainGold.printTrainDetail(Week.MON);
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
