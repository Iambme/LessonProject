package homework.TV;

public enum Channels {
    ONE(1,"Первый"),TWO(2,"РТР"),THREE(3,"ТВ-3"),FOUR(4,"НТВ"),FIVE(5,"Культура"),SIX(6,"ТВ-6"),SEVEN(7,"Домашний"),EIGHT(8,"СТС"),NINE(9,"РЕН-ТВ"),TEN(10,"МТВ");
    private String name;
    private int order;
//    private Channels SWITCH_NEXT;
//    private Channels SWITCH_PREV;

    Channels(int order,String name) {
        this.order = order;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public Channels getChannel(int order) {
        switch (order){
            case 1: return Channels.ONE;
            case 2: return Channels.TWO;
            case 3: return Channels.THREE;
            case 4: return Channels.FOUR;
            case 5: return Channels.FIVE;
            case 6: return Channels.SIX;
            case 7: return Channels.SEVEN;
            case 8: return Channels.EIGHT;
            case 9: return Channels.NINE;
            case 10: return Channels.TEN;
        }
        throw new IndexOutOfBoundsException("Данный канал не настроен");
    }
}
