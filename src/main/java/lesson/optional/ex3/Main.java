package lesson.optional.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        getStudent(3).stream() //Stream<List<Student>>
                .flatMap(list->list.stream()) //Stream<List<Student>> -> Stream<Student>
                .forEach(System.out::println);

        Optional<String> op1 = Optional.ofNullable("10");
        Optional<Integer> op2 = op1.map(Integer::parseInt);
        op2.ifPresent(System.out::println);
        //Если Optional содержит строку приветствия, то достать из строки имя
        Optional<String> greeting = Optional.of("hello, Ivan");
        Optional<String> name = greeting
                .filter(val->val.contains("hello, "))
                .map(val->val.replaceAll("[a-z ]+, ", ""));
        name.ifPresent(System.out::println);


    }

    //Метод генерирует рандомный список студентов и возвращает список тех, чей средний балл больше averageMark
    public static Optional<List<Student>> getStudent(double averageMark){
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Student("Student"+i, ((int)(Math.random()*5))+1));
        }

        List<Student> resultList =list.stream()
                .filter(st->st.averageMark>averageMark)
                .collect(Collectors.toList());
        return resultList.size()==0? Optional.empty(): Optional.of(resultList);
    }
}


class Student{
    String name;
    double averageMark;

    public Student(String name, double averageMark) {
        this.name = name;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}


