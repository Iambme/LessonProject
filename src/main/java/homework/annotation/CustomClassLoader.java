package homework.annotation;

import lesson.annotation.TovarType;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class CustomClassLoader extends ClassLoader{
    public List<Class> loadClasses(String name) throws Exception {
        File[] arrFiles = new File(name).listFiles();
        List<Class> classList = new ArrayList<>();
        for (File arrFile : arrFiles) {
            Class clazz = findClass(arrFile.getAbsolutePath());
            if (clazz != null) {
                if (clazz.getAnnotation(SocialProfile.class) != null) {
                    classList.add(clazz);
                }
            }
        }
        return classList;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        File file = new File(name);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file.getAbsolutePath());
            byte[] arr = new byte[(int)file.length()];
            fis.read(arr);
            return defineClass(null, arr, 0, arr.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
