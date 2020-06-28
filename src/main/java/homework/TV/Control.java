package homework.TV;

public class Control {
    public void power(Tv tv){
        if(!tv.isWork()) {
            tv.setWork(true);
            System.out.println("TV is on! Вы смотрите " + tv.getCurrentChannel().getName());
        }
        else {
            tv.setWork(false);
            System.out.println("TV is off!");
        }
    }
    public void switchNextChannel(Tv tv){
        if(!tv.isWork()){
            System.out.println("Телевизор выключен");
            return;
        }
        int order =tv.getCurrentChannel().getOrder();

        if(order+1 ==11){
            order = 1;
        }
        else {
            order ++;
        }
        //tv.setCurrentChannel(Channels.ONE.getChannel(order));
        tv.setCurrentChannel(ChannelService.getChannel(order));
        System.out.println("Переключение на следующий канал. Вы смотрите канал " + Channels.ONE.getChannel(order).getName());

    }
    public void switchPrevChannel(Tv tv){
        if(!tv.isWork()){
            System.out.println("Телевизор выключен");
            return;
        }
        int order =tv.getCurrentChannel().getOrder();

        if(order-1 ==0){
             order = 10;
        }
        else {
            order --;
        }
        tv.setCurrentChannel(Channels.ONE.getChannel(order));
        System.out.println("Переключение на предыдущий канал. Вы смотрите канал " + Channels.ONE.getChannel(order).getName());

    }
    public void setChannel(Tv tv , int userInput){
        if(!tv.isWork()){
            System.out.println("Телевизор выключен");
            return;
        }

        tv.setCurrentChannel(Channels.ONE.getChannel(userInput));
        System.out.println("Вы смотрите канал " + Channels.ONE.getChannel(userInput).getName());


    }


}
