package lesson.json;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sklad{
    public String adress;
    public List<Tovar> tovars = Arrays.asList(new Tovar("Tovar1", 100), new Tovar("Tovar2", 200));


    public Sklad(){}

    public Sklad(String adress, ArrayList<Tovar> tovars) {
        this.adress = adress;
        this.tovars = tovars;
    }

    @Override
    public String toString() {
        return "Sklad{" +
                "adress='" + adress + '\'' +
                ", tovars=" + tovars +
                '}';
    }
}