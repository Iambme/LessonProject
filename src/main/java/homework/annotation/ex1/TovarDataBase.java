package homework.annotation.ex1;

import java.util.ArrayList;
import java.util.List;
@DBPath(path = "src\\main\\java\\homework\\annotation\\ex1\\dataBase.txt")
public class TovarDataBase {
    private List<Tovar> tovarList;

    public TovarDataBase() {
        tovarList = new ArrayList<>();
    }

    public List<Tovar> getTovarList() {
        return tovarList;
    }
    public void add(Tovar tovar){
        tovarList.add(tovar);
    }

    @Override
    public String toString() {
        return "TovarDataBase{" +
                "tovarList=" + tovarList +
                '}';
    }
}
