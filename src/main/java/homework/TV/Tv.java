package homework.TV;

public class Tv {
    private boolean isWork;
    private Channels currentChannel;

    public Tv() {
        this.isWork = false;
        this.currentChannel = Channels.ONE;
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }

    public Channels getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(Channels currentChannel) {
        if (isWork) {
            this.currentChannel = currentChannel;
        }
    }
}
