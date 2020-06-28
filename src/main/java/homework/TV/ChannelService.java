package homework.TV;

public class ChannelService {

    public static  Channels getChannel(int order) {
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
