import lesson.junit.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StudentTest {
    Student student = new Student();

    @Before
    public void init(){
        student.add(2,4,5,3);
    }

    @Test
    public void testGetMax(){
        assertEquals(5,student.getMax());
    }

    @Test
    public void testGetAverage(){
        assertEquals(3.5,student.getAverage(),0);
    }

    //Проверка на ожидаемый exception
    @Test(expected = IllegalArgumentException.class)
    public void testGetAverageWithNoMark(){
        student.clear();
        student.getAverage();
    }

    //Второй вариант проверки на ожидаемый exception
    @Test
    public void testGetAverageWithNoMarkVer2(){
        student.clear();
        try {
            student.getAverage();
            fail();
        }catch(Exception e){
            assertEquals(2,2);
        }
    }





    @After
    public void exit(){
        System.out.println("end");
    }
}
