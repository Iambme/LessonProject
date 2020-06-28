package homework.serializable;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public  class Service {

    public void go() throws IOException, ClassNotFoundException {
//?????????????? Вынести в отдельные методы наиболее часто используемые операции
//???? Сократить длинные вызовы в коде
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = "D:\\JavaProj\\LessonProject\\src\\homework\\serializable\\serialize.txt";

        Student student1 = new Student("Student1", "FatherName1", new Subject("Math", 4), new Subject("English", 3));
        Student student2 = new Student("Student2", "FatherName2", new Subject("Math", 5), new Subject("English", 5));
        Student student3 = new Student("Student3", "FatherName3", new Subject("Math", 3), new Subject("English", 4));
        Student student4 = new Student("Student4", "FatherName4", new Subject("Math", 3), new Subject("English", 3));
        Student student5 = new Student("Student5", "FatherName5", new Subject("Math", 5), new Subject("English", 3));
        Student student6 = new Student("Student6", "FatherName6", new Subject("Math", 4), new Subject("English", 4));
        Student student7 = new Student("Student7", "FatherName7", new Subject("Math", 3), new Subject("English", 3));
        Student student8 = new Student("Student8", "FatherName8", new Subject("Math", 5), new Subject("English", 3));

        University mgu = new University("MGU", student1, student2, student3, student4);
        University rudn = new University("RUDN", student7, student6, student5, student8);

        City moscow = new City("Moscow", mgu, rudn);

        Army army = new Army(new GregorianCalendar(2020, Calendar.SEPTEMBER, 15));

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            moscow = (City) ois.readObject();
            army = (Army) ois.readObject();
            ois.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        boolean isOver = false;

        while (!isOver) {
            System.out.println("\n");
            System.out.println("Выберите действие :");
            System.out.println("1.Вывести всех студентов из университета");
            System.out.println("2.Посчитать средний балл студентов в университете");
            System.out.println("3.Найти лучший университет ");
            System.out.println("4.Отчислить студента из университета");
            System.out.println("5.Отчислить студентов из университета по среднему баллу");
            System.out.println("6.Перевести студента из одного университета в другой ");
            System.out.println("7.Вывести студентов, попавших под призыв");
            System.out.println("8.Сохранить текущие данные в файл");
            System.out.println("9.Выход");

            int userInput = Integer.parseInt(reader.readLine());
            switch (userInput) {

                case 1: {
                    System.out.println("Введите название университета");
                    String universityInput = reader.readLine();
                    int index = moscow.getUniversities().indexOf(new University(universityInput));
                    if(index!=-1){
                        System.out.println(moscow.getUniversities().get(index).getStudents());
                    }else{
                        System.out.println("Вы ввели некорректное название университета");
                    }
//                    for (University u : moscow.getUniversities()) {
//                        if (u.getName().equals(universityInput)) {
//                            System.out.println(u.getStudents());
//                        }
//                    }

                }
                break;
                case 2: {
                    System.out.println("Введите название университета");
                    String universityInput = reader.readLine();
                    for (University u : moscow.getUniversities()) {
                        if (u.getName().equals(universityInput)) {
                            System.out.println(u.averageMark());
                        }
                    }

                }
                break;
                case 3: {
                    University bestUniversity = moscow.getUniversities().get(0);
                    for (int i = 0; i < moscow.getUniversities().size(); i++) {
                        if (bestUniversity.averageMark() < moscow.getUniversities().get(i).averageMark()) {
                            bestUniversity = moscow.getUniversities().get(i);
                        }
                    }
                    System.out.println(bestUniversity.getName());
                }
                break;

                case 4: {
                    System.out.println("Имя студента на отчисление");
                    String nameInput = reader.readLine();
                    System.out.println("Фамилия студента");
                    String fatherNameInput = reader.readLine();
                    System.out.println("Университет");
                    Student studentForRemove = new Student(nameInput, fatherNameInput);
                    String universityInput = reader.readLine();

//                    for (int i = 0; i < moscow.getUniversities().size(); i++) {
//                        if (moscow.getUniversities().get(i).getName().equals(universityInput)) {
//                            for (int j = 0; j < moscow.getUniversities().get(i).getStudents().size(); j++) {
//                                if (moscow.getUniversities().get(i).getStudents().get(j).getFirstName().equals(nameInput) &&
//                                        moscow.getUniversities().get(i).getStudents().get(j).getFatherName().equals(fatherNameInput)) {
//                                    army.add(moscow.getUniversities().get(i).getStudents().get(j));
//                                    moscow.getUniversities().get(i).getStudents().remove(j);
//                                }
//                            }
//                        }
//                    }

                    int index = moscow.getUniversities().indexOf(new University(universityInput));
                    if(index!=-1){
                        University university = moscow.getUniversityByIndex(index);
                        if(university.getStudents().remove(studentForRemove)){
                            army.add(studentForRemove);
                        }
                    }

                }
                break;

                case 5: {
                    System.out.println("Университет");
                    String universityInput = reader.readLine();

                    for (int i = 0; i < moscow.getUniversities().size(); i++) {
                        if (moscow.getUniversityByIndex(i).getName().equals(universityInput)) {
                            for (int j = 0; j < moscow.getUniversities().get(i).getStudents().size(); j++) {
                                if (moscow.getUniversities().get(i).getStudents().get(j).averageMark() < 3.5) {
                                    army.add(moscow.getUniversities().get(i).getStudents().get(j));
                                    moscow.getUniversities().get(i).getStudents().remove(j);
                                }
                            }
                        }
                    }
                }



                break;
                case 6: {
                    System.out.println("Университет, откуда осуществляется перевод");
                    String universityFromInput = reader.readLine();
                    System.out.println("Университет, куда осуществляется перевод");
                    String universityToInput = reader.readLine();
                    System.out.println("Имя студента на отчисление");
                    String nameInput = reader.readLine();
                    System.out.println("Фамилия студента");
                    String fatherNameInput = reader.readLine();
                    University university = null;

                    for (int i = 0; i < moscow.getUniversities().size(); i++) {
                        if (moscow.getUniversities().get(i).getName().equals(universityToInput)) {

                            university = moscow.getUniversities().get(i);
                        }
                    }

                    for (int i = 0; i < moscow.getUniversities().size(); i++) {
                        if (moscow.getUniversities().get(i).getName().equals(universityFromInput)) {
                            for (int j = 0; j < moscow.getUniversities().get(i).getStudents().size(); j++) {
                                if (moscow.getUniversities().get(i).getStudents().get(j).getFirstName().equals(nameInput) &&
                                        moscow.getUniversities().get(i).getStudents().get(j).getFatherName().equals(fatherNameInput)) {
                                    if (university != null) {
                                        university.getStudents().add(moscow.getUniversities().get(i).getStudents().get(j));
                                        moscow.getUniversities().get(i).getStudents().remove(j);
                                    }
                                }
                            }
                        }
                    }
                }
                break;
                case 7: {
                    if (army.getStudents() != null) {
                        System.out.println(army.getStudents());
                    }

                }
                case 8: {
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
                    oos.writeObject(moscow);
                    oos.writeObject(army);
                    oos.close();

                }
                break;
                case 9:
                    isOver = true;
                    break;
            }
        }
    }
}
