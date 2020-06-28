package homework.serializable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Student implements Serializable {
    private String firstName;
    private String fatherName;
    private final static int serialVersionUID = 1;

    List<Subject> subjectList = new ArrayList<>(); //?????????????? сделать private

    public Student(String firstName, String fatherName, Subject... subjects) {
        this.firstName = firstName;
        this.fatherName = fatherName;
        subjectList.addAll(Arrays.asList(subjects));
    }

    public Student(String firstName, String fatherName) {
        this.firstName = firstName;
        this.fatherName = fatherName;
    }

    //???????????
    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public double averageMark(){
        double sum=0 ;
        for (Subject s: subjectList) {
            sum+=s.getMark();
        }
        return sum/subjectList.size();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(fatherName, student.fatherName);
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }
}
