package lesson.annotation;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        Class<Car> carClass = Car.class;
        List tovars = new ArrayList();
        Class[] arr = {Brick.class, Car.class, Phone.class};




        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isAnnotationPresent(TovarType.class)) {

                Annotation annotation = arr[i].getAnnotation(TovarType.class);
                if(annotation!=null) {
                    TovarType tovarType = (TovarType)annotation;
                    Object obj = arr[i].getDeclaredConstructor(int.class, String.class).newInstance(10, tovarType.typeName());
                    tovars.add(obj);
                }
            }
        }

        for(Object ob : tovars){
            System.out.println(ob);
        }

    }
}
