package homework.reflection;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static org.junit.Assert.assertEquals;


public class ServiceTest {
    Map<Client, Order> map = new HashMap<>();
    Class<Service> serviceClass = Service.class;
    Service service = serviceClass.getDeclaredConstructor().newInstance();
    Method sumOfPrice = serviceClass.getDeclaredMethod("sumOfPrice", Map.class, Client.class);
    Method createDish = serviceClass.getDeclaredMethod("createDish", int.class);


    Class<Client> clientClass = Client.class;
    Client client = (Client) clientClass.getDeclaredConstructor(String.class).newInstance("TestClient");

    Class<Order> orderClass = Order.class;
    Order order = (Order) orderClass.getDeclaredConstructor().newInstance();

    Class<Dish> dishClass = Dish.class;
    Dish dish = (Dish) dishClass.getDeclaredConstructor(String.class, int.class).newInstance("Суп с фрикадельками", 50);
    Dish dish1 = (Dish) dishClass.getDeclaredConstructor(String.class, int.class).newInstance("Компот", 20);

    Method add = orderClass.getDeclaredMethod("add", Dish.class);


    public ServiceTest() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
    }

    @Before
    public void init() throws Exception {
        add.setAccessible(true);
        add.invoke(order, dish);
        add.invoke(order, dish1);
        sumOfPrice.setAccessible(true);
        map.put(client, order);
        createDish.setAccessible(true);
    }

    @Test
    public void sumOfPriceTest() throws InvocationTargetException, IllegalAccessException {
        assertEquals(70, sumOfPrice.invoke(service, map, client));
    }

    @Test(expected = IllegalArgumentException.class)
    public void createDishTest() throws InvocationTargetException, IllegalAccessException {
        Random random = new Random(4);
        createDish.invoke(service, random);
    }

}
