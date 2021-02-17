package homework.data;

import java.util.ArrayList;
import java.util.Date;

public class PresidentDataBase {
private ArrayList<President> presidents;

    public PresidentDataBase() {
        this.presidents = new ArrayList<>();
    }

    public ArrayList<President> getPresidents() {
        return presidents;
    }
    public void addPres(President president){
        presidents.add(president);
    }

    @Override
    public String toString() {
        return "PresidentDataBase{" +
                "presidents=" + presidents +
                '}';
    }
}
