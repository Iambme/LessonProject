package homework.sql.ex2;

public class Main {
    public static void main(String[] args) {
        //Многие ко многим:
        //select t.name, s.name from lesson.teacher t, lesson.student s, lesson.student_teacher st
        //        where t.id = 1 and st.teacher_id = t.id and s.id = st.student_id


        //через join:
        //select t.name, s.name from lesson.teacher t join lesson.student_teacher st on t.id = st.teacher_id
        // join lesson.student s on s.id = st.student_id where t.id = 1
    }
}
