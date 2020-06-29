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

//        Order order = new Order();
//        Class<Order> clazz = Order.class;
//        Method method1 = clazz.getDeclaredMethod("add", Dish[].class);
//        Method[] met = clazz.getDeclaredMethods();
//        for(Method m : met){
//            System.out.println(m);
//        }
//        Dish[] arr = new Dish[]{new Dish("Dish1", 100), new Dish("Dish1", 100)};
//        method1.invoke(order, (Object)arr);




    }
}
