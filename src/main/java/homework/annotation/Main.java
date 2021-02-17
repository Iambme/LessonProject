package homework.annotation;


import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomClassLoader customClassLoader = new CustomClassLoader();
        List<Class> list = customClassLoader.loadClasses("D:\\JavaProj\\classes");
        System.out.println(list);
    }
}