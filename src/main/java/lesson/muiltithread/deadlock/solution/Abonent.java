package lesson.muiltithread.deadlock.solution;

public class Abonent {
    String name;
    private InitiatorState initiatorState;

    public Abonent(String name, InitiatorState initiatorState)
    {
        this.name = name;
        this.initiatorState = initiatorState;
    }



    public synchronized void ringPhone(Abonent abonent){

        System.out.println("Включаем мелодию звонка у собеседника "+abonent.name);
    }

    /**
     * Был добавлен состояние звонка (переменная isCalling). Если абонент набирает номер, его статус становится true
     * Перед началом вызова проверяем, что статус собеседника не равен true
     * @param abonent
     */
    public synchronized void dialUp(Abonent abonent){
        System.out.println("Набираем "+abonent.name);
        //пробуем сделать абонента инциатором
        initiatorState.setInitiator(this);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //если наш собеседник не является инициатором, запускаем у его телефона мелодию звонка
        if(!abonent.isInitiator()) {
            abonent.ringPhone(abonent);
        }

    }

    /**
     * Проверяет, является ли абонент инициатором
     * @return true, если является
     */
    public boolean isInitiator(){
        return this.equals(initiatorState.getInitiator());
    }

    @Override
    public boolean equals(Object obj) {
        Abonent abonent = (Abonent)obj;
        return name.equals(abonent.name);
    }
}
