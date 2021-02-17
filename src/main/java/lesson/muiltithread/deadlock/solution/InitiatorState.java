package lesson.muiltithread.deadlock.solution;

public class InitiatorState {
    //инициатор вызова
    private Abonent initiator;

    public Abonent getInitiator() {
        return initiator;
    }

    /**
     * Сохраняет инициатора вызова только один раз - того, кто первый начал звонить.
     * @param initiator
     */
    public synchronized void setInitiator(Abonent initiator) {
        if(this.initiator==null) {
            this.initiator = initiator;
        }
    }

}
