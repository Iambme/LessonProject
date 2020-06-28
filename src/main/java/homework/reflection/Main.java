package homework.reflection;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<Service> serviceClass = Service.class;
        Service service = serviceClass.getDeclaredConstructor().newInstance();
        Method method = serviceClass.getDeclaredMethod("go");
        method.invoke(service);
    }
}
