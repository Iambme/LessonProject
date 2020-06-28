package homework.serializable;

import java.io.Serializable;
import java.util.*;

public class Army implements Serializable {
   private Calendar priziv;
   private List<Student> students;
    private final static int serialVersionUID = 1;

    public Army(Calendar priziv) {
        this.priziv = priziv;
        students = new ArrayList<>();

    }

    public Calendar getPriziv() {
        return priziv;
    }

    public void setPriziv(Calendar priziv) {
        this.priziv = priziv;
    }

    //??????????? убрать
    public List<Student> getStudents() {
        return students;
    }
    public void add(Student...student){
        students.addAll(Arrays.asList(student));
    }
}
