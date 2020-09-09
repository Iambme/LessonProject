package homework.hibernate;

import homework.hibernate.ex1.Driver;
import homework.hibernate.ex1.License;
import homework.hibernate.ex2.House;
import homework.hibernate.ex2.HouseOwner;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory createSessionFactory() throws Exception {
        if (sessionFactory == null || sessionFactory.isClosed()) {
            Properties properties = new Properties();
            properties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("hibernate.properties"));
            Configuration configuration = new Configuration();
            configuration.addProperties(properties);
            configuration.addAnnotatedClass(Driver.class);
            configuration.addAnnotatedClass(License.class);
            configuration.addAnnotatedClass(HouseOwner.class);
            configuration.addAnnotatedClass(House.class);

            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }
}