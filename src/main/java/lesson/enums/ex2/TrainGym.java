package lesson.enums.ex2;


//Тренажорный зал Gym (отличаются расписанием тренировок)
public class TrainGym {
    //Выводит детали тренировки на каждый день
    //ПН - спина
    /*
    ВТ - руки
    СР - руки
     */
    public void printTrainDetail(Week week){
        if(week == Week.MON){
            System.out.println("Спина");
        }
        else if(week == Week.THU){
            System.out.println("Руки");
        }
        if(week == Week.WEND){
            System.out.println("Руки");
        }

    }
}
