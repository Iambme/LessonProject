package lesson.muiltithread.ex3_callable.ex3;

public class TV {

   private boolean isFixed;
    private static int count;
    private int id;

    public TV() {

        this.isFixed = false;
        id = ++count;
    }



    public boolean isFixed() {
        return isFixed;
    }

    public void setFixed(boolean fixed) {
        isFixed = fixed;
    }

    public int getId() {
        return id;
    }
}
