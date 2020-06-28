package lesson.enums.ex2;

//Тренажорный зал GOLD
public class TrainGold {
    //Выводит детали тренировки на каждый день
    //ПН - ноги
    /*
    ВТ - руки
    СР - спина
     */
    public void printTrainDetail(Week week){
        if(week == Week.MON){
            System.out.println("Ноги");
        }
        else if(week == Week.THU){
            System.out.println("Руки");
        }
        if(week == Week.WEND){
            System.out.println("Спина");
        }

    }
}
