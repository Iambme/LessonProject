package lesson.reflection.ex1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException, MalformedURLException, NoSuchFieldException {
        Class clazz = Tovar.class;
        //Инфа о конструкторах
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            System.out.println(constructor);
        }
        System.out.println();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field);
        }
        System.out.println();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method meth: methods) {
            System.out.println(meth);
        }

        System.out.println();
        //Создать объект через рефлексию
        //Создадим объект на основе пустого констурктора
        Tovar tovar = (Tovar)clazz.getDeclaredConstructor().newInstance();
        System.out.println(tovar);

        //Создадим объект через конструктор с параметрами
        Tovar tovar2 = (Tovar)clazz.getDeclaredConstructor(String.class, int.class).newInstance("Tovar1", 100);
        System.out.println(tovar2);

        System.out.println();
        //Второй способ получения описания класса
        //Class clazz2 = Class.forName("lesson.reflection.ex1.Tovar");
        System.out.println(Tovar.class.getName()); //Выведен название класа в полном виде
        Class clazz2 = Class.forName(Tovar.class.getName());
        Tovar tovar3 = (Tovar)clazz2.getDeclaredConstructor(String.class, int.class).newInstance("Tovar1", 100);
        System.out.println(tovar3);



        //Загружка класса за пределами проекта
//        System.out.println();
//
//        File file = new File("C:\\Users\\EdliB\\Desktop\\Tovar.class");
//
//        //convert the file to URL format
//        URL url = file.toURI().toURL();
//        URL[] urls = new URL[]{url};
//
//        //load this folder into Class loader
//        ClassLoader cl = new URLClassLoader(urls);
//
//
//
//        //load the Address class in 'c:\\other_classes\\'
//        Class  cls = cl.loadClass("lesson.reflection.ex1.Tovar");
//        Tovar myClass = (Tovar)cls.getDeclaredConstructor().newInstance();
//        System.out.println(myClass);



        //Создать два объекта класса Tovar
        Class clazz3 =Class.forName(Tovar.class.getName());
        Tovar apple = (Tovar) clazz3.getDeclaredConstructor(String.class, int.class).newInstance("Apple",250);
        Tovar orange = (Tovar) clazz3.getDeclaredConstructor(String.class, int.class).newInstance("Orange",150);

        //изменить цену на 350 у apple
        Field field = clazz3.getDeclaredField("price");
        field.setAccessible(true);
        field.set(apple, 350);
        System.out.println(apple);

        //Вызвать getPrice у orange
        Method method = clazz3.getDeclaredMethod("getPrice");
        System.out.println(method.invoke(orange));

        //Вызвать setPrice у orange и getPrice
        Method method1 = clazz3.getDeclaredMethod("setPrice",int.class);
        method1.invoke(orange,400);
        System.out.println(method.invoke(orange));




    }
}
