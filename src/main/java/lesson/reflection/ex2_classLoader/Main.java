package lesson.reflection.ex2_classLoader;

import lesson.annotation.Car;

import java.lang.reflect.Field;
import java.net.URLClassLoader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws  Exception{
        CustomClassLoader customClassLoader = new CustomClassLoader();
        List<Class> list = customClassLoader.loadClasses("D:\\JavaProj\\classes");
        System.out.println(list);

        Class carClass = list.get(0);
        Object car = carClass.getDeclaredConstructor(int.class, String.class).newInstance(10, "BMW");
        System.out.println(car);

//        System.out.println(Car.class.getClassLoader());
//        System.out.println(carClass.getClassLoader());


//        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
//        Class carClazz = classLoader.loadClass(Car.class.getName());
////        Class carClazz = classLoader.loadClass("lesson.annotation.Car");
//        Field[] fields = carClazz.getDeclaredFields();
//        for(Field field : fields){
//            System.out.println(field);
//        }

    }
}
