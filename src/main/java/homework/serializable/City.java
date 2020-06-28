package homework.serializable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class City implements Serializable {
    private String name;
    private List<University> universities;
    private final static int serialVersionUID = 1;

    public City(String name,University ... university) {
        this.name = name;
        universities = new ArrayList<>();
        universities.addAll(Arrays.asList(university));
    }

    public University getUniversityByIndex(int index){
        return universities.get(index);
    }

    public int universityCount(){
        return universities.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //??????????? убрать
    public List<University> getUniversities() {
        return universities;
    }
}
