//package lesson.hibernate;
//
//import lesson.hibernate.ex2_one_to_one.Human;
//import lesson.hibernate.ex2_one_to_one.HumanPassport;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//import java.util.Properties;
//
//public class HibernateUtil {
//    private static SessionFactory sessionFactory;
//    public static SessionFactory createSessionFactory() throws Exception {
//        if(sessionFactory == null || sessionFactory.isClosed()){
//            Properties properties = new Properties();
//            properties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("hibernate.properties"));
//            Configuration configuration = new Configuration();
//            configuration.addProperties(properties);
//            configuration.addAnnotatedClass(Book.class);
//            configuration.addAnnotatedClass(Human.class);
//            configuration.addAnnotatedClass(HumanPassport.class);
//
//            sessionFactory = configuration.buildSessionFactory();
//        }
//        return sessionFactory;
//    }
//}
