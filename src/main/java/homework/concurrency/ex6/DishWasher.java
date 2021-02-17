package homework.concurrency.ex6;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DishWasher {
    private Stack<Plate> plates;
    private boolean endWash = false;

    public DishWasher() {
        plates = new Stack<>();
    }

    public Stack<Plate> getPlates() {
        return plates;
    }

    public void addPlate(Plate plate) {
        plates.push(plate);
    }

    public void startWash() throws InterruptedException {

        while (!plates.isEmpty()) {
            Thread.sleep(1000);
            System.out.println(plates.pop().toString() + " помыта");

        }
        System.out.println("Все тарелки помыты");
        endWash = true;
    }
    public  boolean endWash(){
        return endWash;
    }
}
