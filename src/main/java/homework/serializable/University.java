package homework.serializable;

import java.io.Serializable;
import java.util.*;

public class University implements Serializable {
    private String name;
    private List<Student> students;
    private final static int serialVersionUID = 1;

    public University(String name, Student... student) {
        this.name = name;
        students = new ArrayList<>();
        students.addAll(Arrays.asList(student));

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //??????????? убрать
    public List<Student> getStudents() {
        return students;
    }
    public double averageMark(){
        double sum=0 ;
        int count = 0;
        for (Student st:students) {
          sum += st.averageMark();

        }

        return sum/students.size();
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }




}
