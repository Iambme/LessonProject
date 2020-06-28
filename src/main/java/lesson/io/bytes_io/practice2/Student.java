package lesson.io.bytes_io.practice2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student implements Serializable {
    String name;
    List<Subject> subjectList = new ArrayList<>();



    public Student(String name, Subject...subjects) {
        this.name = name;
        subjectList.addAll(Arrays.asList(subjects));
    }

    public void addSubject(Subject subject){
        subjectList.add(subject);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }
}
